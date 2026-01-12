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
class PhanSo {

    private long tuso;
    private long mauso;

    public PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public void rutgon() {
        long ucln = gcd(this.tuso, this.mauso);
        this.tuso = this.tuso / ucln;
        this.mauso = this.mauso / ucln;
    }

    @Override
    public String toString() {
        return tuso + "/" + mauso; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

public class Phanso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        PhanSo p = new PhanSo(a, b);
        p.rutgon();

        System.out.println(p);
    }
}
