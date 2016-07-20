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
public class tinhChuViDienTich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ban Kinh: ");
        int banKinh = sc.nextInt();
        
        double chuVi = 2 * banKinh * PI;
        double dienTich = banKinh * banKinh * PI;
        
        System.out.println("Chu vi la: " + chuVi);
        System.out.println("Dien tich la: " + dienTich);
    }
    
}
