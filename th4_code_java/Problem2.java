/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th4_code_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class SanPham {

    String ma, ten;
    long gia1, gia2;

    public SanPham(String ma, String ten, long gia1, long gia2) {
        this.ma = ma;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
}

class HoaDon {

    String maFull, tenSP;
    long giamGia, phaiTra;

    public HoaDon(int stt, String maGoc, int soLuong, SanPham sp) {
        this.tenSP = sp.ten;
        this.maFull = maGoc + "-" + String.format("%03d", stt);

        char loai = maGoc.charAt(2);
        long donGia;
        if (loai == '1') {
            donGia = sp.gia1;
        } else {
            donGia = sp.gia2;
        }

        long thanhTien = donGia * soLuong;

        if (soLuong >= 150) {
            this.giamGia = Math.round(0.5 * thanhTien);
        } else if (soLuong >= 100) {
            this.giamGia = Math.round(0.3 * thanhTien);
        } else if (soLuong >= 50) {
            this.giamGia = Math.round(0.15 * thanhTien);
        } else {
            this.giamGia = 0;
        }

        this.phaiTra = thanhTien - this.giamGia;
    }

    @Override
    public String toString() {
        return maFull + " " + tenSP + " " + giamGia + " " + phaiTra;
    }
}

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, SanPham> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long g1 = Long.parseLong(sc.nextLine());
            long g2 = Long.parseLong(sc.nextLine());
            SanPham sp = new SanPham(ma, ten, g1, g2);
            map.put(ma, sp);
        }

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] line = sc.nextLine().split(" ");
            String maGoc = line[0];
            int soLuong = Integer.parseInt(line[1]);

            String maSP = maGoc.substring(0, 2);
            SanPham sp = map.get(maSP);

            HoaDon hd = new HoaDon(i + 1, maGoc, soLuong, sp);
            list.add(hd);
        }

        for (HoaDon hd : list) {
            System.out.println(hd);
        }
    }
}
