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
public class Solienke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();

            Boolean check = true;
            for (int i = 1; i < s.length(); i++) {
                if (Math.abs((s.charAt(i) - '0') - (s.charAt(i - 1) - '0')) != 1) {
                    check = false;
                    break;
                }
            }

            if (check == false) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
