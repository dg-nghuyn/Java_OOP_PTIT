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
public class Hinhchunhatdonsac {

    public static long hcn(int[] a, int n) {
        int[] l = new int[n];
        int[] r = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.empty() && a[st.peek()] >= a[i]) {
                st.pop();
            }
            if (st.empty()) {
                l[i] = -1;
            } else {
                l[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && a[st.peek()] >= a[i]) {
                st.pop();
            }
            if (st.empty()) {
                r[i] = n;
            } else {
                r[i] = st.peek();
            }
            st.push(i);
        }

        long res = 0;
        for (int i = 0; i < n; i++) {
            long chieurong = r[i] - l[i] - 1;
            long tmp = (long) a[i] * chieurong;
            res = Math.max(tmp, res);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = M - A[i];
        }

        long res1 = hcn(A, N);
        long res2 = hcn(B, N);

        System.out.println(Math.max(res1, res2));
    }
}
