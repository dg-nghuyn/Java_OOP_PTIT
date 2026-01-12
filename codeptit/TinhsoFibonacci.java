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
public class TinhsoFibonacci {
    static long[] Fibo = new long[95];
    
    public static void Sinh() {
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int j = 3; j <= 92; j++) {
            Fibo[j] = Fibo[j - 1] + Fibo[j - 2];
        }
    }
    public static void main (String [] args) {
        Scanner Nhap = new Scanner(System.in);
        int T = Nhap.nextInt();
        TinhsoFibonacci.Sinh();
        while (T > 0) {
            int x = Nhap.nextInt();
            System.out.println(Fibo[x]);
            T--;
        }
    }
}
