/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Khachhang implements Comparable <Khachhang>{
    private String makh, tenkh, gtinh, nsinh, dchi;
    private int ngay, thang, nam;

    public Khachhang(int stt, String tenkh, String gtinh, String nsinh, String dchi) {
        this.makh = String.format("KH%03d", stt);
        this.tenkh = chuanhoaht(tenkh);
        this.gtinh = gtinh;
        this.nsinh = chuanhoans(nsinh);
        this.dchi = dchi;
    }
    
    public String chuanhoaht(String s) {
        s = s.trim().toLowerCase();
        String [] tmp = s.split("\\s+");
        
        StringBuilder res = new StringBuilder();
        for (String x : tmp) {
            String a = String.valueOf(x.charAt(0)).toUpperCase();
            res.append(a);
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }
    
    public String chuanhoans(String s) {
        s = s.trim();
        String [] tmp = s.split("/");
        if (tmp[0].length() == 1) {
            tmp[0] = "0" + tmp[0];
        }
        if (tmp[1].length() == 1) {
            tmp[1] = "0" + tmp[1];
        }
        
        this.ngay = Integer.parseInt(tmp[0]);
        this.thang = Integer.parseInt(tmp[1]);
        this.nam = Integer.parseInt(tmp[2]);
        return tmp[0] + "/" + tmp[1] + "/" + tmp[2];
    }

    @Override
    public int compareTo(Khachhang o) {
        if (this.nam != o.nam) {
            return this.nam - o.nam;
        }
        else if (this.thang != o.thang) {
            return this.thang - o.thang;
        }
        else return this.ngay - o.ngay;
    }

    @Override
    public String toString() {
        return makh + " " + tenkh + " " + gtinh + " " + dchi + " " + nsinh; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
public class Danhsachkhachhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Khachhang> list = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            list.add(new Khachhang (i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(list);
        for (Khachhang x : list) {
            System.out.println(x);
        }
    }
}
