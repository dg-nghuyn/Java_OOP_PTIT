/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review221225;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import static review221225.Danhsachcathi.sdf1;
import static review221225.Danhsachcathi.sdf2;

/**
 *
 * @author Admin
 */
class Cathi implements Comparable<Cathi> {

    private String macathi, ngaythi, giothi, phongthi;
    private long tmp1, tmp2;

    public Cathi(int sothutu, String ngaythi, String giothi, String phongthi) throws ParseException {
        this.macathi = String.format("C%03d", sothutu);
        this.ngaythi = ngaythi;
        this.giothi = giothi;
        this.phongthi = phongthi;
        Date ngay = sdf1.parse(ngaythi);
        Date gio = sdf2.parse(giothi);

        tmp1 = ngay.getTime();
        tmp2 = gio.getTime();
    }

    @Override
    public String toString() {
        return macathi + " " + ngaythi + " " + giothi + " " + phongthi;
    }

    @Override
    public int compareTo(Cathi o) {
        if (this.tmp1 != o.tmp1) {
            return (Long.compare(this.tmp1, o.tmp1));
        }
        if (this.tmp2 != o.tmp2) {
            return (Long.compare(this.tmp2, o.tmp2));
        }
        return this.macathi.compareTo(o.macathi);
    }

}

public class Danhsachcathi {

    public static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int T = Integer.parseInt(sc.nextLine());

        ArrayList<Cathi> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            Cathi tmp = new Cathi(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(tmp);
        }

        Collections.sort(list);
        for (Cathi x : list) {
            System.out.println(x);
        }
    }
}
