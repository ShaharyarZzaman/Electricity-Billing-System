
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



public class PresidentElection extends JFrame {

    public PresidentElection() {

        JFrame f5 = new JFrame("President Election");
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

        JLabel d6 = new JLabel("Presidential Election");
        d6.setBounds(565, 15, 260, 40);
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
        aButton.setFont(new Font("Candara", Font.BOLD, 20));
        aButton.setBorderPainted(false);
        aButton.setBounds(510, 325, 150, 35);
        
        dp8.add(aButton);


        JButton b4 = new JButton("Back");
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.setFont(new Font("Candara", Font.BOLD, 20));
        b4.setBorderPainted(false);
        b4.setBounds(680, 325, 150, 35);
        
        dp8.add(b4);




        //add with panel 

        up5.add(dp9);
        up5.add(d6);






        f5.add(dp8);
        f5.add(up5);






    f5.setSize(1366, 768);
    f5.setResizable(false);
    f5.setLocationRelativeTo(null);
    f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f5.setLayout(null); // Set layout to null for absolute positioning
    f5.setVisible(true);


    b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b4) {
                new AdEl();
                f5.setVisible(false);
            }

        }
        
    });
    

        

    }




    
}


/* 
package walterHWhite;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PresidentElection extends JFrame {

    private AdDsh adDsh;  // Reference to AdDsh class
    private DefaultTableModel tableModel;

    public PresidentElection(AdDsh adDsh) {
        this.adDsh = adDsh;

        JFrame f5 = new JFrame("President Election");
        JPanel up5 = new JPanel();
        up5.setBounds(0, 0, 1366, 75);
        up5.setBackground(Color.YELLOW);
        up5.setLayout(null);

        JPanel dp8 = new JPanel();
        dp8.setBounds(0, 76, 1366, 693);
        dp8.setBackground(Color.WHITE);
        dp8.setLayout(null);

        JLabel dp9 = new JLabel(" Smart - Ballot ");
        dp9.setBounds(8, 12, 250, 40);
        dp9.setForeground(Color.BLACK); // Set font color
        dp9.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 28)); // Set font size

        JLabel d6 = new JLabel("Presidential Election");
        d6.setBounds(565, 15, 260, 40);
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
        aButton.setFont(new Font("Candara", Font.BOLD, 20));
        aButton.setBorderPainted(false);
        aButton.setBounds(510, 325, 150, 35);
        
        dp8.add(aButton);


        JButton b4 = new JButton("Back");
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.setFont(new Font("Candara", Font.BOLD, 20));
        b4.setBorderPainted(false);
        b4.setBounds(680, 325, 150, 35);
        
        dp8.add(b4);




        //add with panel 

        up5.add(dp9);
        up5.add(d6);







        // ... existing code ...

        // Add member variable for table model
        tableModel = (DefaultTableModel) adDsh.getTableModel();


        aButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get input values
                String candidate1Name = t1.getText();
                String candidate2Name = t2.getText();
                String startDate = t3.getText();
                String endDate = t4.getText();

                // Validate inputs (you may add more validation as needed)

                // Update the JTable in AdDsh class
                Object[] rowData = { "Presidential Election", startDate, endDate, "Not Voted" };
                tableModel.addRow(rowData);

                // Show a popup message
                JOptionPane.showMessageDialog(f5, "The election is declared.");

                // Update the label in AdDsh class
                adDsh.updatePresidentialElectionLabel();

                // Close the current frame
                f5.dispose();
            }
        });

        // ... existing code ...

        f5.add(dp8);
        f5.add(up5);

        f5.setSize(1366, 768);
        f5.setResizable(false);
        f5.setLocationRelativeTo(null);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f5.setLayout(null);
        f5.setVisible(true);

         b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b4) {
                new AdEl();
                f5.setVisible(false);
            }

        }
        
    });
    }
}
*/