/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Thisinh {

    private String mathisinh, hoten;
    private double diemuutien, tongdiem;
    private String trangthai;

    public Thisinh(String mts, String ht, Double t, Double l, Double h) {
        this.mathisinh = mts;
        this.hoten = ht;
        this.diemuutien = dut(mts);
        this.tongdiem = t * 2 + l + h;
        this.trangthai = tt(tongdiem);
    }

    private Double dut(String mts) {
        String tmp = mts.substring(0, 3);
        if ("KV1".equals(tmp)) {
            return 0.5;
        } else if ("KV2".equals(tmp)) {
            return 1.0;
        } else {
            return 2.5;
        }
    }

    private String tt(Double tongdiem) {
        if ((tongdiem + diemuutien) >= 24.0) {
            return "TRUNG TUYEN";
        } else {
            return "TRUOT";
        }
    }

    @Override
    public String toString() {
        String ut = "", xt = "";
        if (diemuutien == (int) diemuutien) {
            ut = String.format("%d", (int)diemuutien);
        }
        else ut = String.format("%.1f", diemuutien);
        
        if (tongdiem == (int) tongdiem) {
            xt = String.format("%d", (int)tongdiem);
        }
        else xt = String.format("%.1f", tongdiem);
        return this.mathisinh + " " + this.hoten + " " + ut + " " + xt + " " + this.trangthai; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}

public class Baitoantuyensinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mts = sc.nextLine();
        String ht = sc.nextLine();
        double t = Double.parseDouble(sc.nextLine());
        double l = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        Thisinh A = new Thisinh(mts, ht, t, l, h);
        System.out.println(A);
    }
}
