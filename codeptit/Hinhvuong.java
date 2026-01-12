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
public class Hinhvuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, x4, y4;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x4 = sc.nextInt();
        y4 = sc.nextInt();

        int a = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int b = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int c = Math.max(Math.max(y1, y2), Math.max(y3, y4));
        int d = Math.min(Math.min(y1, y2), Math.min(y3, y4));

        int res = Math.max(Math.abs(a - b), Math.abs(c - d));
        System.out.println(res * res);
    }
}
