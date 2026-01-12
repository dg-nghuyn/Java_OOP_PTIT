/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hopcuahaidayso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, cnt = 0;
        n = sc.nextInt();
        m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[n + m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            c[cnt++] = a[i];
        }

        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
            c[cnt++] = b[j];
        }

        Arrays.sort(c, 0, n + m);

        System.out.print(c[0] + " ");

        for (int i = 1; i < n + m; i++) {
            if (c[i] != c[i - 1]) {
                System.out.print(c[i] + " ");
            }
        }
        System.out.println("");
    }
}
