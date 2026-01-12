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
public class Tinhtong {

    public static void main(String[] args) throws Exception {

        long res = 0;
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] A = s.split("\\s+");
            for (String x : A) {
                try {
                    int tmp = Integer.parseInt(x);
                    res += tmp;
                } catch (NumberFormatException e) {

                }
            }
        }
        System.out.println(res);
    }
}
