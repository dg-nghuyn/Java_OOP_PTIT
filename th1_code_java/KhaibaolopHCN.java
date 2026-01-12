package th1_code_java;

import java.util.Scanner;

class HCN {
    
    double width;
    double height;
    String color;
    
    public HCN () {
        width = 1;
        height = 1;
        color = "";
    }
    
    public HCN (double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = Chuanhoa(color);
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = Chuanhoa(color);
    }
    
    public double findArea() {
        return width * height;
    }
    
    public double findPerimeter() {
        return 2 * (width + height);
    }
    
    private String Chuanhoa (String c) {
        return c.substring(0, 1).toUpperCase() + c.substring(1).toLowerCase();
    }
    
}

public class KhaibaolopHCN {
    public static void main (String[] args) {
        Scanner Nhap = new Scanner (System.in);
        double w = Nhap.nextDouble();
        double h = Nhap.nextDouble();
        String c = Nhap.next();
        
        if (w <= 0 || h <= 0) {
            System.out.println("INVALID");
        }
        else {
            HCN r = new HCN(w, h, c);
            System.out.printf("%.0f %.0f %s\n", r.findPerimeter(), r.findArea(), r.getColor());
        }
    }
}
