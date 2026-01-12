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
public class Giaocuahaidayso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        int[] a = new int[n + 1];
        int[] b = new int[m + 1];
        int[] res = new int[Math.max(n + 1, m + 1)];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int j = 1; j <= m; j++) {
            b[j] = sc.nextInt();
        }

        Arrays.sort(a, 1, n + 1);
        Arrays.sort(b, 1, m + 1);

        int i = 1, j = 1, cnt = 1;
        while (i <= n && j <= m) {
            if (a[i] == b[j]) {
                if (cnt == 1 || res[cnt - 1] != a[i]) {
                    res[cnt++] = a[i];
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        for (int k = 1; k < cnt; k++) {
            System.out.print(res[k] + " ");
        }
        System.out.println("");
    }
}
