/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1_code_java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Phuongtrinh {
    public static void main (String [] arg) {
        Scanner Nhap = new Scanner (System.in);
        float a, b;
        a = Nhap.nextFloat();
        b = Nhap.nextFloat();
        
        if (a == 0 && b == 0) {
            System.out.println("VSN");
        }
        else if (a == 0 && b != 0) {
            System.out.println("VN");
        }
        else {
            float x = -b / a;
            System.out.println(String.format("%.2f", x));
        }
    }
}
