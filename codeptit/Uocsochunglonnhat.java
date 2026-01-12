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
public class Uocsochunglonnhat {
    
    public static int gcd (int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public static int lcm (int a, int b) {
        return (int) ((long) a * b / gcd (a, b));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int A[] = new int [N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            System.out.print(A[0] + " ");
            for (int i = 0; i < N - 1; i ++) {
                System.out.print(lcm(A[i], A[i + 1]) + " ");
            }
            System.out.println(A[N - 1]);
        }
    }
}
