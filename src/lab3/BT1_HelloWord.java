/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ADM
 */
public class BT1_HelloWord {
    public static void main(String[] args){
        JFrame myFrame = new JFrame("Hello World!");
        myFrame.setSize(300, 150);
        myFrame.setVisible(true);
        JLabel lbName=new JLabel();
        lbName.setText("Chào các bạn!");
        myFrame.add(lbName);
    }
}
