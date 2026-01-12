package codeptit;

import java.util.Scanner;

class Sphuc {
    private int thuc, ao;

    public Sphuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    // Hàm cộng trả về đối tượng mới, không sửa đối tượng cũ
    public Sphuc cong(Sphuc other) {
        int thucMoi = this.thuc + other.thuc;
        int aoMoi = this.ao + other.ao;
        return new Sphuc(thucMoi, aoMoi);
    }

    // Hàm nhân: (a + bi)(c + di) = (ac - bd) + (ad + bc)i
    public Sphuc nhan(Sphuc other) {
        int thucMoi = (this.thuc * other.thuc) - (this.ao * other.ao);
        int aoMoi = (this.thuc * other.ao) + (this.ao * other.thuc);
        return new Sphuc(thucMoi, aoMoi);
    }

    @Override
    public String toString() {
        if (ao < 0) {
            return thuc + " - " + Math.abs(ao) + "i";
        } else {
            return thuc + " + " + ao + "i";
        }
    }
}

public class Sophuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            Sphuc A = new Sphuc(a, b);
            Sphuc B = new Sphuc(c, d);

            // Tính tổng: Temp = A + B
            Sphuc Tong = A.cong(B);

            // Tính C = (A + B) * A  => C = Tong * A
            Sphuc C = Tong.nhan(A);

            // Tính D = (A + B)^2    => D = Tong * Tong
            Sphuc D = Tong.nhan(Tong);

            System.out.println(C + ", " + D);
        }
    }
}