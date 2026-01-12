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
    private String mamon, tenmon, lythuyet, thuchanh;
    private int sotinchi;

    public Monhoc(String mamon, String tenmon, int sotinchi, String lythuyet, String thuchanh) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
        this.sotinchi = sotinchi;
    }

    public String getThuchanh() {
        return thuchanh;
    }

    @Override
    public String toString() {
        return mamon + " " + tenmon + " " + sotinchi + " " + lythuyet + " " + thuchanh; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Monhoc o) {
        return this.mamon.compareTo(o.mamon); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

public class Dangkihinhthucgiangday {
    public static boolean check (String s) {
        return "Truc tuyen".equals(s) || s.contains(".ptit.edu.vn");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new  Scanner (new File("MONHOC.in"));
        int N = Integer.parseInt(sc.nextLine());
        
        ArrayList<Monhoc> A = new ArrayList<>();
        for (int n = 1; n <= N; n++) {
            Monhoc tmp = new Monhoc (sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            if (check(tmp.getThuchanh())) {
                A.add(tmp);
            }
        }
        
        Collections.sort(A);
        for (Monhoc x : A) {
            System.out.println(x);
        }
    }
}
