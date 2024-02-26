package walterHWhite;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;



public class UsDsh extends JFrame {

         private JLabel timeLabel;


         public UsDsh() {

             super("User Dashboard.");

             // Create and add a JLabel for displaying the live time

             JLabel d1 = new JLabel(" Smart - Ballot ");
             d1.setBounds(78, 30, 250, 40);
             d1.setForeground(Color.BLACK); // Set font color
             d1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28));

             JPanel leftHalf = new JPanel();
             leftHalf.setBounds(0, 0, 350, 768);
             leftHalf.setBackground(Color.ORANGE);
             leftHalf.setLayout(null);

             JPanel rightHalf = new JPanel();
             rightHalf.setBounds(351, 0, 1016, 768);
             rightHalf.setBackground(Color.WHITE);
             rightHalf.setLayout(null);

             JButton ud1 = new JButton("Election Info");
             ud1.setForeground(Color.BLACK);
             ud1.setBackground(Color.ORANGE);
             ud1.setFont(new Font("Candara", Font.BOLD, 20));
             ud1.setBorderPainted(false);
             ud1.setBounds(67, 90, 150, 40);

             JButton ud2 = new JButton("Notice & Updates");
             ud2.setForeground(Color.BLACK);
             ud2.setBackground(Color.ORANGE);
             ud2.setFont(new Font("Candara", Font.BOLD, 20));
             ud2.setBorderPainted(false);
             ud2.setBounds(58, 130, 210, 40);

             JButton ud3 = new JButton("Help & Support");
             ud3.setForeground(Color.BLACK);
             ud3.setBackground(Color.ORANGE);
             ud3.setFont(new Font("Candara", Font.BOLD, 20));
             ud3.setBorderPainted(false);
             ud3.setBounds(50, 170, 210, 40);

             JButton ud4 = new JButton("Feedback");
             ud4.setForeground(Color.BLACK);
             ud4.setBackground(Color.ORANGE);
             ud4.setFont(new Font("Candara", Font.BOLD, 20));
             ud4.setBorderPainted(false);
             ud4.setBounds(57, 210, 150, 40);

             JButton ud5 = new JButton("My Profile");
             ud5.setForeground(Color.BLACK);
             ud5.setBackground(Color.ORANGE);
             ud5.setFont(new Font("Candara", Font.BOLD, 20));
             ud5.setBorderPainted(false);
             ud5.setBounds(62, 300, 150, 40);

             JButton ud6 = new JButton("LogOut");
             ud6.setForeground(Color.BLACK);
             ud6.setBackground(Color.ORANGE);
             ud6.setFont(new Font("Candara", Font.BOLD, 20));
             ud6.setBorderPainted(false);
             ud6.setBounds(51, 340, 150, 40);

             JLabel d3 = new JLabel("Go For Vote");
             d3.setBounds(10, 435, 230, 40);
             d3.setForeground(Color.BLACK); // Set font color
             d3.setFont(new Font("Candara", Font.BOLD, 22));

             timeLabel = new JLabel();
             timeLabel.setBounds(90, 650, 150, 30);
             timeLabel.setFont(new Font("Candara", Font.BOLD, 24));
             timeLabel.setForeground(Color.BLACK);
             leftHalf.add(timeLabel);
             Timer timer = new Timer(1000, new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     updateTime();
                 }
             });
             timer.start();

             JButton ud9 = new JButton("Go");
             ud9.setForeground(Color.BLACK);
             ud9.setBackground(Color.ORANGE);
             ud9.setFont(new Font("Candara", Font.BOLD, 20));
             ud9.setBorderPainted(false);
             ud9.setBounds(240, 435, 100, 40);

             ud9.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                     if (e.getSource() == ud9) {
                         new GoVote();
                         setVisible(false);
                     }

                 }

             });

             leftHalf.add(d1);
             leftHalf.add(ud1);
             leftHalf.add(ud2);
             leftHalf.add(ud3);
             leftHalf.add(ud4);
             leftHalf.add(ud5);
             leftHalf.add(ud6);
             rightHalf.add(d3);
             rightHalf.add(ud9);

             this.add(leftHalf);
             this.add(rightHalf);

             super.setSize(1366, 768);
             super.setResizable(false);
             super.setLocationRelativeTo(null);
             super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             super.setLayout(null); // Set layout to null for absolute positioning
             super.setVisible(true);

             ud6.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                     if (e.getSource() == ud6) {
                         new UserSU();
                         setVisible(false);
                     }

                 }

             });

         }
  
         private void updateTime() {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String formattedTime = sdf.format(new Date());
            timeLabel.setText("Time: " + formattedTime);
        }

    
}
