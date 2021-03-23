/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ADM
 */
public class BT7_Exception_3 {
    static int getPos(int i, int a[]){
        return a[i];
    }
    static void output(int a[], int n){
        try {
            for (int i = 0; i < n; i++) {
                System.out.println(getPos(i, a));
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Lố số mảng rồi!!!");
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        output(a, 2);
    }
}
