/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class BT3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        String masv = sc.nextLine();
        
        System.out.print("Nhap ho va ten: ");
        String tensv = sc.nextLine();
        
        System.out.print("Nhap tuoi: ");
        byte tuoi = sc.nextByte();
        
        System.out.print("Nhap nam sinh: ");
        int namsinh = sc.nextInt();
        
        System.out.print("Nhap DTB: ");
        double DTB = sc.nextDouble();  
    }  
}
