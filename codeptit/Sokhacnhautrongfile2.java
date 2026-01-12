/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Sokhacnhautrongfile2 {

    public static void main(String[] args) throws IOException {
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.IN"));
        
        int cnt[] = new int[1005];

        for (int i = 0; i < 100000; i++) {
            int x = dt.readInt();
            cnt[x]++;
        }

        for (int j = 0; j < 1000; j++) {
            if (cnt[j] > 0) {
                System.out.println(j + " " + cnt[j]);
                cnt[j] = 0;
            }
        }
    }
}
