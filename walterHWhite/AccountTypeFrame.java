package walterHWhite;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class AccountTypeFrame extends JFrame {

    public AccountTypeFrame() {
		super("Account Type Selection");
		super.setSize(1366, 768); // Set the frame size to 1366x768
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null); // Center the frame on the screen
        setLayout(null);

        // Set the background color
        getContentPane().setBackground(Color.ORANGE);

        // Create components
        JLabel label = new JLabel("Choose Account Type");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Candara", Font.BOLD, 28));
        label.setBounds(565, 300, 280, 80);

        JButton userButton = new JButton("User");
        userButton.setForeground(Color.WHITE);
        userButton.setBackground(Color.BLACK);
        userButton.setFont(new Font("Candara", Font.BOLD, 20));
        userButton.setBorderPainted(false);
        userButton.setBounds(525, 380, 150, 40);




        JButton adminButton = new JButton("Admin");
        adminButton.setForeground(Color.WHITE);
        adminButton.setBackground(Color.BLACK);
        adminButton.setFont(new Font("Candara", Font.BOLD, 20));
        adminButton.setBorderPainted(false);
        adminButton.setBounds(705, 380, 150, 40);

        JButton b4 = new JButton("Back");
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.setFont(new Font("Candara", Font.BOLD, 20));
        b4.setBorderPainted(false);
        b4.setBounds(1005, 580, 150, 40);
        add(b4);

 
        add(label);
        add(userButton);
        add(adminButton);

        userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == userButton) {
                    new UserSU();
                    setVisible(false);
                }

            }
            
        });

            adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == adminButton) {
                    new UserSU();
                    setVisible(false);
                }

            }
            
            });

                       b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b4) {
                    new GetSt();
                    setVisible(false);
                }

            }
            
            });
        
                this.setVisible(true);

    }


}

