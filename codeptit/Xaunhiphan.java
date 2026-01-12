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
public class Xaunhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        long [] len = new long [93];
        len [1] = len [2] = 1;
        for (int i = 3; i <= 92; i++) {
            len[i] = len [i - 1] + len [i - 2];
        }
        
        while (T-- > 0) {
            int N;
            long K;
            N = sc.nextInt();
            K = sc.nextLong();
            
            while (N > 2) {
                if (K <= len[N - 2]) {
                    N = N - 2;
                }
                else {
                    K -= len[N - 2];
                    N = N - 1;
                }
            }
            
            System.out.println(N == 1 ? 0 : 1);
        }
    }
}
