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
public class BT7 {
    public static void nhap(int a[],int n){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
 
    }
    public static void xuat(int a[],int n){
        for (int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println(""); //dùng để xuống hàng
    }
    public static int min(int a[],int n){
        int min = a[0];
        for (int i=1;i<n;i++){
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
    public static int max(int a[],int n){
        int max = a[0];
        for (int i=1;i<n;i++){
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static boolean KTSNT(int n){
        if(n<=1) return false;
        for (int i = 2;i<= Math.sqrt(n); i++)
            if(n%i==0) {
                return false;
            }
        return true;
    }
 
    public static void sapxep(int a[],int n){
        int temp = a[0];
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        
        a = new int[n];
        nhap(a,n);
        
        System.out.println("Min: " + min(a,n));
        
        System.out.println("Max: " + max(a,n));
        
        System.out.print("Cac so nguyen to la: ");
        for (int i=0;i<n;i++) {
            if (KTSNT(a[i]))
                System.out.print(a[i] + " ");
        }
        System.out.println("");
        
        System.out.print("\nDãy số được sắp xếp tăng dần: ");
        sapxep(a, n);
        xuat(a,n);
        
        System.out.print("\nPhần tử lớn nhất trong mảng là " + a[n - 1]);
    }
    
}
