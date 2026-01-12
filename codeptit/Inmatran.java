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
public class Inmatran {

    static int N;
    static int[][] A = new int[105][105];

    public static void solve() {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                for (int j = N; j >= 1; j--) {
                    System.out.print(A[i][j] + " ");
                }
            }
            else {
                for (int j = 1; j <= N; j++) {
                    System.out.print(A[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            solve();
        }
    }
}
