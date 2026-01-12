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
public class Danhsachcanh {

    public static void solve(int N, int[][] A) {
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (A[i][j] == 1) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[1005][1005];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
//        solve(N, A);
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (A[i][j] == 1) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
