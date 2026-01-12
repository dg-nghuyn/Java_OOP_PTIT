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
public class Phantichthuasonguyento {

    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        int T = Nhap.nextInt();
        for (int t = 1; t <= T; t++) {
            long a = Nhap.nextLong();
            System.out.print("Test " + t + ": ");
            while (a != 0) {
                for (int i = 2; i <= a; i++) {
                    int cnt = 0;
                    while (a % i == 0) {
                        cnt++;
                        a /= i;
                    }
                    if (cnt > 0) System.out.print(i + "(" + cnt + ") ");
                }
                if (a > 1) {
                    System.out.print(a + "(" + 1 + ") ");
                }
                a = 0;
            }
            System.out.println("");
        }
    }
}
