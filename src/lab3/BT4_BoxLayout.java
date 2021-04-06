/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ADM
 */
public class BT4_BoxLayout extends JFrame{
    public BT4_BoxLayout(String title){
        this.setSize(500,400);
        JPanel pnbox = new JPanel();
        pnbox.setLayout(new BoxLayout(pnbox, BoxLayout.X_AXIS));
        JButton btn1 = new JButton("BoxLayout");
        btn1.setForeground(Color.red);
        Font font = new Font("Arial", Font.BOLD / Font.ITALIC, 25);
        btn1.setFont(font);
        pnbox.add(btn1);
        JButton btn2 = new JButton("X_AXIT");
        btn2.setForeground(Color.blue);     
        btn2.setFont(font);
        pnbox.add(btn2);
        JButton btn3 = new JButton("Y_AXIT");
        btn3.setForeground(Color.orange);      
        btn3.setFont(font);
        pnbox.add(btn3);
        Container con = getContentPane();
        con.add(pnbox);
}
    public static void main(String[] args) {
        new BT4_BoxLayout("BoxLayout").setVisible(true);
    }
}
