import java.util.Scanner;

public class Tinhluythua {
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
        if (b % 2 == 0) {
            return tmp;
        }
        else return (tmp * a) % MOD;
    }

    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        long a = 1, b = 1;
        while (true) {
            a = Nhap.nextLong();
            b = Nhap.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(Solve(a, b));
        }
    }
}