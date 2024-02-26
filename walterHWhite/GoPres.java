package walterHWhite;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GoPres extends JFrame {
    
    public GoPres() {

        JFrame f3 = new JFrame("President Vote");

        JPanel up1 = new JPanel();
        up1.setBounds(0,0, 1366, 75); // Adjust the bounds as needed
        up1.setBackground(Color.YELLOW);
        up1.setLayout(null);

        JPanel dp1 = new JPanel();
        dp1.setBounds(0,76, 1366, 693); // Adjust the bounds as needed
        dp1.setBackground(Color.WHITE);
        dp1.setLayout(null);


        JLabel d1 = new JLabel(" Smart - Ballot ");
        d1.setBounds(8, 12, 300, 40);
        d1.setForeground(Color.BLACK); // Set font color
        d1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28)); // Set font size


        JLabel d2 = new JLabel("Presidential Election");
        d2.setBounds(558, 15, 310, 40);
        d2.setForeground(Color.BLACK); // Set font color
        d2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28)); // Set font size

        JLabel e1 = new JLabel(" Vote ");
        e1.setBounds(0, 10, 1366, 45);
        e1.setForeground(Color.BLACK); // Set font color
        e1.setFont(new Font("Candara", Font.BOLD, 28)); // Set font size
        e1.setBackground(Color.BLACK);
        e1.setLayout(null);

        JPanel dp2 = new JPanel();
        dp2.setBounds(0,75, 1366, 90); // Adjust the bounds as needed
        dp2.setBackground(Color.ORANGE);
        dp2.setLayout(null);

        JLabel e2 = new JLabel("Candidate - 1");
        e2.setBounds(15, 25, 1366, 45);
        e2.setForeground(Color.BLACK); // Set font color
        e2.setFont(new Font("Candara", Font.BOLD, 28)); // Set font size
        e2.setBackground(Color.BLACK);
        e2.setLayout(null);
        

        JButton a1 = new JButton("VOTE");
        a1.setForeground(Color.WHITE);
        a1.setBackground(Color.BLACK);
        a1.setFont(new Font("Candara", Font.BOLD, 20));
        a1.setBorderPainted(false);
        a1.setBounds(1100, 26, 150, 40);

        JPanel dp3 = new JPanel();
        dp3.setBounds(0,200, 1366, 90); // Adjust the bounds as needed
        dp3.setBackground(Color.ORANGE);
        dp3.setLayout(null);

        JLabel e3 = new JLabel("Candidate - 2 ");
        e3.setBounds(15, 25, 1366, 45);
        e3.setForeground(Color.BLACK); // Set font color
        e3.setFont(new Font("Candara", Font.BOLD, 28)); // Set font size
        e3.setBackground(Color.BLACK);
        e3.setLayout(null);
        

        JButton a2 = new JButton("VOTE");
        a2.setForeground(Color.WHITE);
        a2.setBackground(Color.BLACK);
        a2.setFont(new Font("Candara", Font.BOLD, 20));
        a2.setBorderPainted(false);
        a2.setBounds(1100, 26, 150, 40);

        /* 
        JPanel dp4 = new JPanel();
        dp4.setBounds(0,325, 1366, 90); // Adjust the bounds as needed
        dp4.setBackground(Color.ORANGE);
        dp4.setLayout(null);

        JLabel e4 = new JLabel("Class Captain Election");
        e4.setBounds(15, 25, 1366, 45);
        e4.setForeground(Color.BLACK); // Set font color
        e4.setFont(new Font("Candara", Font.BOLD, 28)); // Set font size
        e4.setBackground(Color.BLACK);
        e4.setLayout(null);
        */

        JButton a3 = new JButton("Declare");
        a3.setForeground(Color.WHITE);
        a3.setBackground(Color.BLACK);
        a3.setFont(new Font("Candara", Font.BOLD, 20));
        a3.setBorderPainted(false);
        a3.setBounds(1100, 26, 150, 40);

        JButton b2 = new JButton("Back");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Candara", Font.BOLD, 20));
        b2.setBorderPainted(false);
        b2.setBounds(1150, 580, 150, 40);



        dp1.add(b2);


        // add with upper panel 
    
        up1.add(d1);
        up1.add(d2);

        // add with down panel 

        dp1.add(e1);
        //dp1.add(e2);
        dp1.add(dp2);
      //  dp1.add(dp4);
       // dp4.add(e4);
      //  dp4.add(a3);

        dp2.add(e2);
    

        dp2.add(a1);
        dp1.add(dp3);

        dp3.add(a2);
        dp3.add(e3);








        //add with frame 
        f3.add(up1);
        f3.add(dp1);



        f3.setSize(1366, 768);
        f3.setResizable(false);
        f3.setLocationRelativeTo(null);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setLayout(null); // Set layout to null for absolute positioning
        f3.setVisible(true);
        

        




    }

    
}
