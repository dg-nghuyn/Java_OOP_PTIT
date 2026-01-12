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
public class Lietketohop1 {

    static int N, K;
    static int[] A = new int[11];
    static int cnt = 0;

    public static void init() {
        for (int i = 1; i <= N; i++) {
            A[i] = i;
        }
    }

    public static void in() {
        for (int i = 1; i <= K; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }

    public static void quaylui(int i) {
        for (int j = A[i - 1] + 1; j <= N - K + i; j++) {
            A[i] = j;
            if (i == K) {
                Lietketohop1.in();
                cnt++;
            } else {
                quaylui(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        init();
        quaylui(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
