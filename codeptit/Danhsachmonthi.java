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
class Monhoc implements Comparable <Monhoc>{

    private String mamon, tenmon, hinhthucthi;

    public Monhoc(String mamon, String tenmon, String hinhthucthi) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.hinhthucthi = hinhthucthi;
    }

    @Override
    public String toString() {
        return mamon + " " + tenmon + " " + hinhthucthi; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Monhoc o) {
        return this.mamon.compareTo(o.mamon); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Danhsachmonthi {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int T = Integer.parseInt(sc.nextLine());
        ArrayList<Monhoc> A = new ArrayList<>();

        for (int t = 1; t <= T; t++) {
            String mm = sc.nextLine();
            String tm = sc.nextLine();
            String htt = sc.nextLine();

            Monhoc tmp = new Monhoc(mm, tm, htt);
            A.add(tmp);
        }

        Collections.sort(A);
        for (Monhoc x : A) {
            System.out.println(x);
        }
    }
}
