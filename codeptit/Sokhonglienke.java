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
public class Sokhonglienke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();

            Boolean check = true;
            int sum = 0;
            sum += (s.charAt(0) - '0');
            for (int i = 1; i < s.length(); i++) {
                if (Math.abs((s.charAt(i) - '0') - (s.charAt(i - 1) - '0')) != 2) {
                    check = false;
                    break;
                }
                sum += (s.charAt(i) - '0');
            }

            if (check == false) {
                System.out.println("NO");
            } else if (sum % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
