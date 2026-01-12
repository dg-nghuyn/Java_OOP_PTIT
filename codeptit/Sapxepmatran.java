/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sapxepmatran {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int T = sc.nextInt();

        while (T-- > 0) {
            int N, M, i;
            N = sc.nextInt();
            M = sc.nextInt();
            i = sc.nextInt();

            int[] cot = new int[N + 5];
            int[][] A = new int[N + 5][M + 5];
            for (int k = 1; k <= N; k++) {
                for (int j = 1; j <= M; j++) {
                    A[k][j] = sc.nextInt();
                    if (j == i) {
                        cot[k] = A[k][j];
                    }
                }
            }

            Arrays.sort(cot, 1, N + 1);
            for (int x = 1; x <= N; x++) {
                A[x][i] = cot[x];
            }

            for (int n = 1; n <= N; n++) {
                for (int m = 1; m <= M; m++) {
                    System.out.print(A[n][m] + " ");
                }
                System.out.println("");
            }
        }
    }
}
