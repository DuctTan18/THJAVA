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
public class BT5 {
    public static int UCLN(int a, int b){
        if(b==0) return a;
        return UCLN(b, a % b);
    }
    public static int BCNN(int a, int b){        
        return (a * b) / UCLN(a , b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        int so1 = sc.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int so2 = sc.nextInt();
        
        System.out.println("UCLN của "+ so1 + " và " + so2 + " là " + UCLN(so1,so2));
        
        System.out.println("BCNN của "+ so1 + " và " + so2 + " là " + BCNN(so1,so2));
    } 
}
