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
class Sinhvien implements Comparable <Sinhvien> {

    private String ma, ten, lop, email;

    public Sinhvien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanhoa(ten);
        this.lop = lop;
        this.email = email;
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

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.ma.compareTo(o.ma); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class Danhsachsinhvientrongfile1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int T = sc.nextInt();
        sc.nextLine();

        ArrayList<Sinhvien> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            
            Sinhvien sv = new Sinhvien(ma, ten, lop, email);
            list.add(sv);
        }

        Collections.sort(list);
        for (Sinhvien x : list) {
            System.out.println(x);
        }
    }
}
