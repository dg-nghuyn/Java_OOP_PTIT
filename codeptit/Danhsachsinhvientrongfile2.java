/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Sinhvien {

    private String ma, ten, lop, ngaysinh;
    private double gpa;

    public Sinhvien(int id, String ten, String lop, String ngaysinh, double gpa) {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = chuanHoa(ngaysinh);
        this.gpa = gpa;
    }

    private String chuanHoa(String s) {
        String[] p = s.split("/");
        String d = p[0], m = p[1], y = p[2];
        if (d.length() == 1) {
            d = "0" + d;
        }
        if (m.length() == 1) {
            m = "0" + m;
        }
        return d + "/" + m + "/" + y;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", gpa);
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}

public class Danhsachsinhvientrongfile2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\SV.in"));
        int T = sc.nextInt();
        sc.nextLine();

        ArrayList<Sinhvien> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());

            Sinhvien sv = new Sinhvien(i, ten, lop, ns, gpa);
            list.add(sv);
        }

        for (Sinhvien x : list) {
            System.out.println(x);
        }
    }
}
