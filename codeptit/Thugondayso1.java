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
public class Thugondayso1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int cnt = 0, x = 0;
        for (int i = 0; i < N; i++) {
            x = sc.nextInt();
            if (cnt == 0) {
                A[cnt] = x;
                cnt++;
            }
            else {
                if ((A[cnt - 1] + x ) % 2 == 0) {
                    cnt--;
                }
                else {
                    A[cnt] = x;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
