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
public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        float a = sc.nextFloat();
        
        System.out.print("Nhập số thứ hai: ");
        float b = sc.nextFloat();
        
        System.out.print("Nhập số thứ ba: ");
        float c = sc.nextFloat();
        
        GiaiPTB2(a,b,c);
    }
    public static void GiaiPTB2(float a, float b, float c){
        if(a == 0){
            if (b == 0) {
                System.out.print("Phương trình vô nghiệm");
            }
            else{
                System.out.print("Phương trình có nghiệm một nghiệm x = "+ (-c/b));
            }
            return;
        }
        
        float delta = b*b - 4*a*c;
        float x1;
        float x2; 
        
        if(delta > 0)
        {
            x1 = (float)((-b) + (Math.sqrt(delta))/ (2*a));
            x2 = (float)((-b) - (Math.sqrt(delta))/ (2*a));
            System.out.print("Phương trình có 2 nghiệm "+ "x1 = "+x1+"\nx2 = "+x2);
        }else if (delta == 0) {
                x1 = ((-b)/(2*a));
                System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
