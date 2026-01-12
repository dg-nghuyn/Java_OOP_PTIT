/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Sinhvien implements Comparable<Sinhvien> {

    private String masv, hoten, lop, email;

    public Sinhvien(String masv, String hoten, String lop, String email) {
        this.masv = masv;
        this.hoten = chuanhoa(hoten);
        this.lop = lop;
        this.email = email;
    }

    public String chuanhoa(String s) {
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            String a = String.valueOf(x.charAt(0)).toUpperCase();
            res.append(a);
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }

    public String getMasv() {
        return masv;
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.masv.compareTo(o.masv); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return masv + " " + hoten + " " + lop; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

class Doanhnghiep {

    private String madn, tendn;
    private int ssv;

    public Doanhnghiep(String madn, String tendn, int ssv) {
        this.madn = madn;
        this.tendn = tendn;
        this.ssv = ssv;
    }

    public String getMadn() {
        return madn;
    }

    public String getTendn() {
        return tendn;
    }

    public int getSsv() {
        return ssv;
    }
}

class Thuctap {

    private String masv, madn;

    public Thuctap(String masv, String madn) {
        this.masv = masv;
        this.madn = madn;
    }

    public String getMasv() {
        return masv;
    }

    public String getMadn() {
        return madn;
    }
}

public class Danhsachthuctap3 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scsv = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\SINHVIEN.in"));
        Scanner scdn = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\DN.in"));
        Scanner sctt = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\THUCTAP.in"));

        int A = Integer.parseInt(scsv.nextLine());
        ArrayList<Sinhvien> dssv = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            dssv.add(new Sinhvien(scsv.nextLine(), scsv.nextLine(), scsv.nextLine(), scsv.nextLine()));
        }

        int B = Integer.parseInt(scdn.nextLine());
        ArrayList<Doanhnghiep> dsdn = new ArrayList<>();
        for (int i = 0; i < B; i++) {
            dsdn.add(new Doanhnghiep(scdn.nextLine(), scdn.nextLine(), Integer.parseInt(scdn.nextLine())));
        }

        int C = Integer.parseInt(sctt.nextLine());
        ArrayList<Thuctap> dstt = new ArrayList<>();
        for (int i = 0; i < C; i++) {
            String s = sctt.nextLine();
            String[] tmp = s.split("\\s+");
            dstt.add(new Thuctap(tmp[0], tmp[1]));
        }

        int D = sctt.nextInt();
        sctt.nextLine();
        while (D-- > 0) {
            String madoanhnghiep = sctt.nextLine();

            Doanhnghiep dn = null;
            for (Doanhnghiep d : dsdn) {
                if (d.getMadn().equals(madoanhnghiep)) {
                    dn = d;
                    break;
                }
            }

            ArrayList<Sinhvien> dsdat = new ArrayList<>();
            for (Thuctap tt : dstt) {
                if (tt.getMadn().equals(madoanhnghiep)) {
                    for (Sinhvien sv : dssv) {
                        if (sv.getMasv().equals(tt.getMasv())) {
                            dsdat.add(sv);
                            break;
                        }
                    }
                }
            }

            Collections.sort(dsdat);
            System.out.println("DANH SACH THUC TAP TAI " + dn.getTendn() + ":");
            int res = Math.min(dn.getSsv(), dsdat.size());

            for (int i = 0; i < res; i++) {
                System.out.println(dsdat.get(i));
            }
        }
    }
}
