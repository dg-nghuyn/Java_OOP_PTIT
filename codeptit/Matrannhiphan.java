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
public class Matrannhiphan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] A = new int[N + 5][5];
        int[][] cnt = new int[N + 5][5];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 3; j++) {
                A[i][j] = sc.nextInt();
                if (A[i][j] == 1) {
                    cnt[i][1]++;
                } else {
                    cnt[i][0]++;
                }
            }
        }

        int res = 0;
        for (int i = 1; i <= N; i++) {
            if (cnt[i][1] > cnt[i][0]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
