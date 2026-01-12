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
public class Songuyento {
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0 && n > 2) return false;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void Check(long a) {
        if (isPrime(a) == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    
    public static void main (String [] args) {
        Scanner Nhap = new Scanner(System.in);
        int T = Nhap.nextInt();
        while (T > 0) {
            long a = Nhap.nextLong();
            Songuyento.Check(a);
            T--;
        }
    }
}