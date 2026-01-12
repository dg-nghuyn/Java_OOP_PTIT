/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Tapturiengcuahaixau {

    public static void solve(String s1, String s2) {
        String[] tmp1 = s1.trim().split("\\s+");
        String[] tmp2 = s2.trim().split("\\s+");
        
        TreeSet<String> A = new TreeSet<>();
        TreeSet<String> B = new TreeSet<>();
        
        for (String x : tmp1) {
            A.add(x);
        }
        for (String x : tmp2) {
            B.add(x);
        }
        
        for (String x : A) {
            if (!B.contains(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            solve(s1, s2);
            System.out.println("");
        }
    }
}
