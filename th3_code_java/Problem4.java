/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th3_code_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Admin
 */

public class Problem4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int N = Integer.parseInt(sc.nextLine());
        
        HashMap<String, Integer> map = new HashMap<>();
        while (N-- > 0) {
            String line = sc.nextLine().toLowerCase();
            line = line.replaceAll("[,\\.!\\?:;\\(\\)\\-\\/]", " ");
            String[] words = line.trim().split("\\s+");
            for (String w : words) {
                if (!w.isEmpty()) {
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                if (!a.getValue().equals(b.getValue())) 
                    return b.getValue() - a.getValue();
                return a.getKey().compareTo(b.getKey());
            }
        });

        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}