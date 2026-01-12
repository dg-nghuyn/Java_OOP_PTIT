/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Taofilenhiphan {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(11);
        a.add(11);
        a.add(997);

        ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream ("D:\\CODE\\Java\\CodePTIT\\src\\codeptit\\SONGUYEN.in"));
        oos.writeObject(a);
        oos.close();
    }
}
