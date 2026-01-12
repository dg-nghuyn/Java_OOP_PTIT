/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chuanhoaxauhoten1 {

    public static String chuanHoa(String s) {
        s = s.trim();
        s = s.toLowerCase();
        String[] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            if (!x.isEmpty()) {
                String a = String.valueOf(x.charAt(0)).toUpperCase();
                res.append(a);
                res.append(x.substring(1));
                res.append(" ");
            }
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}
