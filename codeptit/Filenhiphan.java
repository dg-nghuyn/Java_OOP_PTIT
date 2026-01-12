/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Filenhiphan {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(9);
        list.add(25);
        list.add(25);
                list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(17);
        list.add(19);
        list.add(10);

        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream ("DATA2.in"));
        oos.writeObject(list);
        oos.close();
    }
}
