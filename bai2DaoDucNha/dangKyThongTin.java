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
public class dangKyThongTin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("********************************");
        System.out.println("Dang ky thong tin hoc vien");
        System.out.println("********************************");
        System.out.print("Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("\nEmail: ");
        String email = sc.nextLine();
        System.out.println("********************************");
        System.out.println("***Xin chao ban " + hoTen + "\n**** Thong tin cua ban da duoc ghi nhan");
    }
    
}
