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
public class Tichmatranvoichuyenvicuano {

    static int N, M;
    static int[][] A = new int[205][205];
    static int[][] B = new int[205][205];

    public static void chuyenvi() {
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                B[i][j] = A[j][i];
            }
        }
    }

    public static void solve() {
        int[][] C = new int[205][205];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                C[i][j] = 0;
                for (int k = 1; k <= M; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            N = sc.nextInt();
            M = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test " + t + ": ");
            chuyenvi();
            solve();
        }
    }
}
