/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;

class MonHoc {
    private String ma, ten;
    private int tc;

    public MonHoc(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}

class NhomHP {
    private String maHP, maMon, gv, phong;
    private int thu, kip;

    public NhomHP(int stt, String maMon, int thu, int kip, String gv, String phong) {
        this.maHP = String.format("HP%03d", stt);
        this.maMon = maMon;
        this.thu = thu;
        this.kip = kip;
        this.gv = gv;
        this.phong = phong;
    }

    public String getMaMon() {
        return maMon;
    }

    public int getThu() {
        return thu;
    }

    public int getKip() {
        return kip;
    }

    @Override
    public String toString() {
        return maHP + " " + thu + " " + kip + " " + gv + " " + phong;
    }
}

public class Lichgiangdaytheomonhoc {

    private static HashMap<String, MonHoc> docMonHoc() throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, MonHoc> map = new HashMap<>();
        while (n-- > 0) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int tc = Integer.parseInt(sc.nextLine().trim());
            map.put(ma, new MonHoc(ma, ten, tc));
        }
        return map;
    }

    private static ArrayList<NhomHP> docLichGD() throws Exception {
        Scanner sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<NhomHP> list = new ArrayList<>();
        int stt = 1;
        while (m-- > 0) {
            String maMon = sc.nextLine().trim();
            int thu = Integer.parseInt(sc.nextLine().trim());
            int kip = Integer.parseInt(sc.nextLine().trim());
            String gv = sc.nextLine().trim();
            String phong = sc.nextLine().trim();
            list.add(new NhomHP(stt++, maMon, thu, kip, gv, phong));
        }
        String target = sc.nextLine().trim();
        list.add(new NhomHP(0, target, 0, 0, "", "")); // lưu target ở cuối
        return list;
    }

    public static void main(String[] args) throws Exception {
        HashMap<String, MonHoc> mon = docMonHoc();
        ArrayList<NhomHP> lich = docLichGD();

        String target = lich.get(lich.size() - 1).getMaMon();
        lich.remove(lich.size() - 1);

        MonHoc mh = mon.get(target);

        System.out.println("LICH GIANG DAY MON " + mh.getTen() + ":");

        lich.stream()
            .filter(x -> x.getMaMon().equals(target))
            .sorted((a, b) -> {
                if (a.getThu() != b.getThu()) return a.getThu() - b.getThu();
                if (a.getKip() != b.getKip()) return a.getKip() - b.getKip();
                return a.toString().compareTo(b.toString());
            })
            .forEach(x -> System.out.println(x));
    }
}
