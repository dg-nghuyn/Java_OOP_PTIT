/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1_code_java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sapxepchen {
    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        int N = Nhap.nextInt();
        int [] A = new int[N + 5];
        for (int i = 1; i <= N; i++) {
            A[i] = Nhap.nextInt();
        }
        
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            int tmp = A[i];
            int j = i - 1;
            while (j >= 1 && A[j] > tmp) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = tmp;
            cnt++;
            
            System.out.print("Buoc ");
            System.out.print(cnt - 1);
            System.out.print(": ");
            for (int k = 1; k <= cnt; k++) {
                System.out.print(A[k] + " ");
            }
            System.out.println("");
        }
    }
}
