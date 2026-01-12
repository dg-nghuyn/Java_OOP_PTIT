package th2_code_java;

import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class HocSinh {
    private String maHS;
    private String hoTen;
    private double[] diem = new double[10];
    private double diemTB;
    private String xepLoai;

    public String getMaHS() { 
        return maHS; 
    }

    public double getDiemTB() { 
        return diemTB; 
    }

    @Override
    public String toString() {
        return maHS + " " + hoTen + " " + String.format("%.1f", diemTB) + " " + xepLoai;
    }

    public HocSinh(int stt, Scanner sc) {
        this.maHS = String.format("HS%02d", stt);
        String name;
        do {
            name = sc.nextLine();
        } while (name != null && name.trim().isEmpty());
        this.hoTen = name.trim();

        List<String> toks = new ArrayList<>();
        while (toks.size() < 10) {
            String line = sc.nextLine();
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;
            String[] parts = line.split("\\s+");
            for (String p : parts) if (!p.isEmpty()) toks.add(p);
        }

        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            BigDecimal bd = new BigDecimal(toks.get(i));
            this.diem[i] = bd.doubleValue();  
            int coef = (i == 0 || i == 1) ? 2 : 1;
            total = total.add(bd.multiply(BigDecimal.valueOf(coef)));
        }

        BigDecimal avg = total.divide(BigDecimal.valueOf(12), 10, RoundingMode.HALF_UP);
        avg = avg.setScale(1, RoundingMode.HALF_UP);
        this.diemTB = avg.doubleValue();

        if (diemTB >= 9.0) xepLoai = "XUAT SAC";
        else if (diemTB >= 8.0) xepLoai = "GIOI";
        else if (diemTB >= 7.0) xepLoai = "KHA";
        else if (diemTB >= 5.0) xepLoai = "TB";
        else xepLoai = "YEU";
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        List<HocSinh> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ds.add(new HocSinh(i, sc));
        }

        Collections.sort(ds, (a, b) -> {
            if (Math.abs(a.getDiemTB() - b.getDiemTB()) > 1e-9)
                return Double.compare(b.getDiemTB(), a.getDiemTB());
            return a.getMaHS().compareTo(b.getMaHS());
        });

        for (HocSinh hs : ds) {
            System.out.println(hs);
        }
    }
}
