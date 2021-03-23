/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ADM
 */
public class BT5 {
    public static void timXauMax(String strInput){
        StringTokenizer strToken= new StringTokenizer(strInput," ,\t,\r");
        int Max,i=1,lengthStr;
        Max= strToken.nextToken().length();
        int viTriMax= i;
        while(strToken.hasMoreTokens()){
        lengthStr= strToken.nextToken().length();
        i++;
        if(Max < lengthStr){
        Max= lengthStr;
        viTriMax= i;
        }
    System.out.println("Do dai xau lon nhat la: "+Max+" o vi tri "+viTriMax);
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap vao 1 xau: ");
        String strInput= input.nextLine();
        timXauMax(strInput);
    }
}
