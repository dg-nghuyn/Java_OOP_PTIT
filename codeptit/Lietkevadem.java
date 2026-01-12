/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class So implements Comparable<So> {

    private int so;
    private int dem;

    public So(int so, int dem) {
        this.so = so;
        this.dem = dem;
    }

    public int getSo() {
        return so;
    }

    public int getDem() {
        return dem;
    }

    public int tangDem() {
        return dem++;
    }

    @Override
    public int compareTo(So o) {
        return o.dem - this.dem;
    }

    @Override
    public String toString() {
        return so + " " + dem; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

public class Lietkevadem {

    public static boolean checkkhonggiam(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static int timvitri(ArrayList<So> list, int val) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSo() == val) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner (new File ("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\INPUT.in"));
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (checkkhonggiam(n)) {
                    if (map.containsKey(n)) {
                        map.put(n, map.get(n) + 1);
                    } else {
                        map.put(n, 1);
                    }
                }
            }
        }

        ArrayList<So> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new So(entry.getKey(), entry.getValue()));
        }
        Collections.sort(list);

        for (So s : list) {
            System.out.println(s);
        }
    }
}
