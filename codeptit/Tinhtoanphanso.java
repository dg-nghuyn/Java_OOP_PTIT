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

    private long tuso, mauso;

    public Phanso(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public Phanso congphanso(Phanso a) {
        long ts = this.tuso * a.mauso + a.tuso * this.mauso;
        long ms = this.mauso * a.mauso;
        Phanso res = new Phanso(ts, ms);
        res.rutgon();
        return res;
    }

    public Phanso nhanphanso(Phanso a) {
        long ts = this.tuso * a.tuso;
        long ms = this.mauso * a.mauso;
        Phanso res = new Phanso (ts, ms);
        res.rutgon();
        return res;
    }

    public void rutgon() {
        long tmp = gcd(Math.abs(this.tuso), Math.abs(this.mauso));
        this.tuso /= tmp;
        this.mauso /= tmp;
    }

    public long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    @Override
    public String toString() {
        return this.tuso + "/" + this.mauso + " "; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}

public class Tinhtoanphanso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long At = Integer.parseInt(sc.next());
            long Am = Integer.parseInt(sc.next());
            long Bt = Integer.parseInt(sc.next());
            long Bm = Integer.parseInt(sc.next());

            Phanso A = new Phanso(At, Am);
            Phanso B = new Phanso(Bt, Bm);
            
            Phanso AB = A.congphanso(B);
            Phanso C = AB.nhanphanso(AB);
            System.out.print(C);

            Phanso D = A.nhanphanso(B).nhanphanso(C);
            System.out.println(D);
        }
    }
}
