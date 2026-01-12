/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review221225;

import java.util.*;
import java.io.*;

/**
 *
 * @author Admin
 */
class Sinhvien implements Comparable<Sinhvien> {

    private String masinhvien, hoten, sodienthoai;
    private int sonhom;

    public Sinhvien(String masinhvien, String hoten, String sodienthoai, int sonhom) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.sodienthoai = sodienthoai;
        this.sonhom = sonhom;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public String getHoten() {
        return hoten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public int getSonhom() {
        return sonhom;
    }

    @Override
    public String toString() {
        return masinhvien + " " + hoten + " " + sodienthoai + " " + sonhom;
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.masinhvien.compareTo(o.masinhvien);
    }
}

class Bainhom {

    private int stt;
    private String tenbai;

    public Bainhom(int stt, String tenbai) {
        this.stt = stt;
        this.tenbai = tenbai;
    }

    public int getStt() {
        return stt;
    }

    public String getTenbai() {
        return tenbai;
    }

    @Override
    public String toString() {
        return tenbai;
    }
}

public class Quanlybaitapnhom {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        ArrayList<Sinhvien> list1 = new ArrayList<>();
        ArrayList<Bainhom> list2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list1.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }

        for (int j = 0; j < M; j++) {
            list2.add(new Bainhom(j + 1, sc.nextLine()));
        }

        Collections.sort(list1);
        for (Sinhvien x : list1) {
            System.out.print(x + " ");
            System.out.println(list2.get(x.getSonhom() - 1));
        }
    }
}
