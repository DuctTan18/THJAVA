/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class BT2 {
    public static void nhap(int a[],int n){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = (int) (Math.random()*100);
 
    }
    public static void xuat(int a[],int n){
        for (int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println(""); //dùng để xuống hàng
    }
    
    public static boolean KTSNT(int n){
        if(n<=1) return false;
        for (int i = 2;i<= Math.sqrt(n); i++)
            if(n%i==0) {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        
        a = new int[n];
        nhap(a,n);
        
       
        
        System.out.print("Cac so nguyen to la: ");
        for (int i=0;i<n;i++) {
            if (KTSNT(a[i]) )
                System.out.print(a[i] + " ");
        }
        System.out.println("");
        
    }
}
