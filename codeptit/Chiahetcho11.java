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
public class Chiahetcho11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger N = sc.nextBigInteger();
            BigInteger tmp = N.mod(BigInteger.valueOf(11));
            if (tmp.compareTo(BigInteger.ZERO) == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
