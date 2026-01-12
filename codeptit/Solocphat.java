/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Solocphat {
    public static void Solve (int N) {
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        
        int cnt = 0;
        ArrayList<String> set = new ArrayList<>();
        while (true) {
            String x = q.poll();
            if (x.length() > N) {
                break;
            }
            set.add(x);
            cnt++;
            q.add(x + "6");
            q.add(x + "8");
        }
        
        System.out.println(cnt);
        for (int i = set.size() - 1; i >= 0; i--) {
            System.out.print(set.get(i) + " ");
        }
        System.out.println("");
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
