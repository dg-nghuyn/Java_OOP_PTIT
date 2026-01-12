/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

class Student {
    private String hoten;
    private String ngaysinh;
    private double diem1, diem2, diem3, tong;

    public Student(String hoten, String ngaysinh, double diem1, double diem2, double diem3) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tong = diem1 + diem2 + diem3;
    }
    

    @Override
    public String toString() {
        return (this.hoten + " " + this.ngaysinh + " " + String.format ("%.1f", this.tong)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

public class Khaibaolopthisinh {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double diem1 = sc.nextDouble();
        double diem2 = sc.nextDouble();
        double diem3 = sc.nextDouble();
        
        Student A = new Student (hoTen, ngaySinh, diem1, diem2, diem3);
        System.out.println(A);
    }
}
