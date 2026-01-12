/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Thisinh implements Comparable<Thisinh> {

    private String mts, hoten;
    private double diemut, diemxt;
    private String trangthai;

    public Thisinh(String mts, String hoten, double toan, double ly, double hoa) {
        this.mts = mts;
        this.hoten = chuanhoa(hoten);
        this.diemut = diemuutien(mts);
        this.diemxt = toan * 2 + ly + hoa + diemut;
        this.trangthai = trangthai;
    }

    public String getMts() {
        return mts;
    }

    public double getDiemxt() {
        return diemxt;
    }

    public void setTrangthai(double diemchuan) {
        if (this.diemxt >= diemchuan) {
            this.trangthai = "TRUNG TUYEN";
        } else {
            this.trangthai = "TRUOT";
        }
    }

    @Override
    public String toString() {
        String ut = "", xt = "";
        if (diemut == (int) diemut) {
            ut = String.format("%d", (int)diemut);
        }
        else ut = String.format("%.1f", diemut);
        
        if (diemxt == (int) diemxt) {
            xt = String.format("%d", (int)diemxt);
        }
        else xt = String.format("%.1f", diemxt);
        
        return mts + " " + hoten + " " + ut + " " + xt + " " + trangthai;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Thisinh o) {
        if (Double.compare(o.diemxt, this.diemxt) == 0) {
            return this.mts.compareTo(o.mts);
        } else {
            return Double.compare(o.diemxt, this.diemxt);
        }
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String chuanhoa(String s) {
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }

    private double diemuutien(String s) {
        if (s.charAt(2) == '1') {
            return 0.5;
        } else if (s.charAt(2) == '2') {
            return 1.0;
        } else {
            return 2.5;
        }
    }
}

public class Danhsachtrungtuyen {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int T = Integer.parseInt(sc.nextLine());

        ArrayList<Thisinh> A = new ArrayList<>();
        for (int t = 1; t <= T; t++) {
            String mts = sc.nextLine();
            String ht = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());

            Thisinh tmp = new Thisinh(mts, ht, toan, ly, hoa);
            A.add(tmp);
        }

        int chitieu = Integer.parseInt(sc.nextLine());
        Collections.sort(A);

        double diemchuan = A.get(chitieu - 1).getDiemxt();
        System.out.println(String.format("%.1f", diemchuan));
        
        for (Thisinh x : A) {
            x.setTrangthai(diemchuan);
        }
        
        for (Thisinh x : A) {
            System.out.println(x);
        }
    }
}
