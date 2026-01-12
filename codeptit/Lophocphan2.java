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
class Lophoc implements Comparable<Lophoc> {

    private String mmh, tmh;
    private int nhomlop;
    private String tgv;

    public Lophoc(String mmh, String tmh, int nhomlop, String tgv) {
        this.mmh = mmh;
        this.tmh = tmh;
        this.nhomlop = nhomlop;
        this.tgv = tgv;
    }

    public String getMmh() {
        return mmh;
    }

    public String getTmh() {
        return tmh;
    }

    public String getTgv() {
        return tgv;
    }

    @Override
    public String toString() {
        return mmh + " " + tmh + " " + String.format("%02d", nhomlop); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Lophoc o) {
        if (!this.mmh.equals(o.mmh)) {
            return this.mmh.compareTo(o.mmh); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        } else {
            return this.nhomlop - o.nhomlop;
        }
    }
}

public class Lophocphan2 {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\INPUT.in"));
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Lophoc> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(new Lophoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(list);

        int M = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < M; i++) {
            String tmp = sc.nextLine();
            System.out.print("Danh sach cho giang vien ");
            String res = "";
            for (int j = 0; j < N; j++) {
                if (list.get(j).getTgv().equals(tmp)) {
                    res = list.get(j).getTgv();
                }
            }
            System.out.println(res + ":");

            for (int j = 0; j < N; j++) {
                if (list.get(j).getTgv().equals(tmp)) {
                    System.out.println(list.get(j));
                }
            }
        }
    }
}
