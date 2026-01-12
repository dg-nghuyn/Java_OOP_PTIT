/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review221225;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Khachhang {

    private String makhachhang, ten, gioitinh, ngaysinh, diachi;

    public Khachhang(int sothutu, String ten, String gioitinh, String ngaysinh, String diachi) {
        this.makhachhang = String.format("KH%03d", sothutu);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public String getTen() {
        return ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

}

class Mathang {

    private String mamathang;
    private String tenmathang, donvitinh;
    private int giamua, giaban;

    public Mathang(int sothutu, String tenmathang, String donvitinh, int giamua, int giaban) {
        this.mamathang = String.format("MH%03d", sothutu);
        this.tenmathang = tenmathang;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getMamathang() {
        return mamathang;
    }

    public String getTenmathang() {
        return tenmathang;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public int getGiamua() {
        return giamua;
    }

    public int getGiaban() {
        return giaban;
    }
}

class Hoadon {

    private String mahoadon;
    private Khachhang kh;
    private Mathang mh;
    private int soluong;

    public Hoadon(int sothutu, Khachhang kh, Mathang mh, int soluong) {
        this.mahoadon = String.format("HD%03d", sothutu);
        this.kh = kh;
        this.mh = mh;
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        long thanhtien = (long) mh.getGiaban() * soluong;
        return mahoadon + " " + kh.getTen() + " " + kh.getDiachi() + " "
                + mh.getTenmathang() + " " + mh.getDonvitinh() + " "
                + mh.getGiamua() + " " + mh.getGiaban() + " "
                + soluong + " " + thanhtien;
    }
}

public class Hoadon1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\review221225\\KH.in"));
        Scanner sc2 = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\review221225\\MH.in"));
        Scanner sc3 = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\review221225\\HD.in"));

        int a = Integer.parseInt(sc1.nextLine());
        ArrayList<Khachhang> list1 = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list1.add(new Khachhang(i + 1, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }

        int b = Integer.parseInt(sc2.nextLine());
        ArrayList<Mathang> list2 = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            list2.add(new Mathang(i + 1, sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine())));
        }

        int c = Integer.parseInt(sc3.nextLine());
        ArrayList<Hoadon> list3 = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            String maKH = sc3.next();
            String maMH = sc3.next();
            int sl = sc3.nextInt();
            
            Khachhang khachtimduoc = null;;
            for (Khachhang kh : list1) {
                if (kh.getMakhachhang().equals(maKH)) {
                    khachtimduoc = kh;
                    break;
                }
            }
            
            Mathang hangtimduoc = null;;
            for (Mathang kh : list2) {
                if (kh.getMamathang().equals(maMH)) {
                    hangtimduoc = kh;
                    break;
                }
            }
            Hoadon hd = new Hoadon (i + 1, khachtimduoc, hangtimduoc, sl);
            System.out.println(hd);
        }
    }
}
