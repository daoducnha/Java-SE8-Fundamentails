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
public class tinhTienLai {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("lai suat 1 nam la: ");
        float laiSuat = Float.parseFloat(input.readLine());
        
        System.out.println("So tien gui: ");
        double soTienGui = Double.parseDouble(input.readLine());
        
        System.out.println("Nhap so thang: ");
        int soThang = Integer.parseInt(input.readLine());
        
        double tienLai = ( soTienGui * soThang ) * (laiSuat / 12);
        double tongTien = soTienGui + tienLai;
        
        System.out.println("Tien Lai: " + String.format("%.0f", tienLai));
        System.out.println("Tong von: " + String.format("%.0f", tongTien));
    }
    
}
