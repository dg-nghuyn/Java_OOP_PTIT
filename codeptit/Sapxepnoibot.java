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
public class Sapxepnoibot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int cnt = 1;
        Boolean check = false;

        for (int i = 0; i < N - 1; i++) {
            check = false;
            for (int j = 0; j < N - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    check = true;
                }
            }
            if (check == true) {
                System.out.print("Buoc " + cnt + ": ");
                for (int k = 0; k < N; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println("");
                cnt++;
            }

        }
    }
}
