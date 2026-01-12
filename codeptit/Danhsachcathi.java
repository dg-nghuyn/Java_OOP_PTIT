/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
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
class Cathi implements Comparable<Cathi> {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    private String mct, id;
    private String ngaythi;
    private String giothi;
    private Date thoigian;

    public Cathi(int stt, String ngaythi, String giothi, String id) throws ParseException {
        this.mct = String.format("C%03d", stt);
        this.id = id;
        this.ngaythi = ngaythi;
        this.giothi = giothi;
        
        this.thoigian = sdf.parse(ngaythi + " " + giothi);
    }

    @Override
    public String toString() {
        return mct + " " + ngaythi + " " + giothi + " " + id; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Cathi o) {
        if (this.thoigian.compareTo(o.thoigian) != 0) {
            return this.thoigian.compareTo(o.thoigian);
        }
        return this.mct.compareTo(o.mct);
    }

}

public class Danhsachcathi {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int T = Integer.parseInt(sc.nextLine());

        ArrayList<Cathi> A = new ArrayList<>();
        for (int t = 1; t <= T; t++) {
            String ngaythi = sc.nextLine();
            String giothi = sc.nextLine();
            String id = sc.nextLine();

            Cathi tmp = new Cathi(t, ngaythi, giothi, id);
            A.add(tmp);
        }

        Collections.sort(A);
        for (Cathi x : A) {
            System.out.println(x);
        }
    }
}
