/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2DaoDucNha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hocvien
 */
public class tinhBanKinh {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        final double PI = 3.14;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Nhap dien tich hinh tron: ");
        float dienTich = Float.parseFloat(input.readLine());
        
        double banKinh = Math.sqrt(dienTich / PI);
        
        System.out.println("Ban kinh la: " + String.format("%.0f", banKinh));
    }
    
}
