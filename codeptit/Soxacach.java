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
public class Soxacach {

    static Scanner sc = new Scanner(System.in);
    // Khai báo biến toàn cục (static) để dùng chung cho các hàm
    static int n;
    static int[] a = new int[15];      // Mảng lưu hoán vị
    static boolean[] used = new boolean[15]; // Mảng đánh dấu

    // Hàm kiểm tra điều kiện "Xa cách"
    public static boolean check() {
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }

    // Hàm Quay lui (Backtracking)
    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!used[j]) {
                a[i] = j;
                used[j] = true; // Đánh dấu

                if (i == n) {
                    if (check()) {
                        for (int k = 1; k <= n; k++) {
                            System.out.print(a[k]);
                        }
                        System.out.println();
                    }
                } else {
                    Try(i + 1);
                }

                // Backtrack (Quay lui)
                used[j] = false; 
            }
        }
    }

    public static void solve() {
        n = sc.nextInt();
        // Reset mảng đánh dấu trước mỗi test case
        for (int i = 1; i <= n; i++) {
            used[i] = false;
        }
        
        Try(1);
        System.out.println(); // In dòng trống sau mỗi test
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}