/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Danhdauchucai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeSet<Character> A = new TreeSet <>();
        for (int i = 0; i < s.length(); i++) {
            A.add(s.charAt(i));
        }
        System.out.println(A.size());
    }
}
