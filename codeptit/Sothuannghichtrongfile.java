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

/**
 *
 * @author Admin
 */
public class Sothuannghichtrongfile {

    public static boolean check(int n) {
        if (n < 100) {
            return false;
        }
        if (n > 999 && n < 10000) {
            return false;
        }
        if (n > 99999) {
            return false;
        }

        int tmp = n;
        int res = 0;
        while (tmp > 0) {
            int a = tmp % 10;
            if (a % 2 == 0) return false;
            res = (res * 10) + a;
            tmp /= 10;
        }
        return res == n;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ois1.close();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();

        int[] cnt1 = new int[1000001];
        int[] cnt2 = new int[1000001];

        for (Integer i : list1) {
            cnt1[i]++;
        }
        for (Integer i : list2) {
            cnt2[i]++;
        }

        int cnt = 0;
        for (int i = 100; i <= 999; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                if (check(i)) {
                    System.out.println(i + " " + (cnt1[i] + cnt2[i]));
                    cnt++;
                    if (cnt == 10) {
                        return;
                    }
                }
            }
        }

        if (cnt < 10) {
            for (int i = 10000; i <= 99999; i++) {
                if (cnt1[i] > 0 && cnt2[i] > 0) {
                    if (check(i)) {
                        System.out.println(i + " " + (cnt1[i] + cnt2[i]));
                        cnt++;
                        if (cnt == 10) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
