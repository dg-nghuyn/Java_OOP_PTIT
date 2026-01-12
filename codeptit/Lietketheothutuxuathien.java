/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lietketheothutuxuathien {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list1 = (ArrayList<String>) ois.readObject();
        ois.close();

        HashSet<String> res1 = new HashSet<>();
        for (String s : list1) {
            String[] tmp = s.trim().split("\\s+");
            for (String x : tmp) {
                res1.add(x.toLowerCase());
            }
        }
        
        Scanner sc = new Scanner (new File ("VANBAN.in"));

        HashSet<String> res2 = new HashSet<>();
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            if (res1.contains(word)) {
                if (!res2.contains(word)) {
                    System.out.println(word);
                    res2.add(word);
                }
            }
        }
    }
}