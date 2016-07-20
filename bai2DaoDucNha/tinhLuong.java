/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2DaoDucNha;

import java.util.Scanner;

/**
 *
 * @author hocvien
 */
public class tinhLuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("So san pham: "); 
        int soSanPham = sc.nextInt();
        
        System.out.println("Tien cong mot san pham: ");
        double tienCongSP = sc.nextDouble();
        
        System.out.println("Tien thuong: ");
        double tienThuong = sc.nextDouble();
        
        System.out.println("So con: ");
        int soCon = sc.nextInt();
        
        double phuCap = soCon * 200000;
        double tienLuong = soSanPham * tienCongSP;
        double thucLinh = tienLuong + tienThuong + phuCap;
        
        System.out.println("Tien luong la: " + tienLuong);
        System.out.println("Phu cap la: " + phuCap);
        System.out.println("Thuc linh la: " + thucLinh);
    }
    
}
