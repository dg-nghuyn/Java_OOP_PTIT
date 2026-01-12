/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tachdoivatinhtong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File ("DATA.in"));
        String s = sc.nextLine();
        
        while (s.length() > 1) {
            int tmp = s.length() / 2;
            String tmp1 = s.substring(0, tmp);
            String tmp2 = s.substring(tmp);
            
            BigInteger a = new BigInteger(tmp1);
            BigInteger b = new BigInteger(tmp2);
            
            BigInteger res = a.add(b);
            System.out.println(res);
            
            s = res.toString();
        }
    }
}
