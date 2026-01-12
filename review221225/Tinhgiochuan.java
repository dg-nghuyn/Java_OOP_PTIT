/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review221225;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Monhoc {

    private String mamonhoc, tenmonhoc;

    public String getMamonhoc() {
        return mamonhoc;
    }

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public Monhoc(String mamonhoc, String tenmonhoc) {
        this.mamonhoc = mamonhoc;
        this.tenmonhoc = tenmonhoc;
    }
}

class Giangvien {

    private String magiangvien, tengiangvien;
    private double tonggio;

    public String getMagiangvien() {
        return magiangvien;
    }

    public String getTengiangvien() {
        return tengiangvien;
    }

    public Giangvien(String magiangvien, String tengiangvien) {
        this.magiangvien = magiangvien;
        this.tengiangvien = tengiangvien;
        this.tonggio = 0.0;
    }

    public void themgio(double gio) {
        this.tonggio += gio;
    }

    @Override
    public String toString() {
        return tengiangvien + " " + String.format("%.2f", tonggio);
    }
}

public class Tinhgiochuan {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\review221225\\MONHOC.in"));
        Scanner sc2 = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\review221225\\GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\review221225\\GIOCHUAN.in"));

        ArrayList<Monhoc> list1 = new ArrayList<>();
        int a = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < a; i++) {
            list1.add(new Monhoc(sc1.next(), sc1.nextLine().trim()));
        }

        ArrayList<Giangvien> list2 = new ArrayList<>();
        int b = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < b; i++) {
            list2.add(new Giangvien(sc2.next(), sc2.nextLine().trim()));
        }

        int c = Integer.parseInt(sc3.nextLine());
        for (int i = 0; i < c; i++) {
            String mgv = sc3.next();
            String mmh = sc3.next();
            double gio = Double.parseDouble(sc3.next());

            for (Giangvien gv : list2) {
                if (gv.getMagiangvien().equals(mgv)) {
                    gv.themgio(gio);
                    break;
                }
            }
        }
        
        for (Giangvien gv : list2) {
            System.out.println(gv);
        }

    }

}
