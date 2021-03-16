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
public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: ", n);        
        for (int i = 2; i < n; i++) {
            if (KTSNT(i)) {
                System.out.print(" " + i);
            }
        }
    }

    private static boolean KTSNT(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
