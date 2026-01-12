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
class Doanhnghiep implements Comparable<Doanhnghiep> {

    private String mdn, tdn, ssv;

    public Doanhnghiep(String mdn, String tdn, String ssv) {
        this.mdn = mdn;
        this.tdn = tdn;
        this.ssv = ssv;
    }

    @Override
    public String toString() {
        return mdn + " " + tdn + " " + ssv; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Doanhnghiep o) {
        return this.mdn.compareTo(o.mdn); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class Danhsachdoanhnghiep {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DN.in"));

        int T = sc.nextInt();
        sc.nextLine();

        ArrayList<Doanhnghiep> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            String mdn = sc.nextLine();
            String tdn = sc.nextLine();
            String ssv = sc.nextLine();

            Doanhnghiep dn = new Doanhnghiep(mdn, tdn, ssv);
            list.add(dn);
        }

        Collections.sort(list);
        for (Doanhnghiep k : list) {
            System.out.println(k);
        }
    }
}
