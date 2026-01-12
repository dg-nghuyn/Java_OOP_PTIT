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
public class Dayngoacdungdainhat {

    public static void Solve(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(i);
            } else {
                st.pop();
                if (!st.empty()) {
                    res = Math.max(res, i - st.peek());
                } else {
                    st.push(i);
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        while (N-- > 0) {
            String s = sc.nextLine();
            s = s.trim();
            Solve(s);
        }
    }
}
