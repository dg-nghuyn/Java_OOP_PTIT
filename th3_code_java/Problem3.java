/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th3_code_java;

/**
 *
 * @author Admin
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Admin
 */
class KhachHang implements Comparable<KhachHang> {
    private String ma, hoten, gioitinh, diachi, ngaysinh;

    public KhachHang(int id, String hoten, String gioitinh, String ngaysinh, String diachi) {
        this.ma = String.format("KH%03d", id);
        this.hoten = chuanHoaTen(hoten);
        this.gioitinh = gioitinh.trim();
        this.diachi = diachi.trim();
        this.ngaysinh = chuanHoaNgay(ngaysinh);
    }

    private String chuanHoaTen(String s) {
        s = s.trim().toLowerCase().replaceAll("\\s+", " ");
        String[] arr = s.split(" ");
        String res = "";
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    private String chuanHoaNgay(String s) {
        String[] arr = s.split("/");
        if (arr[0].length() == 1) arr[0] = "0" + arr[0];
        if (arr[1].length() == 1) arr[1] = "0" + arr[1];
        return String.join("/", arr);
    }

    public Date getDate() {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        } catch (ParseException e) {
            return new Date(0);
        }
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.getDate().compareTo(o.getDate());
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + gioitinh + " " + diachi + " " + ngaysinh;
    }
}

public class Problem3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\CODE\\Java\\Code_Java\\src\\th3_code_java\\KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<KhachHang> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String hoten = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();
            ds.add(new KhachHang(i, hoten, gioitinh, ngaysinh, diachi));
        }

        Collections.sort(ds);
        for (KhachHang x : ds) {
            System.out.println(x);
        }
    }
}
