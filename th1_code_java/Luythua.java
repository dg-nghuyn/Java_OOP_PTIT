/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package th1_code_java;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Luythua {
    public static final long MOD = 1000000007;
    
    public static long Solve(long a, long b) {
        a %= MOD;
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        long tmp = Solve(a, b / 2);
        tmp = (tmp * tmp) % MOD;
        if (b % 2 == 1) {
            tmp = (tmp * a) % MOD;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner Nhap = new Scanner (System.in);
        long a = 1, b = 1;
        while (true) {
            a = Nhap.nextLong();
            b = Nhap.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            else {
                System.out.println(Solve(a, b));
            }
        }
    }
}
