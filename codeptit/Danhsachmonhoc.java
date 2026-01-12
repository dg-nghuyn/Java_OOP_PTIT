/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package codeptit;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class Monhoc implements Comparable <Monhoc> {
    private String mamon, tenmon;
    private String sotinchi;

    public Monhoc(String mamon, String tenmon, String sotinchi) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotinchi = sotinchi;
    }

    @Override
    public String toString() {
        return mamon + " " + tenmon + " " + sotinchi; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Monhoc o) {
        return this.tenmon.compareTo(o.tenmon); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
public class Danhsachmonhoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner (new File ("MONHOC.in"));
        int T = sc.nextInt();
        sc.nextLine();
        
        ArrayList <Monhoc> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            String id = sc.nextLine();
            String subject = sc.nextLine();
            String tinchi = sc.nextLine();
            
            Monhoc mh = new Monhoc (id, subject, tinchi);
            list.add (mh);
        }
        
        Collections.sort(list);
        for (Monhoc k : list) {
            System.out.println(k);
        }
    }
}
