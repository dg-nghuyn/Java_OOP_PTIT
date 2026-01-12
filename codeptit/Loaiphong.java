/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class Phong implements Comparable <Phong> {
    
    private String loaiphong, tenloaiphong, dongiangay, phiphucvu;

    public Phong(String line) {
        String [] arr = line.split("\\s+");
        this.loaiphong = arr[0];
        this.tenloaiphong = arr[1];
        this.dongiangay = arr[2];
        this.phiphucvu = arr[3];
    }

    @Override
    public String toString() {
        return loaiphong + " " + tenloaiphong + " " + dongiangay + " " + phiphucvu; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Phong o) {
        return this.tenloaiphong.compareTo(o.tenloaiphong); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
public class Loaiphong {
    public static void main(String[] args) throws IOException {
        ArrayList<Phong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new Phong(in.nextLine()));
        }
        Collections.sort(ds);
        for(Phong tmp : ds){
            System.out.println(tmp);
        }
    }
}
