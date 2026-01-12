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
class Sanpham implements Comparable<Sanpham> {

    private String msp, tsp;
    private int giaban;
    private int tgbh;

    public Sanpham(String msp, String tsp, int giaban, int tgbh) {
        this.msp = msp;
        this.tsp = tsp;
        this.giaban = giaban;
        this.tgbh = tgbh;
    }

    @Override
    public String toString() {
        return msp + " " + tsp + " " + giaban + " " + tgbh; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Sanpham o) {
        if (o.giaban != this.giaban) // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        {
            return o.giaban - this.giaban;
        } else {
            return this.msp.compareTo(o.msp);
        }
    }

}

public class Danhsachsanpham2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int T = Integer.parseInt(sc.nextLine());

        ArrayList<Sanpham> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            String msp = sc.nextLine();
            String tsp = sc.nextLine();
            int giaban = Integer.parseInt(sc.nextLine());
            int tgbh = Integer.parseInt(sc.nextLine());

            Sanpham sp = new Sanpham(msp, tsp, giaban, tgbh);
            list.add(sp);
        }

        Collections.sort(list);

        for (Sanpham k : list) {
            System.out.println(k);
        }
    }
}
