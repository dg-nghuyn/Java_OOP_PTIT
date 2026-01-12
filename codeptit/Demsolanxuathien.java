import java.util.*;

public class Demsolanxuathien {
    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        int T = Nhap.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = Nhap.nextInt();
            int[] Num = new int[N];
            int[] Cnt = new int[100005];
            for (int i = 0; i < N; i++) {
                Num[i] = Nhap.nextInt();
                Cnt[Num[i]]++;
            }
            
            System.out.println("Test " + t + ":");
            
            for (int i = 0; i < N; i++) {
                int x = Num[i];
                if (Cnt[x] > 0) {
                    System.out.println(x + " xuat hien " + Cnt[x] + " lan");
                    Cnt[x] = 0; 
                }
            }
        }
    }
}
