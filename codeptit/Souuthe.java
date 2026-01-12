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
public class Souuthe {

    public static boolean sohople(String s) {
        if (s.charAt(0) == '0') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void solve(String s) {
        if (!sohople(s)) {
            System.out.println("INVALID");
        } else {
            int cnt = s.length();
            int chan = 0, le = 0;
            for (int i = 0; i < s.length(); i++) {
                if ((int) (s.charAt(i) - '0') % 2 == 0) {
                    chan++;
                } else {
                    le++;
                }
            }
            if (chan == le) {
                System.out.println("NO");
            } else if ((cnt % 2 == 0) && (chan > le)) {
                System.out.println("YES");
            } else if ((cnt % 2 == 1) && (le > chan)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
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
