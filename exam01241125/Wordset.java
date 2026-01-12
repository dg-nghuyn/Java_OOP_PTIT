/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam01241125;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
class WordSet {

    private Set<String> set;

    public WordSet(String s) {
        set = new TreeSet<>();
        String[] arr = s.toLowerCase().trim().split("\\s+");
        for (String w : arr) {
            set.add(w);
        }
    }

    public WordSet union(WordSet other) {
        WordSet res = new WordSet("");
        res.set.addAll(this.set);
        res.set.addAll(other.set);
        return res;
    }

    public WordSet intersection(WordSet other) {
        WordSet res = new WordSet("");
        for (String w : this.set) {
            if (other.set.contains(w)) {
                res.set.add(w);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String w : set) {
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }
}

public class Wordset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
