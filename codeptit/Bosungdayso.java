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
public class Bosungdayso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        boolean[] flag = new boolean[205];
        int res = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            flag[A[i]] = true;
        }
        res = A[N - 1];
        boolean check = false;
        for (int i = 1; i < res; i++) {
            if (flag[i] == false) {
                System.out.println(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Excellent!");
        }
    }
}
