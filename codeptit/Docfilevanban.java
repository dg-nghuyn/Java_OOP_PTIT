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
public class Docfilevanban {
    public static void main (String [] args) throws Exception {
        Scanner sc = new Scanner (new File("DATA.in"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
