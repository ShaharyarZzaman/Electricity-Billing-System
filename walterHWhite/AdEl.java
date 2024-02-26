
package walterHWhite;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AdEl extends JFrame {

    private DefaultTableModel candidateTableModel;
    private JLabel numberOfCandidatesLabel;
    private JTextField candidateNameTextField;
    private JComboBox<Integer> candidateComboBox;

    public AdEl() {
        super("Add Election");

        // Set frame properties
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

        // Create components
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

        JLabel selectLabel = new JLabel("Select the type of election:");
        selectLabel.setBounds(20, 75, 300, 30);
        selectLabel.setForeground(Color.BLACK);
        selectLabel.setFont(new Font("Candara", Font.BOLD, 20));
        dp1.add(selectLabel);

        String[] electionTypes = { "Presidential Election", "Parliamentary Election", "Local Government Election",
                "Primary Election", "Referendum", "Municipal Election", "School Board Election",
                "Trade Union Election", "Homeowners Association (HOA) Election", "Student Council Election" };

        JComboBox<String> electionComboBox = new JComboBox<>(electionTypes);
        electionComboBox.setBounds(330, 75, 270, 30);
        electionComboBox.setBackground(Color.WHITE);
        dp1.add(electionComboBox);

        JLabel candidateLabel = new JLabel("Select the number of candidates:");
        candidateLabel.setBounds(20, 120, 380, 30);
        candidateLabel.setForeground(Color.BLACK);
        candidateLabel.setFont(new Font("Candara", Font.BOLD, 20));
        dp1.add(candidateLabel);

        Integer[] candidateNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        candidateComboBox = new JComboBox<>(candidateNumbers);
        candidateComboBox.setBounds(330, 120, 100, 30);
        candidateComboBox.setBackground(Color.WHITE);
        dp1.add(candidateComboBox);

        numberOfCandidatesLabel = new JLabel("Number of Candidates: ");
        numberOfCandidatesLabel.setBounds(20, 160, 300, 30);
        numberOfCandidatesLabel.setForeground(Color.BLACK);
        numberOfCandidatesLabel.setFont(new Font("Candara", Font.BOLD, 20));
        dp1.add(numberOfCandidatesLabel);

        candidateComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedCandidates = (int) candidateComboBox.getSelectedItem();
                numberOfCandidatesLabel.setText("Number of Candidates: " + selectedCandidates);

                // Display input dialogs for candidate names
                List<String> candidateNames = new ArrayList<>();
                for (int i = 0; i < selectedCandidates; i++) {
                    String candidateName = JOptionPane.showInputDialog("Enter Candidate " + (i + 1) + " Name:");
                    if (candidateName != null) {
                        candidateNames.add(candidateName);
                    } else {
                        break;
                    }
                }

                saveCandidatesToFile(candidateNames);
            }
        });

        candidateTableModel = new DefaultTableModel();
        candidateTableModel.addColumn("Candidate Name");
        candidateTableModel.addColumn("Political Party Name");

        JTable candidateTable = new JTable(candidateTableModel);
        candidateTable.setFont(new Font("Candara", Font.PLAIN, 16));
        candidateTable.setBackground(Color.WHITE);
        candidateTable.setRowHeight(40);

        JTableHeader header = candidateTable.getTableHeader();
        header.setBackground(Color.YELLOW);
        header.setFont(new Font("Candara", Font.BOLD, 16));

        JScrollPane tableScrollPane = new JScrollPane(candidateTable);
        tableScrollPane.setBounds(720, 70, 600, 200);
        dp1.add(tableScrollPane);



        candidateNameTextField = new JTextField();
        candidateNameTextField.setFont(new Font("Candara", Font.BOLD, 20));
        candidateNameTextField.setBackground(Color.WHITE);
        candidateNameTextField.setBounds(20, 220, 300, 30);
        dp1.add(candidateNameTextField);

        JButton saveButton = new JButton("Save Candidate");
        saveButton.setFont(new Font("Candara", Font.BOLD, 20));
        saveButton.setBackground(Color.BLACK);
        saveButton.setBounds(910, 550, 200, 30);
        dp1.add(saveButton);
        saveButton.setForeground(Color.WHITE);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveCandidateToFile(candidateNameTextField.getText());
            }
        });


        JButton b3 = new JButton("Back");
        b3.setFont(new Font("Candara", Font.BOLD, 20));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setBounds(1130, 550, 200, 30);
        dp1.add(b3);


        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b3) {
                    new AdDsh();
                    setVisible(false);
                }

            }
            
            });

        this.setVisible(true);
    }

    private void saveCandidatesToFile(List<String> candidateNames) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cname.txt", true))) {
            for (String candidateName : candidateNames) {
                writer.write(candidateName);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveCandidateToFile(String candidateName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cname.txt", true))) {
            writer.write(candidateName);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdEl());
    }
}
