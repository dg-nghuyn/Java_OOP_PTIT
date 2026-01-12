import java.util.*;

public class Boisonhonhatcuanso {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        int T = Nhap.nextInt(); 
        while (T-- > 0) {
            int n = Nhap.nextInt();
            long res = 1;
            for (int i = 2; i <= n; i++) {
                res = lcm(res, i);
            }
            System.out.println(res);
        }
    }
}
