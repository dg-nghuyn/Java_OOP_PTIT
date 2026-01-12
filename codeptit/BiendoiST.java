/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
class Pair {
    int giatri;
    int buoc;

    public Pair(int giatri, int buoc) {
        this.giatri = giatri;
        this.buoc = buoc;
    }    
}
public class BiendoiST {
    public static int solve(int S, int T) {
        Set<Integer> check = new HashSet<>();
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(S, 0));
        check.add(S);
        
        while (!q.isEmpty()) {
            Pair tmp = q.poll();
            if (tmp.giatri == T) {
                return tmp.buoc;
            }
            
            if (tmp.giatri - 1 > 0 && !check.contains(tmp.giatri - 1)) {
                check.add(tmp.giatri - 1);
                q.add(new Pair(tmp.giatri - 1, tmp.buoc + 1));
            }
            
            if (tmp.giatri < T * 2 && !check.contains(tmp.giatri * 2)) {
                check.add(tmp.giatri * 2);
                q.add(new Pair(tmp.giatri * 2, tmp.buoc + 1));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int S = sc.nextInt();
            int T = sc.nextInt();
            System.out.println(solve(S, T));
        }
    }
}
