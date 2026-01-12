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
class Phanso {

    private long tuso;
    private long mauso;

    public Phanso(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    private long gcd(long a, long b) {
        while (b != 0)  {
            long res = a % b;
            a = b;
            b = res;
        }
        return a;
    }
    
    public void rutgon() {
        long ucln = gcd (this.tuso, this.mauso);
        this.tuso /= ucln;
        this.mauso /= ucln;
    }
    
    public void congphanso (Phanso a) {
        long ts = this.tuso * a.mauso + a.tuso * this.mauso;
        long ms = this.mauso * a.mauso;
        this.tuso = ts;
        this.mauso = ms;
        rutgon();
    }
   
    @Override
    public String toString() {
        return (tuso + "/" + mauso); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

public class Tongphanso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();

        Phanso a = new Phanso(x1, y1);
        Phanso b = new Phanso(x2, y2);
        
        a.congphanso(b);
        System.out.println(a);
    }
}
