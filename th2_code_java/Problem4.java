package th2_code_java;

import java.util.*;
import java.io.*;
import java.text.*;

class Khach implements Comparable<Khach> {
    private String ma, ten, phong;
    private long songay;

    public Khach(int stt, String ten, String phong, String den, String di) throws ParseException {
        this.ma = String.format("KH%02d", stt);
        this.ten = ten;
        this.phong = phong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long diff = sdf.parse(di).getTime() - sdf.parse(den).getTime();
        this.songay = diff / (1000 * 60 * 60 * 24);
    }

    public long getSongay() {
        return songay;
    }

    @Override
    public int compareTo(Khach o) {
        return Long.compare(o.songay, this.songay);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phong + " " + songay;
    }
}

public class Problem4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Khach> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine();
            String phong = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            ds.add(new Khach(i, ten, phong, den, di));
        }

        Collections.sort(ds);
        for (Khach k : ds) {
            System.out.println(k);
        }
    }
}