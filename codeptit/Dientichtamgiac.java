import java.util.Scanner;

// Lưu ý: Đổi tên class thành Main nếu nộp trên CodePTIT
class Point {
    private double x, y;

    public Point() { }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

public class Dientichtamgiac { // Đổi thành class Main khi nộp bài
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);

            // Kiểm tra điều kiện tam giác: Tổng 2 cạnh > cạnh còn lại
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            } else {
                // Dùng công thức nửa chu vi (p) - Gọn hơn cách của bạn
                double p = (a + b + c) / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.printf("%.2f\n", area);
            }
        }
    }
}