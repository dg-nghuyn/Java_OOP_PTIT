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
public class Dayuuthe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            int[] A = new int[tmp.length];

            for (int i = 0; i < tmp.length; i++) {
                A[i] = Integer.parseInt(tmp[i]);
            }

            int chan = 0, le = 0;
            for (int i = 0; i < tmp.length; i++) {
                if (A[i] % 2 == 0) {
                    chan++;
                } else {
                    le++;
                }
            }

            boolean flag = false;
            if (tmp.length % 2 == 0) {
                if (chan > le) {
                    flag = true;
                }
            } else {
                if (le > chan) {
                    flag = true;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
