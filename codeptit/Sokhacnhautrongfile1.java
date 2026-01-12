/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Sokhacnhautrongfile1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\DATA.in"));

        TreeSet<Integer> A = new TreeSet<>();
        int[] B = new int[100005];

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String tmp[] = s.split("\\s+");
            for (String x : tmp) {
                int a = Integer.parseInt(x);
                A.add(a);
                B[a]++;
            }
        }

        for (int k : A) {
            System.out.println(k + " " + B[k]);
        }
    }
}
