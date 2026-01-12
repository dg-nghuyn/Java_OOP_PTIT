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
class Sinhvien implements Comparable <Sinhvien> {

    private String msv, hoten;
    private double dtb;
    private int rank;

    public Sinhvien(int stt, String hoten, double d1, double d2, double d3) {
        this.msv = String.format("SV%02d", stt);
        this.hoten = chuanhoa(hoten);
        this.dtb = (d1 * 3 + d2 * 3 + d3 * 2) / 8;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getDtb() {
        return dtb;
    }

    @Override
    public String toString() {
        return msv + " " + hoten + " " + String.format("%.2f", dtb) + " " + rank; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    private String chuanhoa(String s) {
        s = s.trim().toLowerCase();
        String [] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }
    
    private int xephang(double diemtrungbinh) {
        return 1;
    }

    @Override
    public int compareTo(Sinhvien o) {
        if (o.dtb == this.dtb) {
            return this.msv.compareTo(o.msv);
        }
        return Double.compare(o.dtb, this.dtb); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Tinhdiemtrungbinh {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\BANGDIEM.in"));

        int T = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> A = new ArrayList<>();

        for (int t = 1; t <= T; t++) {
            String hoten = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());

            Sinhvien tmp = new Sinhvien(t, hoten, d1, d2, d3);
            A.add(tmp);
        }

        Collections.sort(A);
        
        A.get(0).setRank(1);

        for (int i = 1; i < A.size(); i++) {
            Sinhvien tmp1 = A.get(i);
            Sinhvien tmp2 = A.get(i - 1);
            
            if (tmp1.getDtb() == tmp2.getDtb()) {
                tmp1.setRank(tmp2.getRank());
            }
            else {
                tmp1.setRank(i + 1);
            }
        }
        
        for (Sinhvien x : A) {
            System.out.println(x);
        }
    }
}
