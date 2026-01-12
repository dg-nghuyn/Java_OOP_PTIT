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

class Khachhang implements Comparable <Khachhang>{
    String mkh, hoten;
    double tientdm, tienvdm, vat, tongtien;

    public Khachhang(int stt, String hoten, String loaiho, double sodau, double socuoi) {
        this.mkh = String.format("KH%02d", stt);
        this.hoten = chuanhoa(hoten);
        
        double sodien = socuoi - sodau;
        int dm = dinhmuc(loaiho);
        
        if (sodien < dm) {
            this.tientdm = sodien * 450;
        }
        else this.tientdm = dm * 450;
        
        if (sodien > dm) {
            this.tienvdm = (sodien - dm) * 1000;
        }
        else this.tienvdm = 0;
        
        this.vat = tienvdm * 0.05;
        
        this.tongtien = tientdm + tienvdm + vat;
    }

    @Override
    public String toString() {
        return mkh + " " + hoten + " " + String.format("%.0f", tientdm) + " " + String.format("%.0f", tienvdm) + " " + String.format("%.0f", vat) + " " + String.format("%.0f", tongtien); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public int compareTo(Khachhang o) {
        return Double.compare(o.tongtien, this.tongtien); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String chuanhoa(String s) {
        s = s.trim().toLowerCase();
        String[] tmp = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }
    
    private int dinhmuc(String s) {
        if ("A".equals(s)) {
            return 100;
        }
        else if ("B".equals(s)) {
            return 500;
        }
        else return 200;
    }
}
public class Tinhtiendien {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner (new File ("KHACHHANG.in"));
        int T = Integer.parseInt(sc.nextLine());
        
        ArrayList<Khachhang> A = new ArrayList<>();
        for (int t = 1; t <= T; t++) {
            String hoten = sc.nextLine();
            
            String line = sc.nextLine();
            String [] data = line.trim().split("\\s+");
            
            String loaiho = data[0];
            double sodau = Double.parseDouble(data[1]);
            double socuoi = Double.parseDouble(data[2]);
            
            Khachhang tmp = new Khachhang(t, hoten, loaiho, sodau, socuoi);
            A.add(tmp);
        }
        
        Collections.sort(A);
        for (Khachhang x : A) {
             System.out.println(x);
        }
    }
}
