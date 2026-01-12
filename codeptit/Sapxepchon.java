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
public class Sapxepchon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            int tmp = i;
            for (int j = i + 1; j < N; j++) {
                if (a[j] < a[tmp]) {
                    tmp = j;
                }
            }
            int c = a[i];
            a[i] = a[tmp];
            a[tmp] = c;

            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < N; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("");
        }
    }
}
