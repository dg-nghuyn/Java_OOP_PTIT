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
public class Sodep2 {

    public static boolean solve(String s) {
        boolean check = true;
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
            return false;
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

        int tmp = 0;
        for (int k = 0; k < s.length(); k++) {
            tmp = tmp + (int) (s.charAt(k) - '0');
        }
        if (tmp % 10 != 0) {
            return false;
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
