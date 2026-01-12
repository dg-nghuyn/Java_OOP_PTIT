/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th3_code_java;

/**
 *
 * @author Admin
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Admin
 */
class SanPham {
    private String maLoai, ten;
    private long gia1, gia2;

    public SanPham(String maLoai, String ten, long gia1, long gia2) {
        this.maLoai = maLoai;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public String getTen() {
        return ten;
    }

    public long getGia(int loai) {
        if (loai == 1) return gia1;
        return gia2;
    }
}

class HoaDon {
    private String maHD, tenSP;
    private long giamGia, thanhTien;

    public HoaDon(String ma, int stt, int soLuong, SanPham sp, int loai) {
        this.maHD = ma + "-" + String.format("%03d", stt);
        this.tenSP = sp.getTen();
        long donGia = sp.getGia(loai);
        long tien = donGia * soLuong;
        
        if (soLuong >= 150) giamGia = tien * 50 / 100;
        else if (soLuong >= 100) giamGia = tien * 30 / 100;
        else if (soLuong >= 50) giamGia = tien * 15 / 100;
        else giamGia = 0;
        
        thanhTien = tien - giamGia;
    }

    @Override
    public String toString() {
        return maHD + " " + tenSP + " " + giamGia + " " + thanhTien;
    }
}

public class Problem5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("D:\\CODE\\Java\\Code_Java\\src\\th3_code_java\\DATA1.in"));
        int n = Integer.parseInt(sc1.nextLine().trim());
        ArrayList<SanPham> listSP = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc1.nextLine().trim();
            String ten = sc1.nextLine().trim();
            long g1 = Long.parseLong(sc1.nextLine().trim());
            long g2 = Long.parseLong(sc1.nextLine().trim());
            listSP.add(new SanPham(ma, ten, g1, g2));
        }

        Scanner sc2 = new Scanner(new File("D:\\CODE\\Java\\Code_Java\\src\\th3_code_java\\DATA2.in"));
        int m = Integer.parseInt(sc2.nextLine().trim());
        ArrayList<HoaDon> listHD = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            String[] arr = sc2.nextLine().trim().split("\\s+");
            String ma = arr[0];
            int soLuong = Integer.parseInt(arr[1]);

            String maLoai = ma.substring(0, 2);
            int loai = ma.charAt(2) - '0';

            SanPham sp = null;
            for (SanPham x : listSP) {
                if (x.getMaLoai().equals(maLoai)) {
                    sp = x;
                    break;
                }
            }

            if (sp != null) {
                listHD.add(new HoaDon(ma, i, soLuong, sp, loai));
            }
        }

        for (HoaDon x : listHD) {
            System.out.println(x);
        }
    }
}
