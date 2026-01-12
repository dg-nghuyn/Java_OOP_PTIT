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
class Hoten implements Comparable<Hoten> {

    private String ho, ten, tendem;
    private String daydu, viettat;

    public Hoten(String hoten) {
        this.daydu = hoten.trim();
        String tmp[] = this.daydu.split("\\s+");
        
        this.ho = tmp[0];
        this.ten = tmp[tmp.length - 1];
        this.tendem = "";
        for (int i = 1; i < tmp.length - 1; i++) {
            this.tendem += tmp[i] + " ";
        }
        this.tendem = this.tendem.trim();
        
        this.viettat = "";
        for (int i = 0; i < tmp.length; i++) {
            this.viettat += String.valueOf(tmp[i].charAt(0));
            if (i < tmp.length - 1) {
                this.viettat += ".";
            }
        }
    }
    
    public boolean Check (String s) {
        if (this.viettat.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < this.viettat.length(); i++) {
            char c1 = this.viettat.charAt(i);
            char c2 = s.charAt(i);
            
            if (c2 == '*') continue;
            if (c1 != c2) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return daydu; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Hoten o) {
        if (!this.ten.equals(o.ten)){
            return this.ten.compareTo(o.ten);
        }
        return this.ho.compareTo(o.ho);
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class Tenviettat {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int N = sc.nextInt();
        sc.nextLine();

        ArrayList<Hoten> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new Hoten(sc.nextLine()));
        }
        Collections.sort(list);

        int M = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < M; j++) {
            String res2 = sc.nextLine();
            for (Hoten x : list) {
                if (x.Check(res2)) {
                    System.out.println(x);
                }
            }
        }
    }
}
