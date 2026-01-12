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
public class Bo3soPytago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                int tmp = sc.nextInt();
                A[i] = (long)tmp * tmp;
            }
            Arrays.sort(A);

            boolean flag = false;
            for (int k = N - 1; k >= 2; k--) {
                int i = 0, j = k - 1;
                while (i <= j) {
                    long sum = A[i] + A[j];
                    if (sum == A[k]) {
                        flag = true;
                        break;
                    } else if (sum < A[k]) {
                        i++;
                    } else {
                        j--;
                    }
                }
            }

            if (flag == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
