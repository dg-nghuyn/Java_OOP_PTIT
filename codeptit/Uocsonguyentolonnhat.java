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
public class Uocsonguyentolonnhat {

    /*
    static long[] pri = new long[2000001];

    static void Songuyento() {
        for (long i = 2; i <= 2000000; i++) {
            pri[i] = i;
        }
        for (long i = 2; i * i <= 200000; i++) {
            if (pri[i] == i) {
                for (long j = i * i; j <= 2000000; j += i) {
                    if (pri[j] == j) {
                        pri[j] = i;
                    }
                }
            }
        }
    }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            long tmp = 1;
            for (long i = 2; i <= Math.sqrt(N); i++) {
                while (N % i == 0) {
                    N /= i;
                    tmp = i;
                }
            }
            if (N > 1) {
                tmp = N;
            }
            System.out.println(tmp);
        }
    }
}
