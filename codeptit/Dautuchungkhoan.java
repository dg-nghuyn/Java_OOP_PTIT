/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.io.*;

/**
 *
 * @author Admin
 */
public class Dautuchungkhoan {

    public static void Solve(int[] A, int N) {
        Stack<Integer> st = new Stack<>();
        int [] res = new int [N];
        
        for (int i = 0; i < N; i++) {
            while (!st.empty() && A[st.peek()] <= A[i]) {
                st.pop();
            }
            if (st.empty()) {
                res[i] = i + 1;
            }
            else {
                res[i] = i - st.peek();
            }
            st.push(i);
        }
        
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Solve(A, N);
        }
    }
}
