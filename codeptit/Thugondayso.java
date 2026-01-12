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
public class Thugondayso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] B = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (cnt == 0) {
                B[cnt] = x;
                cnt++;
            }
            else {
                if ((B[cnt - 1] + x) % 2 == 0) {
                    cnt--;
                }
                else {
                    B[cnt] = x;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
