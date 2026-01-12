/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Point {

    private Double x, y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        return new Point (sc.nextDouble(), sc.nextDouble());
    }
    
    public double distance (Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

class Triangle {
    private double a, b, c;
    
    public Triangle (Point p1, Point p2, Point p3) {
        this.a = p1.distance(p2);
        this.b = p2.distance(p3);
        this.c = p3.distance(p1);
    }

    public String getPerimeter() {
        double chuvi = a + b + c;
        return String.format("%.3f", chuvi);
    }

    public boolean valid() {
        if (a + b <= c || b + c <= a || c + a <= b) {
            return false;
        }
        return true;
    }

}

public class LopTriangle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}
