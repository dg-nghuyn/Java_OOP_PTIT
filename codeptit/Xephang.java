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
class Khachhang implements Comparable <Khachhang>{
    public int den, checkin;

    public Khachhang(int den, int checkin) {
        this.den = den;
        this.checkin = checkin;
    }

    @Override
    public int compareTo(Khachhang o) {
        return this.den - o.den; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
public class Xephang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        ArrayList<Khachhang> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            A.add(new Khachhang(a, b));
        }
        Collections.sort(A);
        
        int res = 0;
        for (Khachhang x : A) {
            int tmp = Math.max(res, x.den);
            res = tmp + x.checkin;
        }
        
        System.out.println(res);
    }
}