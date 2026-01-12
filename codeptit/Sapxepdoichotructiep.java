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
public class Sapxepdoichotructiep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int tmp = 0, cnt = 1;
        Boolean check;
        for (int i = 0; i < N - 1; i++) {
            check = false;
            for (int j = i + 1; j < N; j++) {
                if (a[i] > a[j]) {
                    check = true;
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            if (check == true) {
                System.out.print("Buoc " + cnt + ": ");
                for (int k = 0; k < N; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println(" ");
                cnt++;
            }
        }
    }
}
