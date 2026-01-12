/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th4_code_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class MonThi {

    String ma, ten, hinhThuc;

    public MonThi(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }
}

class CaThi {

    String ma, ngay, gio, phong;

    public CaThi(int stt, String ngay, String gio, String phong) {
        this.ma = "C" + String.format("%03d", stt);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }
}

class LichThi implements Comparable<LichThi> {

    String maCa, phongThi, tenMon, nhom, soSV;
    String ngayThi, gioThi;
    Date thoiGian;

    public LichThi(String maCa, String ngayThi, String gioThi, String phongThi, String tenMon, String nhom, String soSV, SimpleDateFormat sdf) throws ParseException {
        this.maCa = maCa;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
        this.tenMon = tenMon;
        this.nhom = nhom;
        this.soSV = soSV;
        this.thoiGian = sdf.parse(ngayThi + " " + gioThi);
    }

    @Override
    public int compareTo(LichThi o) {
        if (this.thoiGian.compareTo(o.thoiGian) == 0) {
            return this.maCa.compareTo(o.maCa);
        }
        return this.thoiGian.compareTo(o.thoiGian);
    }

    @Override
    public String toString() {
        return ngayThi + " " + gioThi + " " + phongThi + " " + tenMon + " " + nhom + " " + soSV;
    }
}

public class Problem4 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner monScanner = new Scanner(new File("MONTHI.in"));
        Scanner caScanner = new Scanner(new File("CATHI.in"));
        Scanner lichScanner = new Scanner(new File("LICHTHI.in"));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Map<String, MonThi> mapMon = new HashMap<>();
        int n = Integer.parseInt(monScanner.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = monScanner.nextLine();
            String ten = monScanner.nextLine();
            String ht = monScanner.nextLine();
            mapMon.put(ma, new MonThi(ma, ten, ht));
        }
        monScanner.close();

        Map<String, CaThi> mapCa = new HashMap<>();
        int m = Integer.parseInt(caScanner.nextLine());
        for (int i = 0; i < m; i++) {
            String ngay = caScanner.nextLine();
            String gio = caScanner.nextLine();
            String phong = caScanner.nextLine();
            CaThi ct = new CaThi(i + 1, ngay, gio, phong);
            mapCa.put(ct.ma, ct);
        }
        caScanner.close();

        ArrayList<LichThi> finalList = new ArrayList<>();
        int k = Integer.parseInt(lichScanner.nextLine());
        for (int i = 0; i < k; i++) {
            String[] line = lichScanner.nextLine().split(" ");
            String maCa = line[0];
            String maMon = line[1];
            String nhom = line[2];
            String soSV = line[3];

            CaThi ca = mapCa.get(maCa);
            MonThi mon = mapMon.get(maMon);

            finalList.add(new LichThi(maCa, ca.ngay, ca.gio, ca.phong, mon.ten, nhom, soSV, sdf));
        }
        lichScanner.close();

        Collections.sort(finalList);
        for (LichThi lt : finalList) {
            System.out.println(lt);
        }
    }
}
