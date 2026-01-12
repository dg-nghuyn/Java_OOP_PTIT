/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th4_code_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class SinhVien implements Comparable<SinhVien> {

    String ma, ten, sdt;
    int soNhom;

    public SinhVien(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }

    public void setSoNhom(int soNhom) {
        this.soNhom = soNhom;
    }

    public int getSoNhom() {
        return soNhom;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }

    public String toString(String tenBaiTap) {
        return this.ma + " " + this.ten + " " + this.sdt + " " + this.soNhom + " " + tenBaiTap;
    }
}

public class Problem3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner svScanner = new Scanner(new File("SINHVIEN.in"));
        Scanner btScanner = new Scanner(new File("BAITAP.in"));
        Scanner nhomScanner = new Scanner(new File("NHOM.in"));

        Map<String, SinhVien> mapSV = new HashMap<>();

        int N = Integer.parseInt(svScanner.nextLine());
        for (int i = 0; i < N; i++) {
            String ma = svScanner.nextLine();
            String ten = svScanner.nextLine();
            String sdt = svScanner.nextLine();
            mapSV.put(ma, new SinhVien(ma, ten, sdt));
        }
        svScanner.close();

        ArrayList<String> dsBaiTap = new ArrayList<>();
        int M = Integer.parseInt(btScanner.nextLine());
        for (int i = 0; i < M; i++) {
            dsBaiTap.add(btScanner.nextLine());
        }
        btScanner.close();

        for (int i = 0; i < N; i++) {
            String maSV = nhomScanner.next();
            int soNhom = nhomScanner.nextInt();

            if (mapSV.containsKey(maSV)) {
                mapSV.get(maSV).setSoNhom(soNhom);
            }
        }
        nhomScanner.close();

        ArrayList<SinhVien> finalList = new ArrayList<>(mapSV.values());
        Collections.sort(finalList);

        for (SinhVien sv : finalList) {
            String tenBT = dsBaiTap.get(sv.getSoNhom() - 1);

            System.out.println(sv.toString(tenBT));
        }
    }
}
