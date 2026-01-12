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
public class Kiemtradayngoacdung {
    public static boolean Solve(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if (c == ')' && top == '(') {
                    st.pop();
                }
                else if (c == ']' && top == '[') {
                    st.pop();
                }
                else if (c == '}' && top == '{') {
                    st.pop();
                }
                else return false;
            }
        }
            
        return st.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            s = s.trim();
            if (Solve(s)) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
