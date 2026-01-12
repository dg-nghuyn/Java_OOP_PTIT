/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Khachhang {

    private String makhachhang, tenkhachhang, gioitinh, ngaysinh, diachi;

    public Khachhang(int stt, String tenkhachhang, String gioitinh, String ngaysinh, String diachi) {
        this.makhachhang = String.format("KH%03d", stt);
        this.tenkhachhang = tenkhachhang;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
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

    private String mamathang, tenmathang, donvitinh;
    private int giamua, giaban;

    public Mathang(int stt, String tenmathang, String donvitinh, int giamua, int giaban) {
        this.mamathang = String.format("MH%03d", stt);
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
    private int sl;

    public Hoadon(int stt, Khachhang kh, Mathang mh, int sl) {
        this.mahoadon = String.format("HD%03d", stt);
        this.kh = kh;
        this.mh = mh;
        this.sl = sl;
    }

    @Override
    public String toString() {
        long thanhtien = 1L * mh.getGiaban() * sl;
        return mahoadon + " " + kh.getTenkhachhang() + " " + kh.getDiachi() + " " + mh.getTenmathang() + " " + mh.getDonvitinh() + " " + mh.getGiamua() + " " + mh.getGiaban() + " " + sl + " " + thanhtien;
    }

}

public class Baitoanbanhang {

    public static void main(String[] args) throws Exception {
        Scanner sckh = new Scanner(new File("KH.in"));
        Scanner scmh = new Scanner(new File("MH.in"));
        Scanner schd = new Scanner(new File("HD.in"));

        HashMap<String, Khachhang> mapKH = new HashMap<>();
        int N = Integer.parseInt(sckh.nextLine());
        for (int n = 1; n <= N; n++) {
            String tkh = sckh.nextLine();
            String gt = sckh.nextLine();
            String ns = sckh.nextLine();
            String dc = sckh.nextLine();

            Khachhang kh = new Khachhang(n, tkh, gt, ns, dc);
            mapKH.put(kh.getMakhachhang(), kh);
        }

        HashMap<String, Mathang> mapMH = new HashMap<>();
        int M = Integer.parseInt(scmh.nextLine());
        for (int m = 1; m <= M; m++) {
            String tmh = scmh.nextLine();
            String dvt = scmh.nextLine();
            int gm = Integer.parseInt(scmh.nextLine());
            int gb = Integer.parseInt(scmh.nextLine());

            Mathang mh = new Mathang(m, tmh, dvt, gm, gb);
            mapMH.put(mh.getMamathang(), mh);
        }

        ArrayList<Hoadon> HD = new ArrayList<>();
        int K = Integer.parseInt(schd.nextLine());
        for (int k = 1; k <= K; k++) {
            String makh = schd.next();
            String mamh = schd.next();
            int sl = schd.nextInt();

            HD.add(new Hoadon(k, mapKH.get(makh), mapMH.get(mamh), sl));
        }

        for (Hoadon hd : HD) {
            System.out.println(hd);
        }
    }
}
