/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam01241125;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tonguocso2 {
    static int[] a = new int[1000005];

    public static void init() {
        for (int i = 1; i <= 500000; i++) {
            for (int j = i * 2; j <= 1000000; j += i) {
                a[j] += i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int l = sc.nextInt();
        int r = sc.nextInt();
        if (l > r) {
            int tmp = l;
            l = r;
            r = tmp;
        }
        int cnt = 0;
        for (int i = l; i <= r; i++) {
            if (a[i] > i) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
