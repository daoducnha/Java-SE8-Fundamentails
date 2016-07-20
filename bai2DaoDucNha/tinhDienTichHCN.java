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
public class tinhDienTichHCN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap chieu dai: ");
        int chieuDai = sc.nextInt();
        System.out.println("Nhap chieu rong: ");
        int chieuRong = sc.nextInt();
        
        int chuVi = (chieuDai + chieuRong) * 2;
        int dienTich = chieuDai * chieuRong;
        
        System.out.println("Chu ci la: " + chuVi);
        System.out.println("Dien tich la: " + dienTich);
    }
    
}
