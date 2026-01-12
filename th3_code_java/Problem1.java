/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th3_code_java;

import java.util.*;
import java.io.File; // Thêm import
import java.io.FileNotFoundException; // Thêm import

/**
 *
 * @author Admin
 */
class Nguoi implements Comparable<Nguoi> {

    private String hoten;

    public Nguoi(String hoten) {
        this.hoten = chuanHoa(hoten);
    }

    private String chuanHoa(String s) {
        s = s.trim().toLowerCase().replaceAll("\\s+", " ");
        
        String[] arr = s.split(" "); 
        
        String res = "";
        
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String getHoten() {
        return hoten;
    }

    private String getTen() {
        String[] arr = hoten.split(" ");
        return arr[arr.length - 1];
    }

    private String getHo() {
        String[] arr = hoten.split(" ");
        return arr[0];
    }

    private String getDem() {
        String[] arr = hoten.split(" ");
        String res = "";
        for (int i = 1; i < arr.length - 1; i++) {
            res += arr[i] + " ";
        }
        return res.trim();
    }

    @Override 
    public int compareTo(Nguoi o) { 
        if (!this.getTen().equals(o.getTen())) {
            return this.getTen().compareTo(o.getTen());
        }
        if (!this.getHo().equals(o.getHo())) {
            return this.getHo().compareTo(o.getHo());
        }
        return this.getDem().compareTo(o.getDem());
    }

    @Override
    public String toString() {
        return hoten;
    }
}

public class Problem1 {
    public static void main(String[] args) throws FileNotFoundException { 
//        Scanner sc = new Scanner(new File("D:\\CODE\\Java\\Code_Java\\src\\th3_code_java\\DANHSACH.in")); 
        Scanner sc = new Scanner(new File("DANHSACH.in")); 
        ArrayList<Nguoi> ds = new ArrayList<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            
            if (!s.isEmpty()) { 
                ds.add(new Nguoi(s));
            }
        }
        
        Collections.sort(ds);
        for (Nguoi x : ds) {
            System.out.println(x);
        }
    }
}