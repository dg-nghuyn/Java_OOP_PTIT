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
public class Songuyentolonnhattrongfile {

    public static boolean check(int i) {
        if (i < 2) {
            return false;
        }
        if (i > 2 && i % 2 == 0) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int cnt[] = new int[1000001];
        for (Integer i : list) {
            cnt[i]++;
        }
        int tmp = 0;
        for (int k = 1000000; k >= 2; k--) {
            if (cnt[k] > 0) {
                if (check(k)) {
                    System.out.println(k + " " + cnt[k]);
                    tmp++;
                    if (tmp == 10) {
                        break;
                    }
                }
            }
        }
        ois.close();
    }
}
