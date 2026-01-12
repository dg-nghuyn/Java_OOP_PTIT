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

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance (Point b) {
        double dx = this.x - b.x;
        double dy = this.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public static double distance (Point p1, Point p2) {
        return p1.distance(p2);
    }
}

public class Khaibaoloppoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            
            double res = p1.distance(p2);
            System.out.printf("%.4f\n", res);
        }
        sc.close();
    }
}
