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
    private double tongdiem;
    private String trangthai;

    public Thisinh(int stt, String hoten, Double diem, String dantoc, int khuvuc) {
        this.mts = String.format("TS%02d", stt);
        this.hoten = chuanhoa(hoten);
        this.tongdiem = diem + uutien(dantoc, khuvuc);
        this.trangthai = trangthai(tongdiem);
    }

    @Override
    public String toString() {
        return mts + " " + hoten + " " + String.format("%.1f", tongdiem) + " " + trangthai; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Thisinh o) {
        if (o.tongdiem == this.tongdiem) {
            return this.mts.compareTo(o.mts);
        }
        return Double.compare(o.tongdiem, this.tongdiem); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    private Double uutien(String dantoc, int khuvuc) {
        Double res = 0.0;
        if (khuvuc == 1) {
            res += 1.5;
        } else if (khuvuc == 2) {
            res += 1;
        } else if (khuvuc == 3) {
            res += 0;
        }

        if ("Kinh".equals(dantoc)) {
            res += 0;
        } else {
            res += 1.5;
        }
        return res;
    }

    private String trangthai(Double diem) {
        if (diem >= 20.5) {
            return "Do";
        } else {
            return "Truot";
        }
    }
}

public class Diemtuyensinh {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int T = Integer.parseInt(sc.nextLine());

        ArrayList<Thisinh> A = new ArrayList<>();
        for (int t = 1; t <= T; t++) {
            String hoten = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            String dantoc = sc.nextLine();
            int khuvuc = Integer.parseInt(sc.nextLine());

            Thisinh tmp = new Thisinh(t, hoten, diem, dantoc, khuvuc);
            A.add(tmp);
        }

        Collections.sort(A);
        for (Thisinh x : A) {
            System.out.println(x);
        }
    }
}
