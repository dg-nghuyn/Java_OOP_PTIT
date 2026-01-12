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

    @Override
    public String toString() {
        return String.format("%02d", nhomlop) + " " + tgv; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Lophoc o) {
        return this.nhomlop - o.nhomlop; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Lophocphan1 {

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
            System.out.print("Danh sach nhom lop mon ");
            String res = "";
            for (int j = 0; j < N; j++) {
                if (list.get(j).getMmh().equals(tmp)) {
                    res = list.get(j).getTmh();
                }
            }
            System.out.println(res + ":");

            for (int j = 0; j < N; j++) {
                if (list.get(j).getMmh().equals(tmp)) {
                    System.out.println(list.get(j));
                }
            }
        }
    }
}
