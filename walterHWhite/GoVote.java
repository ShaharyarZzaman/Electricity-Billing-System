package walterHWhite;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.time.Year;


import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GoVote extends JFrame {

    private JComboBox<String> candidateComboBox;

    public GoVote() {
        super("Go Vote");
        super.setSize(1366, 768);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JPanel up2 = new JPanel();
        up2.setBounds(0, 0, 1366, 75);
        up2.setBackground(Color.YELLOW);
        up2.setLayout(null);
        add(up2);

        JLabel label = new JLabel("V O T E");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Candara", Font.BOLD, 28));
        label.setBounds(630, 10, 280, 70);
        up2.add(label);

        JPanel dp1 = new JPanel();
        dp1.setBounds(0, 76, 1366, 693);
        dp1.setBackground(Color.WHITE);
        dp1.setLayout(null);
        add(dp1);

        JLabel electionTypeLabel = new JLabel("Select the type of election :");
        electionTypeLabel.setForeground(Color.BLACK);
        electionTypeLabel.setFont(new Font("Candara", Font.BOLD, 22));
        electionTypeLabel.setBounds(50, 50, 300, 30);
        dp1.add(electionTypeLabel);

        String[] electionOptions = {"Presidential Election", "Parliamentary Election", "Local Government Election",
                "Primary Election", "Referendum", "Municipal Election", "School Board Election",
                "Trade Union Election", "Homeowners Association (HOA) Election", "Student Council Election"};

        JComboBox<String> electionComboBox = new JComboBox<>(electionOptions);
        electionComboBox.setFont(new Font("Candara", Font.BOLD, 20));
        electionComboBox.setBackground(Color.WHITE);
        electionComboBox.setBounds(330, 50, 300, 30);
        dp1.add(electionComboBox);

        JLabel selectCandidateLabel = new JLabel("Select Candidate:");
        selectCandidateLabel.setForeground(Color.BLACK);
        selectCandidateLabel.setFont(new Font("Candara", Font.BOLD, 22));
        selectCandidateLabel.setBounds(50, 100, 300, 30);
        dp1.add(selectCandidateLabel);

        candidateComboBox = new JComboBox<>();
        updateCandidateComboBox();  // Populate candidate names initially
        candidateComboBox.setFont(new Font("Candara", Font.BOLD, 20));
        candidateComboBox.setBackground(Color.WHITE);
        candidateComboBox.setBounds(330, 100, 300, 30);
        dp1.add(candidateComboBox);















    JButton v1 = new JButton("Vote");
    v1.setForeground(Color.WHITE);
    v1.setBackground(Color.BLACK);
    v1.setFont(new Font("Candara", Font.BOLD, 20));
    v1.setBorderPainted(false);
    v1.setBounds(680, 72, 150, 40);
    dp1.add(v1);
    
    v1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == v1) {
                
                JOptionPane.showMessageDialog(GoVote.this,
                        "Congratulations! You just voted for the most incredible candidate!",
                        "Funny Congrats!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
    


    JButton b1 = new JButton("Back");
    b1.setForeground(Color.WHITE);
    b1.setBackground(Color.BLACK);
    b1.setFont(new Font("Candara", Font.BOLD, 20));
    b1.setBorderPainted(false);
    b1.setBounds(1100, 580, 150, 40);
    dp1.add(b1);


    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                new UsDsh();
                setVisible(false);
            }

        }
        
        });
        












        this.setVisible(true);



    }

    private List<String> readCandidateNamesFromFile() {
        List<String> candidateNames = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("cname.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                candidateNames.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return candidateNames;
    }

    private void updateCandidateComboBox() {
        List<String> candidateNames = readCandidateNamesFromFile();
        candidateComboBox.removeAllItems();
        for (String name : candidateNames) {
            candidateComboBox.addItem(name);
        }
    }

}
