/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review221225;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import static review221225.Thoigianonlinelientuc.sdf;

/**
 *
 * @author Admin
 */
class Sinhvien implements Comparable<Sinhvien> {

    private String hoten;
    private long tgonline;

    public Sinhvien(String hoten, String t1, String t2) throws ParseException {
        this.hoten = hoten;
        Date T1 = sdf.parse(t1);
        Date T2 = sdf.parse(t2);

        long time1 = T1.getTime();
        long time2 = T2.getTime();
        this.tgonline = (time2 - time1) / (1000 * 60);
    }

    @Override
    public int compareTo(Sinhvien o) {
        if (o.tgonline != this.tgonline) {
            return Long.compare(o.tgonline, this.tgonline);
        }
        return this.hoten.compareTo(o.hoten);
    }

    @Override
    public String toString() {
        return hoten + " " + tgonline;
    }

}

public class Thoigianonlinelientuc {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("D:\\CODE\\Java\\CodePTIT\\src\\review221225\\ONLINE.in"));
        int T = Integer.parseInt(sc.nextLine());

        ArrayList<Sinhvien> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(list);
        for (Sinhvien x : list) {
            System.out.println(x);
        }
    }
}
