/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Loaibosonguyen {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));

        ArrayList<String> res = new ArrayList<>();

        while (sc.hasNextLine()) {
            String tmp = sc.nextLine();
            String[] A = tmp.split("\\s+");
            for (String x : A) {
                try {
                    Integer.parseInt(x);
                } catch (NumberFormatException e) {
                    res.add(x);
                }
            }
        }

        Collections.sort(res);
        for (String k : res) {
            System.out.print(k + " ");
        }
        System.out.println("");
    }
}