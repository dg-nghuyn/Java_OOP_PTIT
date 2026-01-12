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
public class Tonggiaithua {
    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        int N = Nhap.nextInt();
        long Sum = 0, tmp = 1;
        for (int i = 1; i <= N; i++) {
            tmp = tmp * i;
            Sum += tmp;
//            System.out.println(tmp);
        }
        System.out.println(Sum);
    }
}
