/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Sinhvien {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String msv, hoten, lop, ngaysinh;
    private float gpa;

    public Sinhvien() {
        msv = "B20DCCN001";
        hoten = lop = "";
        gpa = 0;
    }

    public void nhap(Scanner sc) {
        hoten = sc.nextLine();
        lop = sc.nextLine();
        ngaysinh = sc.nextLine();
        ngaysinh = chuanhoangaysinh(ngaysinh);
        gpa = Float.parseFloat(sc.nextLine());
    }

    private String chuanhoangaysinh(String s) {
        String[] tmp = s.split("/");
        String d = String.format("%02d", Integer.parseInt(tmp[0]));
        String m = String.format("%02d", Integer.parseInt(tmp[1]));
        String y = tmp[2];
        return d + "/" + m + "/" + y;
    }

    @Override
    public String toString() {
        return msv + " " + hoten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", gpa); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}

public class Khaibaolopsinhvien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sinhvien A = new Sinhvien();
        A.nhap(sc);
        System.out.println(A);
    }
}
