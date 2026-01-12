import java.util.Scanner;

public class Hinhchunhat {
    public static void main (String [] args) {
        Scanner Nhap = new Scanner (System.in);
//        System.out.print("Nhap x va y: ");
        int x = Nhap.nextInt();
        int y = Nhap.nextInt();
        
        if (x <= 0 || y <= 0) {
            System.out.println("0");
        }
        else {
            int p = (x + y) * 2;
            int s = x * y;
            System.out.println(p + " " + s);
        }
    }
}