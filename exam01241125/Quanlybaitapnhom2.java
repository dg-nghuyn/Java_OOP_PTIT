/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam01241125;

/**
 *
 * @author Admin
 */
import java.util.*;

class SinhVien {
    private String ma, ten, sdt;
    private int nhom;

    public SinhVien(String ma, String ten, String sdt, int nhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String getMa() {
        return ma;
    }

    public int getNhom() {
        return nhom;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt + " " + nhom;
    }
}

public class Quanlybaitapnhom2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        ArrayList<SinhVien> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String sdt = sc.nextLine().trim();
            int nhom = Integer.parseInt(sc.nextLine().trim());
            list.add(new SinhVien(ma, ten, sdt, nhom));
        }

        String[] baitap = new String[M + 1];
        for (int i = 1; i <= M; i++) {
            baitap[i] = sc.nextLine().trim();
        }

        list.sort((a, b) -> a.getMa().compareTo(b.getMa()));

        for (SinhVien sv : list) {
            System.out.println(sv + " " + baitap[sv.getNhom()]);
        }
    }
}
