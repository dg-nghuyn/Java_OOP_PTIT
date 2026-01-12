/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Songuyentotrongfilenhiphan {

    public static boolean ktra(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SONGUYEN.in")));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();

        int[] cnt = new int[10000];
        for (Integer i : list) {
            cnt[i]++;
        }

        for (int i = 0; i < 10000; i++) {
            if (cnt[i] > 0) {
                if (ktra(i)) {
                    System.out.println(i + " " + cnt[i]);
                }
            }
        }

        ois.close();
    }
}
