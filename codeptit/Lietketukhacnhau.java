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
public class Lietketukhacnhau {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));

        TreeSet<String> res = new TreeSet<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] tmp = s.split("\\s+");
            for (String x : tmp) {
                res.add(x);
            }
        }

        for (String k : res) {
            System.out.println(k);
        }
    }
}
