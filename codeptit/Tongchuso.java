/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Tongchuso {

    public static boolean check(char c) {
        boolean flag = false;
        for (int i = 0; i <= 9; i++) {
            if ((c - '0') == i) {
                flag = true;
                break;
            }
        }
        return flag == true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        ois.close();

        for (String x : list) {
            String tmp = "";
            int res = 0;
            for (int i = 0; i < x.length(); i++) {
                if (check(x.charAt(i))) {
                    tmp += x.charAt(i);
                    res += (x.charAt(i) - '0');
                }
            }
            
            BigInteger songuyen = new BigInteger(tmp);
            System.out.println(songuyen + " " + res);
        }
    }
}
