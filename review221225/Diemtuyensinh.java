/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review221225;

import java.io.File;
import java.io.FileNotFoundException;
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

    public Thisinh(int stt, String hoten, double tongdiem, String dantoc, int khuvuc) {
        this.mts = String.format("TS%02d", stt);
        this.hoten = chuanhoa(hoten);
        this.tongdiem = tongdiem + uutien(khuvuc, dantoc);
        this.trangthai = dotruot(tongdiem);
    }

    public String chuanhoa(String s) {
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            String a = x.substring(0, 1).toUpperCase();
            res.append(a);
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }

    public double uutien(int kv, String dt) {
        double res = 0.0;
        if (kv == 1) {
            res += 1.5;
        } else if (kv == 2) {
            res += 1.0;
        }

        if (dt.equals("Kinh")) {
            res += 0.0;
        } else {
            res += 1.5;
        }
        return res;
    }

    public String dotruot(double diem) {
        if (tongdiem >= 20.5) {
            return "Do";
        } else {
            return "Truot";
        }
    }

    @Override
    public String toString() {
        return mts + " " + hoten + " " + String.format("%.1f", tongdiem) + " " + trangthai; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Thisinh o) {
        if (this.tongdiem != o.tongdiem) {
            return Double.compare(o.tongdiem, this.tongdiem);
        }
        return this.mts.compareTo(o.mts);
    }
}

public class Diemtuyensinh {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Thisinh> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(new Thisinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for (Thisinh x : list) {
            System.out.println(x);
        }
    }
}
