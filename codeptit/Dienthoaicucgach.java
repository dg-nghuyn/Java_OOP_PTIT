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
public class Dienthoaicucgach {

    public static String so(char c) {
        if (c == 'A' || c == 'B' || c == 'C') {
            return "2";
        } else if (c == 'D' || c == 'E' || c == 'F') {
            return "3";
        } else if (c == 'G' || c == 'H' || c == 'I') {
            return "4";
        } else if (c == 'J' || c == 'K' || c == 'L') {
            return "5";
        } else if (c == 'M' || c == 'N' || c == 'O') {
            return "6";
        } else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
            return "7";
        } else if (c == 'T' || c == 'U' || c == 'V') {
            return "8";
        }
        return "9";
    }

    public static void solve(String s) {
        s = s.trim().toUpperCase();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append(so(s.charAt(i)));
        }
        
        String temp = res.toString();
        String tmp = res.reverse().toString();
        if (temp.toString().equals(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            solve(s);
        }
    }
}
