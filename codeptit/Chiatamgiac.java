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
public class Chiatamgiac {

    public static void solve(int N, int H) {
        for (int i = 1; i < N; i++) {
            double tmp = Math.sqrt((double)i / N) * H;
            System.out.printf("%.6f ",tmp);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            solve(N, H);
        }
    }
}
