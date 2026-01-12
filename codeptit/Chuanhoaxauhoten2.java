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
public class Chuanhoaxauhoten2 {

    public static String chuanHoa(String s) {
        s = s.trim();
        s = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        String[] tmp = s.split("\\s+");
        for (int i = 1; i < tmp.length; i++) {
            String a = String.valueOf(tmp[i].charAt(0)).toUpperCase();
            res.append(a);
            res.append(tmp[i].substring(1));
            if (i == tmp.length - 1) {
                res.append(", ");
            } else {
                res.append(" ");
            }
        }
        res.append(tmp[0].toUpperCase());
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
