/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review221225;

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

    public static boolean check(int a) {
        if (a < 100) {
            return false;
        }
        if (a > 999 && a < 10000) {
            return false;
        }
        if (a > 99999) {
            return false;
        }

        int tmp = a;
        int res = 0;
        while (tmp != 0) {
            int x = (tmp % 10);
            if (x % 2 == 0) {
                return false;
            }
            res = res * 10 + x;
            tmp /= 10;
        }
        return res == a;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ois1.close();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();

        int[] a = new int[1000000];
        int[] b = new int[1000000];

        for (Integer x : list1) {
            a[x]++;
        }
        for (Integer y : list2) {
            b[y]++;
        }

        int cnt = 0;
        for (int i = 100; i <= 999; i++) {
            if (a[i] > 0 && b[i] > 0) {
                if (check(i)) {
                    System.out.println(i + " " + (a[i] + b[i]));
                    cnt++;
                    if (cnt == 10) {
                        break;
                    }
                }
            }
        }

        if (cnt < 10) {
            for (int j = 10000; j <= 99999; j++) {
                if (a[j] > 0 && b[j] > 0) {
                    if (check(j)) {
                        System.out.println(j + " " + (a[j] + b[j]));
                        cnt++;
                        if (cnt == 10) {
                            break;
                        }
                    }
                }
            }
        }
    }
}
