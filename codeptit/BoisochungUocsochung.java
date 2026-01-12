
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class BoisochungUocsochung {
    public static void Solve(long x, long y) {
        long tmp, a = x, b = y;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println(x * y / a + " " + a);
    }
    
    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        int T = Nhap.nextInt();
        while (T-- > 0) {
            long a = Nhap.nextLong();
            long b = Nhap.nextLong();
            BoisochungUocsochung.Solve(a, b);
        }
    }
}
