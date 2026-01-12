/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Khachhang implements Comparable<Khachhang> {

    private String makh, tenkh;
    private int sophong, songayo;
    private long thanhtien;

    public Khachhang(int stt, String tenkh, int sophong, String ngaynp, String ngaytp, long tiendvps) throws ParseException {
        this.makh = String.format("KH%02d", stt);
        this.tenkh = chuanhoahoten(tenkh);
        this.sophong = sophong;
        this.songayo = tinhngay(ngaynp, ngaytp);
        this.thanhtien = songayo * heso(sophong) + tiendvps;
    }

    @Override
    public String toString() {
        return makh + " " + tenkh + " " + sophong + " " + songayo + " " + thanhtien; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Khachhang o) {
        return Double.compare(o.thanhtien, this.thanhtien); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String chuanhoahoten(String s) {
        s = s.trim().toLowerCase();
        String[] A = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String tmp : A) {
            res.append(Character.toUpperCase(tmp.charAt(0)));
            res.append(tmp.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }

    @SuppressWarnings("empty-statement")
    private int heso(int sophong) {
        int tang = sophong / 100;
        switch (tang) {
            case 1:
                return 25;
            case 2:
                return 34;
            case 3:
                return 50;
            case 4:
                return 80;
            default:
                return 0;
        }
    }

    private int tinhngay(String d1, String d2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date x = sdf.parse(d1);
        Date y = sdf.parse(d2);
        long diff = (y.getTime() - x.getTime()) / (1000 * 60 * 60 * 24);
        return (int) diff + 1;
    }
}

public class Tinhtienphong {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int T = Integer.parseInt(sc.nextLine());

        ArrayList<Khachhang> A = new ArrayList<>();

        for (int t = 1; t <= T; t++) {
            String tkh = sc.nextLine();
            int sp = Integer.parseInt(sc.nextLine());
            String nnp = sc.nextLine();
            String ntp = sc.nextLine();
            long tdvps = Long.parseLong(sc.nextLine());

            Khachhang tmp = new Khachhang(t, tkh, sp, nnp, ntp, tdvps);
            A.add(tmp);
        }

        Collections.sort(A);
        for (Khachhang x : A) {
            System.out.println(x);
        }
    }
}
