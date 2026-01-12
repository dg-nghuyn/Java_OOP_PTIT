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
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class Capsonguyentotrongfile2 {
    public static boolean check(int k) {
        if (k < 2) {
            return false;
        }
        if (k == 2) {
            return true;
        }
        if (k % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream (new FileInputStream ("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ois1.close();
        
        ObjectInputStream ois2 = new ObjectInputStream (new FileInputStream ("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();
        
        TreeSet<Integer> set1 = new TreeSet<> (list1);
        HashSet<Integer> set2 = new HashSet<> (list2);
        
        for (Integer i : set1) {
            if (i >= 500000) {
                break;
            }
            
            int j = 1000000 - i;
            if (set1.contains(j)) {
                if (!set2.contains(j) && !set2.contains(i)) {
                    if (check(i) && check(j)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}
