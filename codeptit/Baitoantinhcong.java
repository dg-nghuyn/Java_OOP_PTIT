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
class Nhanvien {
    private String mnv, ten;
    private int luong, thuong, phucap, thunhap;

    public Nhanvien(String ten, int luong1, int ngaycong, String chucvu) {
        this.mnv = "NV01";
        this.ten = ten;
        this.luong = luong1 * ngaycong;
        this.thuong = tienthuong(this.luong, ngaycong);
        this.phucap = tienphucap(chucvu);
        this.thunhap = luong + thuong + phucap;
    }
    
    private int tienthuong (int luong, int ngaycong) {
        if (ngaycong >= 25) {
            return luong * 20 / 100;
        }
        else if (ngaycong >= 22) {
            return luong * 10 / 100;
        }
        return 0;
    }
    
    private int tienphucap(String chucvu) {
        if (chucvu.equals("GD")) {
            return 250000;
        }
        else if (chucvu.equals("PGD")) {
            return 200000;
        }
        else if (chucvu.equals("TP")) {
            return 180000;
        }
        else if (chucvu.equals("NV")) {
            return 150000;
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.mnv + " " + this.ten + " " + this.luong + " " + this.thuong + " " + this.phucap + " " + this.thunhap; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
public class Baitoantinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String hoten = sc.nextLine();
        int luong = Integer.parseInt(sc.nextLine());
        int ngaycong = Integer.parseInt(sc.nextLine());
        String chucvu = sc.nextLine();
        
        Nhanvien A = new Nhanvien(hoten, luong, ngaycong, chucvu);
        System.out.println(A);
    }
}
