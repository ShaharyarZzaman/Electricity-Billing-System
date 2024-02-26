package walterHWhite;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserSU extends JFrame {
    public UserSU() {

        super("Sign Up.");

        JLabel u1 = new JLabel("Welcome To E-VOTE");
        u1.setBounds(810, 220, 400, 40);
        u1.setForeground(Color.BLACK);
        u1.setFont(new Font("Candara", Font.BOLD, 36));

        add(u1);

        JLabel uL = new JLabel("Username :");
        uL.setBounds(820, 300, 200, 30);
        uL.setForeground(Color.BLACK); // Set font color
        uL.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
        JTextField t1 = new JTextField();
        t1.setBounds(920, 300, 200, 30);

        JPasswordField p1 = new JPasswordField();
        JLabel pL = new JLabel("Password :");
        pL.setForeground(Color.BLACK); // Set font color
        pL.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
        pL.setBounds(820, 360, 180, 30);
        p1.setBounds(920, 360, 200, 30);

        JButton sButton = new JButton("SignIn");
        sButton.setForeground(Color.WHITE);
        sButton.setBackground(Color.BLACK);
        sButton.setFont(new Font("Candara", Font.BOLD, 20));
        sButton.setBorderPainted(false);
        sButton.setBounds(980, 425, 150, 35);

        JButton s1Button = new JButton("SignUp");
        s1Button.setForeground(Color.WHITE);
        s1Button.setBackground(Color.BLACK);
        s1Button.setFont(new Font("Candara", Font.BOLD, 20));
        s1Button.setBorderPainted(false);
        s1Button.setBounds(810, 425, 150, 35);

        add(s1Button);

        add(p1);
        add(pL);
        add(t1);
        add(uL);
        add(sButton);

        this.getContentPane().setBackground(Color.ORANGE);

        this.setSize(1366, 768);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Set layout to null for absolute positioning
        this.setVisible(true);

        sButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = t1.getText();
                String enteredPassword = new String(p1.getPassword());

                String authenticationResult = authenticateUser(enteredUsername, enteredPassword);

                if (authenticationResult.equals("admin")) {
                    dispose();
                } else if (authenticationResult.equals("user")) {
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
                }
            }
        });

        s1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new UReg();
            }
        });

        JButton b1 = new JButton("Back");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Candara", Font.BOLD, 20));
        b1.setBorderPainted(false);
        b1.setBounds(1150, 630, 150, 35);

        add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new GetSt();
            }
        });
    }

    private String authenticateUser(String username, String password) {
        String filePath = "user_info.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String storedUsername = parts[0].trim();
                    String storedPassword = parts[1].trim();

                    // Check if the entered credentials match admin credentials
                    if (username.equals("admin") && password.equals("admin")) {
                        new AdDsh(); // Redirect to admin dashboard
                        return "admin";
                    }

                    // Check if the entered credentials match stored credentials
                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        new UsDsh(); // Redirect to user dashboard
                        return "user";
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "invalid";
    }
        private boolean isCredentialsMatchAdmin(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }

        private boolean isCredentialsMatchUser(String enteredUsername, String enteredPassword, String storedUsername, String storedPassword) {
        return enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword);
    }
}



