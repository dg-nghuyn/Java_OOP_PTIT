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
public class Biensodep {

    public static boolean checktangchat(String s) {
        return s.charAt(5) < s.charAt(6)
                && s.charAt(6) < s.charAt(7)
                && s.charAt(7) < s.charAt(9)
                && s.charAt(9) < s.charAt(10);

    }

    public static boolean checkbangnhau(String s) {
        if (s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(7) == s.charAt(9) && s.charAt(9) == s.charAt(10)) {
            return true;
        }
        return false;
    }

    public static boolean checkdaucuoi(String s) {
        if (s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(9) == s.charAt(10)) {
            return true;
        }
        return false;
    }

    public static boolean checklocphat(String s) {
        for (int i = 5; i <= 10; i++) {
            if (i != 8) {
                if (s.charAt(i) != '8' || s.charAt(i) != '6') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solve(String s) {
        if (checktangchat(s) || checkbangnhau(s) || checkdaucuoi(s) || checklocphat(s)) {
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
