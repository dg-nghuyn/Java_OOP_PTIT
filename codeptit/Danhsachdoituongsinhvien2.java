/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
final class Sinhvien {

    private String masinhvien, hoten, lop, ngaysinh;
    private double diemgpa;

    public Sinhvien(int sothutu, String hoten, String lop, String ngaysinh, double diemgpa) {
        this.masinhvien = "B20DCCN" + String.format("%03d", sothutu + 1);
        this.hoten = chuanhoaht(hoten);
        this.lop = lop;
        this.ngaysinh = chuanhoans(ngaysinh);
        this.diemgpa = diemgpa;
    }

    public String chuanhoans(String ngaysinh) {
        ngaysinh = ngaysinh.trim();
        String[] tmp = ngaysinh.split("/");
        String ngay = tmp[0];
        String thang = tmp[1];
        String nam = tmp[2];

        if (ngay.length() == 1) {
            ngay = "0" + ngay;
        }
        if (thang.length() == 1) {
            thang = "0" + thang;
        }
        return ngay + "/" + thang + "/" + nam;
    }
    
    public String chuanhoaht(String s) {
        s = s.trim().toLowerCase();
        String [] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            String a = String.valueOf(x.charAt(0)).toUpperCase();
            res.append(a);
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString();
    }

    @Override
    public String toString() {
        return masinhvien + " " + hoten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", diemgpa); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

public class Danhsachdoituongsinhvien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinhvien> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String ht = sc.nextLine();
            String l = sc.nextLine();
            String ns = sc.nextLine();
            double gpa = sc.nextDouble();
            sc.nextLine();

            list.add(i, new Sinhvien(i, ht, l, ns, gpa));
        }

        for (int i = 0; i < N; i++) {
            System.out.println(list.get(i));
        }
    }
}
