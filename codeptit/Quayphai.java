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
public class Quayphai {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long A[] = new long [N];
            long B[] = new long [N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                B[i] = A[i];
            }
            
            Arrays.sort(A);
            int res = 0;
            for (int i = 0; i < N; i++) {
                if (B[i] == A[0]) {
                    res = i;
                }
            }
            
            System.out.println(res);
        }
    }
}
