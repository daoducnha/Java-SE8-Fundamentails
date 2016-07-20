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
public class doiTien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ten ngoai te: ");
        String tenNgaoiTe = sc.nextLine();
        
        System.out.println("Ty gia: ");
        double tyGia = sc.nextDouble();
        
        System.out.println("So ngoai te: ");
        int soNgoaiTe = sc.nextInt();
        
        double thanhTien = soNgoaiTe * tyGia;
        
        System.out.println("Thanh tien = ty gia * so ngoai te = " + tyGia +" * " + soNgoaiTe + " = " + thanhTien );
    }
    
}
