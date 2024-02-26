package walterHWhite;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GetSt extends JFrame {

    public GetSt() {
        JFrame f1 = new JFrame("Smart Ballot.");

                JPanel rHalf = new JPanel();
        rHalf.setBounds(601,0, 800, 1000); // Adjust the bounds as needed
        rHalf.setBackground(Color.RED);
        rHalf.setLayout(null);
        f1.add(rHalf);

        // Create "Get Started" button
        JButton getStartedButton = new JButton("Get Started");
        getStartedButton.setForeground(Color.WHITE);
        getStartedButton.setBackground(Color.BLACK);
        getStartedButton.setFont(new Font("Candara", Font.BOLD, 20));
        getStartedButton.setBorderPainted(false);
        getStartedButton.setBounds(280, 400, 150, 40);
        rHalf.add(getStartedButton);

        JLabel labelText = new JLabel("Smart Ballot : Revolutionizing The Voting Experience.");
        labelText.setForeground(Color.WHITE);
        labelText.setFont(new Font("Candara", Font.BOLD, 28));
        labelText.setBounds(60, 270, 660, 80);
        rHalf.add(labelText);

        JPanel leftHalf = new JPanel();
        leftHalf.setBounds(0,0, 600, 1000); 
        leftHalf.setBackground(Color.ORANGE);
        leftHalf.setLayout(null);
        f1.add(leftHalf);

        
ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("picture -1 .jpg"));
Image i2 = i1.getImage().getScaledInstance(600, 800, Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
JLabel image = new JLabel(i3);
image.setBounds(0, 0, 600, 800);
leftHalf.add(image); 


		
		
		
        f1.setSize(1366, 768);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null); 
        f1.setVisible(true);


        getStartedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == getStartedButton) {
                    new AccountTypeFrame();
                    f1.setVisible(false);
                }

            }
            
        });







    }

    
}
