/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Mathang implements Comparable<Mathang> {

    private String mmh, tmh, dvt;
    private int giamua, giaban, loinhuan;

    public Mathang(int stt, String tmh, String dvt, int giamua, int giaban) {
        this.mmh = String.format("MH%03d", stt);
        this.tmh = tmh;
        this.dvt = dvt;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
    }

    @Override
    public String toString() {
        return mmh + " " + tmh + " " + dvt + " " + giamua + " " + giaban + " " + loinhuan; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Mathang o) {
        if (this.loinhuan != o.loinhuan) {
            return o.loinhuan - this.loinhuan;
        } else {
            return this.mmh.compareTo(o.mmh);
        }
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Danhsachmathang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());
        ArrayList<Mathang> A = new ArrayList<>();

        for (int i = 1; i <= M; i++) {
            String tmh = sc.nextLine();
            String dvt = sc.nextLine();
            int mua = Integer.parseInt(sc.nextLine());
            int ban = Integer.parseInt(sc.nextLine());

            Mathang tmp = new Mathang(i, tmh, dvt, mua, ban);
            A.add(tmp);
        }

        Collections.sort(A);
        for (Mathang x : A) {
            System.out.println(x);
        }
    }
}
