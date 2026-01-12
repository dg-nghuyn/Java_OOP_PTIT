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
public class Chiahet {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            
            BigInteger tmp1 = a.mod(b);
            BigInteger tmp2 = b.mod(a);
            
            if (tmp1.compareTo(BigInteger.ZERO) == 0 || tmp2.compareTo(BigInteger.ZERO) == 0) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
