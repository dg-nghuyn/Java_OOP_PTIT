/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th4_code_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

class SinhVien {
    String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(String s) {
        s = s.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] arr = s.split(" ");
        String res = "";
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }
}

class MonHoc {
    String ma, ten;
    int soTinChi;

    public MonHoc(String ma, String ten, int soTinChi) {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
    }

    public String getTen() {
        return ten;
    }
}

class BangDiem implements Comparable<BangDiem> {
    SinhVien sv;
    double diem;

    public BangDiem(SinhVien sv, double diem) {
        this.sv = sv;
        this.diem = diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if (this.diem != o.diem) {
            return Double.compare(o.diem, this.diem);
        }
        return this.sv.getMa().compareTo(o.sv.getMa());
    }

    @Override
    public String toString() {
        String diemStr;
        if (this.diem == (long) this.diem) {
            diemStr = String.format("%.0f", this.diem);
        } else {
            diemStr = String.format("%.1f", this.diem);
        }
        return sv.getMa() + " " + sv.getTen() + " " + sv.getLop() + " " + diemStr;
    }
}

public class Problem5 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner svScanner = new Scanner(new File("SINHVIEN.in"));
        Scanner mhScanner = new Scanner(new File("MONHOC.in"));
        Scanner bdScanner = new Scanner(new File("BANGDIEM.in"));

        Map<String, SinhVien> mapSV = new HashMap<>();
        Map<String, MonHoc> mapMH = new HashMap<>();
        
        int n = Integer.parseInt(svScanner.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = svScanner.nextLine();
            String ten = svScanner.nextLine();
            String lop = svScanner.nextLine();
            String email = svScanner.nextLine();
            mapSV.put(ma, new SinhVien(ma, ten, lop, email));
        }
        svScanner.close();

        int m = Integer.parseInt(mhScanner.nextLine());
        for (int i = 0; i < m; i++) {
            String ma = mhScanner.nextLine();
            String ten = mhScanner.nextLine();
            int stc = Integer.parseInt(mhScanner.nextLine());
            mapMH.put(ma, new MonHoc(ma, ten, stc));
        }
        mhScanner.close();

        ArrayList<String[]> rawBangDiem = new ArrayList<>();
        int k = Integer.parseInt(bdScanner.nextLine());
        for (int i = 0; i < k; i++) {
            String[] line = bdScanner.nextLine().split(" ");
            rawBangDiem.add(new String[]{line[0], line[1], line[2]});
        }

        int q = Integer.parseInt(bdScanner.nextLine());
        for (int i = 0; i < q; i++) {
            String maMonQuery = bdScanner.nextLine();
            
            System.out.println("BANG DIEM MON " + mapMH.get(maMonQuery).getTen() + ":");
            
            ArrayList<BangDiem> listBD = new ArrayList<>();
            
            for (String[] entry : rawBangDiem) {
                if (entry[1].equals(maMonQuery)) {
                    SinhVien sv = mapSV.get(entry[0]);
                    double diem = Double.parseDouble(entry[2]);
                    listBD.add(new BangDiem(sv, diem));
                }
            }
            
            Collections.sort(listBD);
            
            for (BangDiem bd : listBD) {
                System.out.println(bd);
            }
        }
        bdScanner.close();
    }
}