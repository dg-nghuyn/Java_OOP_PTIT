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
public class TinhtongNsonguyenduongdautien {
    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        int T = Nhap.nextInt();
        while (T > 0) {
            long N = Nhap.nextLong();
            long S = (N + 1) * N / 2;
            System.out.println(S);
            T--;
        }
    }
}
