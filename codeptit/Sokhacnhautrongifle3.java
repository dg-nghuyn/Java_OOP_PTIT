/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class Sokhacnhautrongifle3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream ("DATA.in"))) {
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
            Collections.sort(list);
            int [] cnt = new int [1000];
            for (Integer i : list) {
                cnt[i]++;
            }
            for (int i = 0; i < 1000; i++) {
                if (cnt[i] > 0) {
                    System.out.println(i + " " + cnt[i]);
                    
                }
            }
        }
    }
}
