import java.util.*;

public class Mangdoixung {

    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
        int T = Nhap.nextInt();
        while (T-- > 0) {
            int N = Nhap.nextInt();
            int A[] = new int [N];
            for (int i = 0; i < N; i++) {
                A[i] = Nhap.nextInt();
            }
            

            boolean flag = true;
            int i = 0, j = N - 1;
            while (i <= j) {
                if (A[i] != A[j]) {
                    flag = false;
                    break;
                }
                else {
                    i++;
                    j--;
                }
            }

            if (flag == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}