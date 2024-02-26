package walterHWhite;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PairlamentaryElection extends JFrame {

    public PairlamentaryElection() {

        JFrame f4 = new JFrame("Pairlamentary Election");
        JPanel up5 = new JPanel();
        up5.setBounds(0,0, 1366, 75); // Adjust the bounds as needed
        up5.setBackground(Color.YELLOW);
        up5.setLayout(null);

        JPanel dp8 = new JPanel();
        dp8.setBounds(0,76, 1366, 693); // Adjust the bounds as needed
        dp8.setBackground(Color.WHITE);
        dp8.setLayout(null);

        JLabel dp9 = new JLabel(" Smart - Ballot ");
        dp9.setBounds(8, 12, 250, 40);
        dp9.setForeground(Color.BLACK); // Set font color
        dp9.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28)); // Set font size

        JLabel d6 = new JLabel("Pairlamentary Election");
        d6.setBounds(535, 15, 320, 40);
        d6.setForeground(Color.BLACK); // Set font color
        d6.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28)); // Set font size

        JLabel u1 = new JLabel("Candiate - 1 name :"); 
        u1.setBounds(120,130,230,30);
        u1.setForeground(Color.BLACK); // Set font color
        u1.setFont(new Font("Candara", Font.BOLD, 26)); // Set font size
        JTextField t1 = new JTextField();
        t1.setBounds(350, 125, 280, 36);

        dp8.add(u1);
        dp8.add(t1);

        JLabel u2 = new JLabel("Candiate - 2 name :"); 
        u2.setBounds(660,130,230,30);
        u2.setForeground(Color.BLACK); // Set font color
        u2.setFont(new Font("Candara", Font.BOLD, 26)); // Set font size
        JTextField t2 = new JTextField();
        t2.setBounds(890, 126, 280, 36);

        dp8.add(u2);
        dp8.add(t2);


         JLabel u3 = new JLabel("Start Date :"); 
        u3.setBounds(180,202,230,30);
        u3.setForeground(Color.BLACK); // Set font color
        u3.setFont(new Font("Candara", Font.BOLD, 26)); // Set font size
        JTextField t3 = new JTextField();
        t3.setBounds(350, 200, 280, 36);

        dp8.add(u3);
        dp8.add(t3);

        JLabel u4 = new JLabel("End Date :"); 
        u4.setBounds(720,202,230,30);
        u4.setForeground(Color.BLACK); // Set font color
        u4.setFont(new Font("Candara", Font.BOLD, 26)); // Set font size
        JTextField t4 = new JTextField();
        t4.setBounds(890, 200, 280, 36);

        dp8.add(u4);
        dp8.add(t4);


        JButton aButton = new JButton("SAVE");
        aButton.setForeground(Color.WHITE);
        aButton.setBackground(Color.BLACK);
        aButton.setFont(new Font("Candara", Font.BOLD, 18));
        aButton.setBorderPainted(false);
        aButton.setBounds(510, 325, 150, 35);
        
        dp8.add(aButton);

        JButton b1 = new JButton("Back");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Candara", Font.BOLD, 18));
        b1.setBorderPainted(false);
        b1.setBounds(680, 325, 150, 35);
        
        dp8.add(b1);




        //add with panel 

        up5.add(dp9);
        up5.add(d6);






        f4.add(dp8);
        f4.add(up5);






    f4.setSize(1366, 768);
    f4.setResizable(false);
    f4.setLocationRelativeTo(null);
    f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f4.setLayout(null); // Set layout to null for absolute positioning
    f4.setVisible(true);


    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                new AdEl();
                f4.setVisible(false);
            }

        }
        
    });
    

        

    }




    
}
