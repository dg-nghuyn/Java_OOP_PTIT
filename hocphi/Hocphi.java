/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocphi;

import java.util.ArrayList;
import java.util.Scanner;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

/**
 *
 * @author Admin
 */
public class Hocphi {

    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}

class PaymentController {

    private Scanner sc;

    public PaymentController() {
        this.sc = new Scanner(System.in);
    }

    public Invoice getInvoice() {
        String maSV = sc.nextLine();
        String tenSV = sc.nextLine();
        Student student = new Student(maSV, tenSV);

        int soMon = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> subjects = new ArrayList<>();
        double tongTinChi = 0;

        for (int i = 0; i < soMon; i++) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            int soTinChi = Integer.parseInt(sc.nextLine());

            Subject subject = new Subject(tenMon, maMon, soTinChi);
            subjects.add(subject);
            tongTinChi += soTinChi;
        }
        String maQD = sc.nextLine();
        String tenQD = sc.nextLine();
        double donGia = Double.parseDouble(sc.nextLine());

        Rule rule = new Rule(maQD, tenQD, donGia);

        Invoice invoice = new Invoice(rule);
        invoice.setSt(student);
        invoice.setAlSubject(subjects);

        double tongTien = tongTinChi * donGia;
        invoice.setAmount(tongTien);

        return invoice;
    }
}
