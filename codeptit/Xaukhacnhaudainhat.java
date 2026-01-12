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
public class Xaukhacnhaudainhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            
            if (A == null ? B == null : A.equals(B)) {
                System.out.println("-1");
            }
            else {
                System.out.println(Math.max(A.length(), B.length()));
            }
        }
    }
}
