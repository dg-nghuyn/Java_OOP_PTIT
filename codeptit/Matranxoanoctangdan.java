/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Matranxoanoctangdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int [] A = new int [N * N];
        for (int i = 0; i < N * N; i++) {
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        int [][] B = new int [N][N];
        int h1 = 0, h2 = N - 1, c1 = 0, c2 = N - 1;
        int cnt = 0;
        
        while (h1 <= h2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                B[h1][i] = A[cnt++];
            }
            h1++;
            for (int i = h1; i <= h2; i++) {
                B[i][c2] = A[cnt++];
            }
            c2--;
            for (int i = c2; i >= c1; i--) {
                B[h2][i] = A[cnt++];
            }
            h2--;
            for (int i = h2; i >= h1; i--) {
                B[i][c1] = A[cnt++];
            }
            c1++;
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
