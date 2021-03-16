/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        int so1 = sc.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int so2 = sc.nextInt();
        
        int tong = so1 + so2;
        System.out.println("Tổng 2 số = " +tong);
        
        int hieu = so1 - so2;
        System.out.println("Hiệu 2 số = " +hieu);
        
        float tich = so1 * so2;
        System.out.println("Tích 2 số = "+tich);
        
        float thuong = so1 / so2;
        System.out.println("Thương 2 số = "+thuong);;
        
    }
}
