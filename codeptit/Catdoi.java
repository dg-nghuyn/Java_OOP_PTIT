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
public class Catdoi {

    public static int Chiadoi(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else if (a == 8) {
            return 0;
        } else if (a == 9) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String s;
            s = sc.nextLine();

            int tmp;
            String res = "";
            Boolean check = true;

            for (int i = 0; i < s.length(); i++) {
                tmp = Chiadoi(s.charAt(i) - '0');
                if (tmp == -1) {
                    check = false;
                    break;
                } else {
                    res += (char) (tmp + '0');
                }
                        
            }

            if (check == true) {
                long so = Long.parseLong(res);
                if (so == 0) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(so);
                }
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
