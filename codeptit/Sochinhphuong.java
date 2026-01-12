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
public class Sochinhphuong {
    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        int T = Nhap.nextInt();
        while (T-- > 0) {
            long a = Nhap.nextLong();
            long tmp = (long) Math.sqrt(a);
            if (tmp * tmp == a) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
