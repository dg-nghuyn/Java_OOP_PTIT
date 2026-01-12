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

public class Soxacach2 {

    static int N;
    static int[] A = new int[15];
    static boolean[] check = new boolean[15];

    public static boolean ktra() {
        for (int i = 1; i < N; i++) {
            if (Math.abs(A[i] - A[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void in() {
        for (int i = 1; i <= N; i++) {
            System.out.print(A[i]);
        }
        System.out.println("");
    }
    
    public static void Try (int k) {
        for (int i = 1; i <= N; i++) {
            if (!check[i]) {
                A[k] = i;
                check[i] = true;
                
                if (k == N) {
                    if (ktra()) {
                        in();
                    }
                }
                else {
                    Try(k + 1);
                }
                
                check[i] = false;
            }
        }
    }


    public static void solve(int N) {
        for (int i = 1; i <= N; i++) {
            check[i] = false;
        }
        Try (1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            N = sc.nextInt();
            solve(N);
            System.out.println("");
        }
    }
}
