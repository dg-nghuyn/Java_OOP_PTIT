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
class Thoigian implements Comparable<Thoigian> {

    private int gio, phut, giay;

    public Thoigian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Thoigian o) {
        if (this.gio == o.gio) {
            if (this.phut == o.phut) {
                return (this.giay - o.giay);
            } else {
                return this.phut - o.phut;
            }
        } else {
            return this.gio - o.gio;
        }
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class Sapxepthoigian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        ArrayList<Thoigian> A = new ArrayList<>();

        for (int t = 1; t <= T; t++) {
            String s = sc.nextLine();
            String[] tmp = s.split(" ");

            int gio = Integer.parseInt(tmp[0]);
            int phut = Integer.parseInt(tmp[1]);
            int giay = Integer.parseInt(tmp[2]);

            Thoigian x = new Thoigian(gio, phut, giay);
            A.add(x);
        }

        Collections.sort(A);
        for (Thoigian tmp : A) {
            System.out.println(tmp);
        }
    }
}
