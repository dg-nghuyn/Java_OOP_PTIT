/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chuanhoaxauhotentrongfile {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            s = s.trim().toLowerCase();
            String[] res = s.split("\\s+");
            StringBuilder tmp = new StringBuilder();
            for (String x : res) {
                if (s.equals("end")) {
                    break;
                } else {
                    String a = String.valueOf(x.charAt(0)).toUpperCase();
                    tmp.append(a);
                    tmp.append(x.substring(1));
                    tmp.append(" ");
                }
            }
            System.out.println(tmp);
        }
    }
}
