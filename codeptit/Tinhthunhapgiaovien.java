/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

class Giaovien {
    private String mangach, hoten;
    private int bacluong, phucap, thunhap;

    public Giaovien(String mangach, String hoten, int luongcoban) {
        this.mangach = mangach;
        this.hoten = hoten;
        
        int bl = Integer.parseInt(mangach.substring(2));
        this.bacluong = bl;
        
        this.phucap = phucap(mangach);
        this.thunhap = luongcoban * bacluong + phucap;
    }

    @Override
    public String toString() {
        return mangach + " " + hoten + " " + bacluong + " " + phucap + " " + thunhap; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    private int phucap (String s) {
        String chucvu = s.substring(0, 2);
        if ("HT".equals(chucvu)) {
            return 2000000;
        }
        else if ("HP".equals(chucvu)) {
            return 900000;
        }
        else return 500000;
    }
}
public class Tinhthunhapgiaovien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String mn = sc.nextLine();
        String ht = sc.nextLine();
        int lcb = Integer.parseInt(sc.nextLine());
        
        Giaovien A = new Giaovien(mn, ht, lcb);
        System.out.println(A);
    }
}
