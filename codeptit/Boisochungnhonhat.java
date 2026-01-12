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
public class Boisochungnhonhat {

    public static BigInteger BCNN(BigInteger a, BigInteger b) {
        BigInteger res = a.gcd(b);
        return a.divide(res).multiply(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            BigInteger a, b;
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();

            System.out.println(BCNN(a, b));
        }
    }
}
