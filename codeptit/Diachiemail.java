/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Diachiemail {

    static ArrayList<String> A = new ArrayList<>();

    public static void solve(String s) {
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        res.append(tmp[tmp.length - 1]);
        for (int i = 0; i < tmp.length - 1; i++) {
            String a = String.valueOf(tmp[i].charAt(0));
            res.append(a);
        }
        int cnt = 0;
        for (String x : A) {
            if (x.equals(res.toString())) {
                cnt++;
            }
        }
        A.add(res.toString());
        if (cnt == 0) {
            System.out.println(res + "@ptit.edu.vn");
        } else {
            System.out.println(res.toString() + (cnt + 1) + "@ptit.edu.vn");
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
