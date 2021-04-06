/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ADM
 */
public class BT3_FlowLayout extends JFrame{
    private  static final long serialVersionUID = 1L;
    public BT3_FlowLayout(String title){
        setTitle(title);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add các control");
        JButton btn3 = new JButton("Trên 1 dòng");
        JButton btn4 = new JButton("Hết chỗ chứa");
        JButton btn5 = new JButton("Thì xuống hàng");

        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        
        Container con = getContentPane();
        con.add(pnFlow);
    }
    public static void main(String[] args) {
        BT3_FlowLayout myUI = new BT3_FlowLayout("Demo FlowLayout");
        myUI.setSize(600,100);
        myUI.setVisible(true);
        
    }
}
