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

    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance (Point a) {
        double dx = this.x - a.x;
        double dy = this.y - a.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public static double distance (Point a, Point b) {
        return a.distance(b);
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

public class Chuvitamgiac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double x1, y1, x2, y2, x3, y3;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();

            Point p1 = new Point (x1, y1);
            Point p2 = new Point (x2, y2);
            Point p3 = new Point (x3, y3);
            
            Double a = p1.distance(p2);
            Double b = p1.distance(p3);
            Double c = p2.distance(p3);
            
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            }
            else {
                double res;
                res = a + b + c;
                System.out.printf("%.3f \n", res);
            }
        }
    }
}
