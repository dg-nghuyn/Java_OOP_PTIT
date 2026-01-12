/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package codeptit;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Thituyen {

    private String mathituyen, hoten;
    private int tuoi;
    private int diemtrungbinh;
    private String xeploai;

    public Thituyen(int stt, String hoten, String ngaysinh, double diemlythuyet, double diemthuchanh) {
        this.mathituyen = String.format("PH%02d", stt);
        this.hoten = chuanhoa(hoten);
        this.tuoi = tinhtuoi(ngaysinh);
        double dtb = (diemlythuyet + diemthuchanh) / 2 + diemthuong(diemlythuyet, diemthuchanh);
        if (dtb > 10) {
            dtb = 10;
        }
        this.diemtrungbinh = (int) Math.round(dtb);
        this.xeploai = xeploai(this.diemtrungbinh);
    }

    private String xeploai(double dtb) {
        if (dtb >= 9) {
            return "Xuat sac";
        } else if (dtb >= 8) {
            return "Gioi";
        } else if (dtb >= 7) {
            return "Kha";
        } else if (dtb >= 5) {
            return "Trung binh";
        }
        return "Truot";
    }

    private double diemthuong(double diemlythuyet, double diemthuchanh) {
        if (diemlythuyet >= 8 && diemthuchanh >= 8) {
            return 1;
        } else if (diemlythuyet >= 7.5 && diemthuchanh >= 7.5) {
            return 0.5;
        } else {
            return 0;
        }
    }

    private int tinhtuoi(String s) {
        s = s.trim();
        String[] tmp = s.split("/");
        int tuoi = Integer.parseInt(tmp[tmp.length - 1]);
        return 2021 - tuoi;
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

    public String toString() {
        return mathituyen + " " + hoten + " " + tuoi + " " + diemtrungbinh + " " + xeploai;
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Xettuyen {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<Thituyen> list = new ArrayList<>();

        for (int t = 1; t <= T; t++) {
            String hoten = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double diemlythuyet = Double.parseDouble(sc.nextLine());
            double diemthuchanh = Double.parseDouble(sc.nextLine());

            Thituyen tmp = new Thituyen(t, hoten, ngaysinh, diemlythuyet, diemthuchanh);
            list.add(tmp);
        }

        for (Thituyen x : list) {
            System.out.println(x);
        }
    }
}
