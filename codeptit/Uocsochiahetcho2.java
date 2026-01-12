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
public class Uocsochiahetcho2 {
    public static void Solve(long N) {
        long cnt = 0;
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i % 2 == 0) {
                    cnt++;
                }
                long tmp = N / i;
                if (tmp != i) {
                    if (tmp % 2 == 0) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
    
    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        int T = Nhap.nextInt();
        while (T-- > 0) {
            long N = Nhap.nextLong();
            Uocsochiahetcho2.Solve(N);
        }
    }
}
