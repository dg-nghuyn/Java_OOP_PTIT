/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Khach implements Comparable<Khach> {

    private String makhachhang, hoten, maphong;
    private long songay;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Khach(int stt, String hoten, String maphong, String ngayden, String ngaydi) throws ParseException {
        this.makhachhang = "KH" + String.format("%02d", stt);
        this.hoten = hoten;
        this.maphong = maphong;
        Date d1 = sdf.parse(ngayden);
        Date d2 = sdf.parse(ngaydi);

        long time1 = d1.getTime();
        long time2 = d2.getTime();

        this.songay = (time2 - time1) / (1000 * 60 * 60 * 24);
    }

    @Override
    public String toString() {
        return makhachhang + " " + hoten + " " + maphong + " " + songay; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Khach o) {
        return (int) (o.songay - this.songay); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

public class Danhsachluutru {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int T = sc.nextInt();
        sc.nextLine();

        ArrayList<Khach> list = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            String hoten = sc.nextLine();
            String maphong = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();

            Khach tmp = new Khach(i, hoten, maphong, den, di);
            list.add(tmp);
        }

        Collections.sort(list);
        for (Khach k : list) {
            System.out.println(k);
        }
    }
}
