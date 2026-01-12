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
public class Sodep3 {

    public static boolean songuyento(char c) {
        if (c == '2' || c == '3' || c == '5' || c == '7') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean solve(String s) {
        for (int k = 0; k < s.length(); k++) {
            if (!songuyento(s.charAt(k))) {
                return false;
            }
        }
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            if (solve(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
