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
public class Daotu {

    public static void solve(String s) {
        String[] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String a : tmp) {
            StringBuilder x = new StringBuilder(a);
            x = x.reverse();
            res.append(x);
            res.append(" ");
        }
        res.toString().trim();
        System.out.println(res);
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
