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
public class tinhThanhTien {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap ten hang: ");
        String tenHang = input.readLine();
        System.out.println("Nhap so luong");
        int soLuong = Integer.parseInt(input.readLine());
        System.out.println("Nhap don gia: ");
        double donGia = Double.parseDouble(input.readLine());
        
        double thanhTien = donGia * soLuong;
        
        System.out.println("Thanh tien: " + String.format("%.0f", thanhTien));
    }
    
}
