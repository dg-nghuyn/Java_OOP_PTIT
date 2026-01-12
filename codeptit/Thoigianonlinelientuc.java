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
class Sinhvien implements Comparable<Sinhvien> {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String hoten;
    private long thoigian;

    public Sinhvien(String hoten, String bdau, String kthuc) throws ParseException {
        this.hoten = hoten;
        Date d1 = sdf.parse(bdau);
        Date d2 = sdf.parse(kthuc);

        long time1 = d1.getTime();
        long time2 = d2.getTime();
        this.thoigian = (time2 - time1) / (1000 * 60);
    }

    @Override
    public String toString() {
        return hoten + " " + thoigian; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Sinhvien o) {
        return Long.compare(o.thoigian, this.thoigian); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Thoigianonlinelientuc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("ONLINE.in"));

        int T = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> A = new ArrayList<>();

        for (int i = 1; i <= T; i++) {
            String hoten = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();

            Sinhvien tmp = new Sinhvien(hoten, start, end);
            A.add(tmp);
        }

        Collections.sort(A);
        for (Sinhvien x : A) {
            System.out.println(x);
        }
    }
}
