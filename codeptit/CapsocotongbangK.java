/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CapsocotongbangK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {

            int N = sc.nextInt();
            Long K = sc.nextLong();

            Long[] A = new Long[N + 5];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextLong();
            }

            Arrays.sort(A, 1, N + 1);
            long cnt = 0;

            int i = 1, j = N;
            while (i < j) {
                long sum = A[i] + A[j];

                if (sum == K) {

                    // nếu 2 đầu bằng nhau
                    if (Objects.equals(A[i], A[j])) {
                        long x = j - i + 1;
                        cnt += x * (x - 1) / 2;   // C(n,2)
                        break;
                    }

                    // đếm số trùng bên trái
                    long l = 1, r = 1;
                    while (i + 1 < j && A[i].equals(A[i + 1])) {
                        l++;
                        i++;
                    }

                    // đếm số trùng bên phải — CHỖ LỖI ĐÃ SỬA
                    while (j - 1 > i && A[j].equals(A[j - 1])) {
                        r++;
                        j--;
                    }

                    cnt += l * r;
                    i++;
                    j--;

                } else if (sum < K) {
                    i++;
                } else {
                    j--;
                }
            }

            System.out.println(cnt);
        }
    }
}
