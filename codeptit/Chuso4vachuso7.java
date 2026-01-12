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
public class Chuso4vachuso7 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int tmp4 = 0, tmp7 = 0;
        for (int i = 0;i < s.length(); i++) {
            if (s.charAt(i) == '4') {
                tmp4++;
            }
            else if (s.charAt(i) == '7') {
                tmp7++;
            }
        }
        if ((tmp4 + tmp7) == 4 || (tmp4 + tmp7) == 7) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
