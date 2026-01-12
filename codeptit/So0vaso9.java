/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class So0vaso9 {
    public static void Solve (int N) {
        Queue<String> q = new LinkedList<>();
        q.add("0");
        q.add("9");
        int res = 0;
        while (true) {
            String x = q.poll();
            int tmp = Integer.parseInt(x);
            if (tmp % N == 0 && tmp != 0) {
                res = tmp;
                System.out.println(res);
                return;
            }
            q.add(x + "0");
            q.add(x + "9");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Solve(N);
        }
    }
}
