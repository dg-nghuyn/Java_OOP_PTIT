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
public class KiemtrasoFibonacci {
    static long Fibo[] = new long [95];
    
    public static void Sinh() {
        Fibo[0] = 0;
        Fibo[1] = 1;
        for (int i = 2; i <= 92; i++) {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
    }
    

    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        int T = Nhap.nextInt();
        KiemtrasoFibonacci.Sinh();
        while (T > 0) {
            long n = Nhap.nextLong();
            boolean flag = false;
            for (int j = 0; j <= 92; j++) {
                if (Fibo[j] == n) {
                    flag = true;
                    break;
                }
                else if (Fibo[j] > n){
                    break;
                }
            }
            if (flag == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
