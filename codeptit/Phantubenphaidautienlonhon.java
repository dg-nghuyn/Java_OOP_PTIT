/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Phantubenphaidautienlonhon {

    public static void Solve(long[] A, int N) {
        Stack<Long> st = new Stack<>();
        long[] res = new long[N];
        for (int i = N - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= A[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            }
            else {
                res[i] = st.peek();
            }
            st.push(A[i]);
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[100000];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            Solve(A, N);
        }
    }
}
