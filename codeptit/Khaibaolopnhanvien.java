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

    private String mnv, hoten, gioitinh, ngaysinh, diachi, mst, ngaykhd;

    public Nhanvien() {
        mnv = "00001";
        hoten = gioitinh = ngaysinh = diachi = mst = ngaykhd = "";
    }

    public void nhap(Scanner sc) {
        hoten = sc.nextLine();
        gioitinh = sc.nextLine();
        ngaysinh = sc.nextLine();
        diachi = sc.nextLine();
        mst = sc.nextLine();
        ngaykhd = sc.nextLine();
    }

    @Override
    public String toString() {
        return mnv + " " + hoten + " " + gioitinh + " " + ngaysinh + " " + diachi + " " + mst + " " + ngaykhd; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

public class Khaibaolopnhanvien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nhanvien A = new Nhanvien();
        A.nhap(sc);
        System.out.println(A);
    }
}
