/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hieusonguyenlon1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);

            BigInteger tmp = a.subtract(b).abs();

            StringBuilder res = new StringBuilder(tmp.toString());

            int L = Math.max(s1.length(), s2.length());
            while (res.length() < L) {
                res.insert(0, "0");
            }

            System.out.println(res);
        }
    }
}
