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
public class Xaudoixung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();

            int i = 0, j = s.length() - 1;
            int cnt = 0;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    cnt++;
                }
                i++;
                j--;
            }

            if (cnt == 1 || (cnt == 0 && (s.length() % 2) == 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
