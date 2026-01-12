/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam02241125;

import java.util.*;

/**
 *
 * @author Admin
 */
class Student implements Comparable<Student> {

    private String code, name, eclass;
    private double p1, p2, p3;

    public Student(Scanner sc) {
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.eclass = sc.nextLine();
        this.p1 = Double.parseDouble(sc.nextLine());
        this.p2 = Double.parseDouble(sc.nextLine());
        this.p3 = Double.parseDouble(sc.nextLine());
    }

    private String getPoint() {
        return String.format("%.1f %.1f %.1f", p1, p2, p3);
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return code + " " + name + " " + eclass + " " + getPoint();
    }
}

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();

        while (t-- > 0) {
            list.add(new Student(sc));
        }

        Collections.sort(list);

        int stt = 1;
        for (Student s : list) {
            System.out.println(stt + " " + s);
            stt++;
        }
    }
}
