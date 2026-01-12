/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Sinhvien {

    private String msv, hoten, sdt;
    private int nhom;

    public Sinhvien(String msv, String hoten, String sdt, int nhom) {
        this.msv = msv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public int getNhom() {
        return nhom;
    }

    @Override
    public String toString() {
        return msv + " " + hoten + " " + sdt;
    }

}

class Baitap {

    private int nhom;
    private String tenbai;

    public Baitap(int nhom, String tenbai) {
        this.nhom = nhom;
        this.tenbai = tenbai;
    }

    public int getNhom() {
        return nhom;
    }

    public String getTenbai() {
        return tenbai;
    }

    @Override
    public String toString() {
        return "Bai tap dang ky: " + tenbai;
    }

}

public class Quanlybaitapnhom1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        ArrayList<Sinhvien> list1 = new ArrayList<>();
        ArrayList<Baitap> list2 = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list1.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }

        for (int i = 1; i <= M; i++) {
            list2.add(new Baitap(i, sc.nextLine()));
        }

        int Q = Integer.parseInt(sc.nextLine());
        while (Q-- > 0) {
            int q = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + q + ": ");
            for (Sinhvien x : list1) {
                if (x.getNhom() == q) {
                    System.out.println(x);
                }
            }
            for (Baitap y : list2) {
                if (y.getNhom() == q) {
                    System.out.println(y);
                }
            }
        }
    }
}
