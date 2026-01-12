import java.util.*;

public class Diemcanbang {

    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        int T = Nhap.nextInt();
        while (T-- > 0) {
            int N = Nhap.nextInt();
            int A[] = new int[N + 5];
            long B[] = new long[N + 5];
            B[0] = 0;
            long res = 0;

            for (int i = 1; i <= N; i++) {
                A[i] = Nhap.nextInt();
                B[i] = B[i - 1] + A[i];
                res += A[i];
            }

            int flag = -1;
            for (int i = 1; i <= N; i++) {
                if (B[i] == (res - B[i] + A[i])) {
                    flag = i;
                    break;
                }
            }

            System.out.println(flag);
        }
    }
}