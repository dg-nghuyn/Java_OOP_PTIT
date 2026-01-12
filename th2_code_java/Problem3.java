/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th2_code_java;

import java.util.*;

class MatHang implements Comparable<MatHang> {
    private String ma, ten, donVi;
    private int donGia, soLuong, phi, thanhTien, giaBanLe;

    public MatHang(String ma, String ten, String donVi, int donGia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;

        this.phi = (int) Math.round(donGia * soLuong * 0.05);
        this.thanhTien = donGia * soLuong + phi;

        double gia = (thanhTien * 1.02) / soLuong;
        this.giaBanLe = (int) (Math.ceil(gia / 100) * 100);
    }

    public int getGiaBanLe() {
        return giaBanLe;
    }

    @Override
    public int compareTo(MatHang o) {
        return Integer.compare(o.giaBanLe, this.giaBanLe);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + phi + " " + thanhTien + " " + giaBanLe;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ma = String.format("MH%02d", i);
            String ten = sc.nextLine().trim();
            String donVi = sc.nextLine().trim();
            int donGia = Integer.parseInt(sc.nextLine().trim());
            int soLuong = Integer.parseInt(sc.nextLine().trim());

            ds.add(new MatHang(ma, ten, donVi, donGia, soLuong));
        }

        Collections.sort(ds);

        for (MatHang mh : ds) {
            System.out.println(mh);
        }
    }
}
