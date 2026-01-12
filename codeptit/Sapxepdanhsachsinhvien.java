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
class Sinhvien implements Comparable<Sinhvien> {

    private String masinhvien, hoten, sodienthoai, email;
    private String ten, ho, tendem;

    public Sinhvien(String masinhvien, String hoten, String sodienthoai, String email) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.sodienthoai = sodienthoai;
        this.email = email;

        String[] tmp = hoten.split("\\s+");
        this.ho = tmp[0];
        this.ten = tmp[tmp.length - 1];
        this.tendem = hoten.substring(tmp[0].length(), tmp[0].length() + hoten.length() - tmp[0].length() - tmp[tmp.length - 1].length());
    }

    @Override
    public String toString() {
        return masinhvien + " " + hoten + " " + sodienthoai + " " + email; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Sinhvien o) {

        if (this.ten.compareTo(o.ten) != 0) {
            return this.ten.compareTo(o.ten);
        }
        if (this.ho.compareTo(o.ho) != 0) {
            return this.ho.compareTo(o.ho);

        }
        if (this.tendem.compareTo(o.tendem) != 0) {
            return this.tendem.compareTo(o.tendem);

        }
        return this.masinhvien.compareTo(o.masinhvien);
    }
}

public class Sapxepdanhsachsinhvien {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> A = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            Sinhvien tmp = new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            A.add(tmp);
        }
        Collections.sort(A);
        for (Sinhvien x : A) {
            System.out.println(x);
        }
    }
}
