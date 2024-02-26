package walterHWhite;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdDsh extends JFrame {



    public AdDsh() {
        JFrame f1 = new JFrame("Admin Dashboard.");

        JLabel d1 = new JLabel(" Smart - Ballot ");
        d1.setBounds(78, 30, 250, 40);
        d1.setForeground(Color.BLACK);
        d1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28));

        JPanel leftHalf = new JPanel();
        leftHalf.setBounds(0, 0, 350, 768);
        leftHalf.setBackground(Color.ORANGE);
        leftHalf.setLayout(null);

        JPanel rightHalf = new JPanel();
        rightHalf.setBounds(351, 0, 1016, 768);
        rightHalf.setBackground(Color.WHITE);
        rightHalf.setLayout(null);

        JButton ud1 = new JButton("Add Election");
        ud1.setForeground(Color.BLACK);
        ud1.setBackground(Color.ORANGE);
        ud1.setFont(new Font("Candara", Font.BOLD, 20));
        ud1.setBorderPainted(false);
        ud1.setBounds(67, 90, 150, 40);

        JButton ud2 = new JButton("Add Candidate");
        ud2.setForeground(Color.BLACK);
        ud2.setBackground(Color.ORANGE);
        ud2.setFont(new Font("Candara", Font.BOLD, 20));
        ud2.setBorderPainted(false);
        ud2.setBounds(60, 130, 180, 40);

        JButton ud3 = new JButton("View Voters");
        ud3.setForeground(Color.BLACK);
        ud3.setBackground(Color.ORANGE);
        ud3.setFont(new Font("Candara", Font.BOLD, 20));
        ud3.setBorderPainted(false);
        ud3.setBounds(65, 170, 150, 40);

        JButton ud4 = new JButton("Show Results");
        ud4.setForeground(Color.BLACK);
        ud4.setBackground(Color.ORANGE);
        ud4.setFont(new Font("Candara", Font.BOLD, 20));
        ud4.setBorderPainted(false);
        ud4.setBounds(70, 210, 150, 40);

        JButton ud5 = new JButton("Admin Profile");
        ud5.setForeground(Color.BLACK);
        ud5.setBackground(Color.ORANGE);
        ud5.setFont(new Font("Candara", Font.BOLD, 20));
        ud5.setBorderPainted(false);
        ud5.setBounds(58, 300, 190, 40);

        JButton ud6 = new JButton("LogOut");
        ud6.setForeground(Color.BLACK);
        ud6.setBackground(Color.ORANGE);
        ud6.setFont(new Font("Candara", Font.BOLD, 20));
        ud6.setBorderPainted(false);
        ud6.setBounds(51, 340, 150, 40);

        JButton ud14 = new JButton("User Feedback");
        ud14.setForeground(Color.BLACK);
        ud14.setBackground(Color.ORANGE);
        ud14.setFont(new Font("Candara", Font.BOLD, 20));
        ud14.setBorderPainted(false);
        ud14.setBounds(56, 390, 200, 40);

        JLabel d2 = new JLabel("Declared Elections");
        d2.setBounds(10, 180, 230, 40);
        d2.setForeground(Color.BLACK);
        d2.setFont(new Font("Candara", Font.BOLD, 22));

        JLabel d3 = new JLabel("Go For See Results");
        d3.setBounds(10, 435, 230, 40);
        d3.setForeground(Color.BLACK);
        d3.setFont(new Font("Candara", Font.BOLD, 22));

        JButton ud9 = new JButton("See Results");
        ud9.setForeground(Color.BLACK);
        ud9.setBackground(Color.ORANGE);
        ud9.setFont(new Font("Candara", Font.BOLD, 20));
        ud9.setBorderPainted(false);
        ud9.setBounds(240, 435, 150, 40);



        leftHalf.add(d1);
        leftHalf.add(ud1);
        leftHalf.add(ud2);
        leftHalf.add(ud3);
        leftHalf.add(ud4);
        leftHalf.add(ud5);
        leftHalf.add(ud6);
        leftHalf.add(ud14);

        rightHalf.add(d2);
       
        rightHalf.add(d3);
        rightHalf.add(ud9);
  
   


        f1.add(leftHalf);
        f1.add(rightHalf);

        f1.add(leftHalf);
        f1.add(rightHalf);

        f1.setSize(1366, 768);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setVisible(true);


                ud1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ud1) {
                    new AdEl();
                    f1.setVisible(false);
                }

            }

                });

                                ud3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ud3) {
                    new MyInfo();
                    f1.setVisible(false);
                }

            }

                });

                        ud6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ud6) {
                    new GetSt();
                    f1.setVisible(false);
                }

            }

        });
        
    }


}
