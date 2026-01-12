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
public class Sotamphan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            Boolean flag = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
                    flag = false;
                }
            }

            if (flag == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
