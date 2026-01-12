package th2_code_java;
import java.util.*;

class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public boolean check(String nganh) {
        nganh = nganh.trim().toLowerCase();
        if (nganh.equals("ke toan")) 
            return ma.contains("DCKT");
        if (nganh.equals("cong nghe thong tin")) 
            return ma.contains("DCCN") && !lop.startsWith("E");
        if (nganh.equals("an toan thong tin")) 
            return ma.contains("DCAT") && !lop.startsWith("E");
        if (nganh.equals("vien thong")) 
            return ma.contains("DCVT");
        if (nganh.equals("dien tu")) 
            return ma.contains("DCDT");
        return false;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            ds.add(new SinhVien(ma, ten, lop, email));
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String nganh = sc.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
            for (SinhVien sv : ds)
                if (sv.check(nganh))
                    System.out.println(sv);
        }
    }
}
