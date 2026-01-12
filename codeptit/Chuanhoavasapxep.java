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
class Hoten implements Comparable<Hoten> {

    String ho;

    private String tendem, ten;

    public Hoten(String ho, String tendem, String ten) {
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
    }

    @Override
    public String toString() {
        return ho + tendem + ten; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Hoten o) {
        if (this.ten.compareTo(o.ten) == 0) {
            if (this.ho.compareTo(o.ho) == 0) {
                return this.tendem.compareTo(o.tendem);
            } else {
                return this.ho.compareTo(o.ho);
            }
        }
        return this.ten.compareTo(o.ten);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class Chuanhoavasapxep {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Hoten> A = new ArrayList<>();
        while (sc.hasNextLine()) {
            String tmp = sc.nextLine();
            tmp = chuanhoa(tmp);
            String[] res = tmp.split("\\s+");

            String ho = res[0];
            String ten = res[res.length - 1];
            String tendem = tmp.substring(res[0].length(), res[0].length() + tmp.length() - res[0].length() - res[res.length - 1].length());

            Hoten x = new Hoten(ho, tendem, ten);
            A.add(x);
        }

        Collections.sort(A);
        for (Hoten x : A) {
            System.out.println(x);
        }
    }

    public static String chuanhoa(String s) {
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }
}
