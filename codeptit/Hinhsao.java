/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hinhsao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> A = new HashMap<>();

        for (int n = 1; n < N; n++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();

            A.put(u, A.getOrDefault(u, 0) + 1);
            A.put(v, A.getOrDefault(v, 0) + 1);
        }

        int cnt = 0;
        for (int tmp : A.keySet()) {
            if (A.get(tmp) == N - 1) {
                cnt++;
            }
        }

        if (N == 1) {
            System.out.println("Yes");
        } else if (cnt == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
