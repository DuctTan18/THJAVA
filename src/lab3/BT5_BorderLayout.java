/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ADM
 */
public class BT5_BorderLayout extends JFrame{
    public BT5_BorderLayout (String title) throws HeadlessException{
        super(title);
        initUI(); 
    }
    private void initUI(){
        this.setSize(600, 500);
        this.setAlwaysOnTop(true);
        JPanel pnBorder = new  JPanel(new  BorderLayout(10,10));
        //NORTH
        JLabel lblNorth = new JLabel("North");
        lblNorth.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNorth.setForeground(Color.white);
        JPanel pnNorth = new JPanel();
            pnNorth.setBackground(Color.RED);
            pnNorth.add(lblNorth);
        pnBorder.add(pnNorth, BorderLayout.NORTH);
        //SOUTH
        JLabel lblSouth = new JLabel("South");
        lblSouth.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblSouth.setForeground(Color.white);
        JPanel pnSouth = new JPanel();
            pnSouth.setBackground(Color.RED);
            pnSouth.add(lblSouth);
        pnBorder.add(pnSouth, BorderLayout.SOUTH);
        //WEST
        JLabel lblWest = new JLabel("West");
        lblWest.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblWest.setForeground(Color.white);
        JPanel pnwest = new JPanel(new BorderLayout());
            pnwest.setBackground(Color.BLUE);
            pnwest.add(lblWest, BorderLayout.CENTER);
        pnBorder.add(pnwest, BorderLayout.WEST);
        //EAST
        JLabel lblEast = new JLabel("East");
        lblEast.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblEast.setForeground(Color.white);
        JPanel pneast = new JPanel(new BorderLayout());
            pneast.setBackground(Color.BLUE);
            pneast.add(lblEast, BorderLayout.CENTER);
        pnBorder.add(pneast, BorderLayout.EAST);
        //EAST
        JLabel lblCenter = new JLabel("Center");
            lblCenter.setFont(new Font("Tahoma", Font.BOLD, 30));
            lblCenter.setForeground(Color.BLACK);
        JPanel pncenter = new JPanel(new BorderLayout());
            pncenter.setBackground(Color.YELLOW);
        JPanel pncentertext = new JPanel();
            pncentertext.add(Box.createVerticalStrut(350));
            pncentertext.add(lblCenter);
            pncentertext.setBackground(Color.YELLOW);
        pncenter.add(pncentertext, BorderLayout.CENTER);
        pnBorder.add(pncenter, BorderLayout.CENTER);
        this.add(pnBorder);
    }
    public static void main(String[] args) {
        new BT5_BorderLayout("Demo BorderLayout").setVisible(true);
    }
}
