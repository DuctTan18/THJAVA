/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author ADM
 */
public class BT6_Exception_1 {
    public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập số nguyên: ",""));
        } catch (Exception e1) {
            System.out.println(e1.toString());
        }
        finally{
            System.out.println("Have good fun");
        }
    }
}
