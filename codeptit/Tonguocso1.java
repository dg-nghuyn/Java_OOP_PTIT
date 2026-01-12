
import java.util.Scanner;

public class Tonguocso1 {

    static final int MAX = 2000000;
    static int[] pri = new int[MAX + 1];

    static void Songuyento() {
        for (int i = 2; i <= MAX; i++) {
            pri[i] = i;
        }
        for (int i = 2; i * i <= MAX; i++) {
            if (pri[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (pri[j] == j) {
                        pri[j] = i;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Songuyento();

        Scanner Nhap = new Scanner(System.in);
        int N = Nhap.nextInt();
        long tmp = 0;
        while (N-- > 0) {
            int a = Nhap.nextInt();
            while (a > 1) {
                tmp += pri[a];
                a /= pri[a];
            }
        }
        System.out.println(tmp);
    }
}

/*
static final int MAX 2000000
static int[] pri = static new int[MAX + 1]
*/
