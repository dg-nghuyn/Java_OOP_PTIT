/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
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
class Sinhvien implements Comparable<Sinhvien> {

    private String msv, hoten;
    private Double dtk;
    private String rank;

    public Sinhvien(int stt, String hoten, Double dlt, Double dth, Double dt) {
        this.msv = String.format("SV%02d", stt);
        this.hoten = chuanhoa(hoten);
        this.dtk = dlt * 0.25 + dth * 0.35 + dt * 0.4;
        this.rank = xeploai(dtk);
    }

    @Override
    public String toString() {
        return msv + " " + hoten + " " + String.format("%.2f", dtk) + " " + rank; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Sinhvien o) {
        return Double.compare(o.dtk, this.dtk); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    private String xeploai(double dtk) {
        if (dtk >= 8) {
            return "GIOI";
        } else if (dtk >= 6.5) {
            return "KHA";
        } else if (dtk >= 5) {
            return "TRUNG BINH";
        } else {
            return "KEM";
        }
    }
}

public class Xeploai {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));

        int T = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> A = new ArrayList<>();

        for (int t = 1; t <= T; t++) {
            String hoten = sc.nextLine();
            double diemluyentap = Double.parseDouble(sc.nextLine());
            double diemthuchanh = Double.parseDouble(sc.nextLine());
            double diemthi = Double.parseDouble(sc.nextLine());

            Sinhvien tmp = new Sinhvien(t, hoten, diemluyentap, diemthuchanh, diemthi);
            A.add(tmp);
        }

        Collections.sort(A);

        for (Sinhvien x : A) {
            System.out.println(x);
        }

    }
}
