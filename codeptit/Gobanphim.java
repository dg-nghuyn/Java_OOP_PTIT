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
public class Gobanphim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<') {
                if (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            } else if (c == '>') {
                if (!st2.isEmpty()) {
                    st1.push(st2.pop());
                }
            }
            else if (c == '-') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            }
            else st1.push(c);
        }
        
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        
        StringBuilder res = new StringBuilder();
        while (!st2.isEmpty()) {
            res.append(st2.pop());
        }
        System.out.println(res);
    }
}
