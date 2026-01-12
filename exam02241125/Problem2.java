/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam02241125;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.text.*;

/**
 *
 * @author Admin
 */
class SinhVien {

    static int id = 0;
    private String code = "B20DCCN", name = "", group;
    private double GPA;
    private SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
    private Date dateOfBirth;

    public SinhVien(String nameNotFormat, String group, Date dateOfBirth, double GPA) {
        id += 1;
        this.code += String.format("%03d", id);
        String tmp[] = nameNotFormat.trim().split("\\s+");
        for (int i = 0; i < tmp.length; i++) {
            this.name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        this.name = this.name.trim();
        this.group = group;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.group + " " + myDate.format(dateOfBirth) + " " + String.format("%.2f", GPA);
    }
}

public class Problem2 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SimpleDateFormat myDate = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<SinhVien> solve = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            solve.add(new SinhVien(sc.nextLine(), sc.nextLine(), myDate.parse(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for (SinhVien x : solve) {
            System.out.println(x);
        }
    }

}
