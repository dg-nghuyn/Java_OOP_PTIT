/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
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
class Mathang implements Comparable<Mathang> {

    private String mahang, tenhang, nhomhang;
    private double loinhuan;

    public Mathang(int i, String tenhang, String nhomhang, double giaban, double giamua) {
        this.mahang = String.format("MH%02d", i);
        this.tenhang = tenhang;
        this.nhomhang = nhomhang;
        this.loinhuan = giaban - giamua;
    }

    @Override
    public String toString() {
        return String.format ("%s %s %s %.2f", mahang, tenhang, nhomhang, loinhuan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Mathang o) {
        return Double.compare(o.loinhuan, this.loinhuan); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class Sapxepmathang {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATHANG.in"));

        int T = sc.nextInt();
        sc.nextLine();

        ArrayList<Mathang> A = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            String th = sc.nextLine();
            String nh = sc.nextLine();
            double gm = Double.parseDouble(sc.nextLine());
            double gb = Double.parseDouble(sc.nextLine());

            Mathang tmp = new Mathang(i, th, nh, gb, gm);
            A.add(tmp);
        }

        Collections.sort(A);
        for (Mathang x : A) {
            System.out.println(x);
        }
    }
}
