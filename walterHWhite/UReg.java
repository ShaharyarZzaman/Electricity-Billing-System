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



public class UReg extends JFrame {

    private JTextField t1, t2, t3, t4;
    private JPasswordField t5;
    private JComboBox<String> countryComboBox;
    private JComboBox<String> gendarComboBox;
    

    String country[] = { "Bangladesh", "India", "Nepal", "Srilanka" };
    String gendar[] = { "Male", "Female", "Others" };
    String cityC[] = { "Dhaka", "Chittagong", "Noakhali" };

    public UReg() {
        setTitle("Create an account.");
        setSize(1366, 768);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1366, 760);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);

        JLabel r1 = new JLabel("Create An Account");
        r1.setBounds(550, 20, 400, 40);
        r1.setForeground(Color.BLACK);
        r1.setFont(new Font("Candara", Font.BOLD, 36));
        panel.add(r1);

        JLabel u1 = new JLabel("First Name:");
        u1.setBounds(260, 90, 200, 30);
        u1.setForeground(Color.BLACK);
        u1.setFont(new Font("Candara", Font.BOLD, 18));
        t1 = new JTextField();
        t1.setBounds(370, 90, 250, 30);

        JLabel u2 = new JLabel("Last Name:");
        u2.setBounds(750, 90, 200, 30);
        u2.setForeground(Color.BLACK);
        u2.setFont(new Font("Candara", Font.BOLD, 18));
        t2 = new JTextField();
        t2.setBounds(850, 90, 250, 30);

        JLabel u3 = new JLabel("Email:");
        u3.setBounds(50, 220, 200, 30);
        u3.setForeground(Color.BLACK);
        u3.setFont(new Font("Candara", Font.BOLD, 18));
        t3 = new JTextField();
        t3.setBounds(215, 220, 250, 30);

        JLabel u4 = new JLabel("Username:");
        u4.setBounds(50, 300, 200, 30);
        u4.setForeground(Color.BLACK);
        u4.setFont(new Font("Candara", Font.BOLD, 18));
        t4 = new JTextField();
        t4.setBounds(215, 300, 250, 30);

        JLabel u5 = new JLabel("Password:");
        u5.setBounds(50, 370, 200, 30);
        u5.setForeground(Color.BLACK);
        u5.setFont(new Font("Candara", Font.BOLD, 18));
        t5 = new JPasswordField();
        t5.setBounds(215, 370, 250, 30);

        JButton r1Button = new JButton("Create an account");
        r1Button.setForeground(Color.WHITE);
        r1Button.setBackground(Color.BLACK);
        r1Button.setFont(new Font("Candara", Font.BOLD, 20));
        r1Button.setBorderPainted(false);
        r1Button.setBounds(450, 540, 300, 40);

        JButton b2 = new JButton("Back");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Candara", Font.BOLD, 15));
        b2.setBorderPainted(false);
        b2.setBounds(780, 540, 100, 40);


        
        JLabel u10 = new JLabel("Country:");
        u10.setBounds(770, 170, 200, 30);
        u10.setForeground(Color.BLACK);
        u10.setFont(new Font("Candara", Font.BOLD, 18));
        panel.add(u10);

        countryComboBox = new JComboBox<>(country);
        countryComboBox.setBounds(850, 170, 250, 30);
        panel.add(countryComboBox);

       
        Font comboBoxFont = new Font("Candara", Font.BOLD, 16);
        countryComboBox.setFont(comboBoxFont);
        countryComboBox.setForeground(Color.BLACK);
        countryComboBox.setBackground(Color.WHITE);

        JLabel u11 = new JLabel("Gendar:");
        u11.setBounds(770, 230, 200, 30);
        u11.setForeground(Color.BLACK);
        u11.setFont(new Font("Candara", Font.BOLD, 18));
        panel.add(u11);

        gendarComboBox = new JComboBox<>(gendar);
        gendarComboBox.setBounds(850, 230, 250, 30);
        panel.add(gendarComboBox);

        
        gendarComboBox.setFont(comboBoxFont);
        gendarComboBox.setForeground(Color.BLACK);
        gendarComboBox.setBackground(Color.WHITE);

        
        JLabel u12 = new JLabel("Date of Birth:");
        u12.setBounds(50, 150, 200, 30);
        u12.setForeground(Color.BLACK);
        u12.setFont(new Font("Candara", Font.BOLD, 18));
        panel.add(u12);

        
        String[] daysArray = new String[31];
        for (int i = 1; i <= 31; i++) {
            daysArray[i - 1] = String.valueOf(i);
        }
        JComboBox<String> dayComboBox = new JComboBox<>(daysArray);
        dayComboBox.setBounds(200, 150, 70, 30);
        dayComboBox.setFont(comboBoxFont);
        dayComboBox.setForeground(Color.BLACK);
        dayComboBox.setBackground(Color.WHITE);
        panel.add(dayComboBox);

        
        String[] monthsArray = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        JComboBox<String> monthComboBox = new JComboBox<>(monthsArray);
        monthComboBox.setBounds(280, 150, 100, 30);
        monthComboBox.setFont(comboBoxFont);
        monthComboBox.setForeground(Color.BLACK);
        monthComboBox.setBackground(Color.WHITE);
        panel.add(monthComboBox);

        
        String[] yearsArray = new String[100];
        for (int i = 0; i < 100; i++) {
            yearsArray[i] = String.valueOf(2023 - i);
        }
        JComboBox<String> yearComboBox = new JComboBox<>(yearsArray);
        yearComboBox.setBounds(390, 150, 80, 30);
        yearComboBox.setFont(comboBoxFont);
        yearComboBox.setForeground(Color.BLACK);
        yearComboBox.setBackground(Color.WHITE);
        panel.add(yearComboBox);

        JLabel u13 = new JLabel("Age :");
        u13.setBounds(540, 150, 100, 30);
        u13.setForeground(Color.BLACK);
        u13.setFont(new Font("Candara", Font.BOLD, 18));
        panel.add(u13);

        // TextField for displaying Age
        JTextField ageTextField = new JTextField();
        ageTextField.setBounds(590, 150, 70, 30);
        ageTextField.setFont(comboBoxFont);
        ageTextField.setEditable(false); // Make it non-editable
        panel.add(ageTextField);


JLabel u15 = new JLabel("City:");
u15.setBounds(770, 270, 200, 30);
u15.setForeground(Color.BLACK);
u15.setFont(new Font("Candara", Font.BOLD, 18));
panel.add(u15);


String cityC[] = { "Dhaka", "Chittagong", "Noakhali" };
JComboBox<String> cityComboBox = new JComboBox<>(cityC);
cityComboBox.setBounds(850, 270, 250, 30);
cityComboBox.setFont(comboBoxFont);
cityComboBox.setForeground(Color.BLACK);
cityComboBox.setBackground(Color.WHITE);
panel.add(cityComboBox);



JLabel u17 = new JLabel("Postal Code:");
u17.setBounds(770, 360, 200, 30);
u17.setForeground(Color.BLACK);
u17.setFont(new Font("Candara", Font.BOLD, 18));
panel.add(u17);

JTextField postalCodeTextField = new JTextField();
postalCodeTextField.setBounds(900, 360, 200, 30);
panel.add(postalCodeTextField);


JLabel u18 = new JLabel("NID:");
u18.setBounds(770, 310, 200, 30);
u18.setForeground(Color.BLACK);
u18.setFont(new Font("Candara", Font.BOLD, 18));
panel.add(u18);


JTextField nidTextField = new JTextField();
nidTextField.setBounds(850, 310, 250, 30);
nidTextField.setEditable(false); 
nidTextField.setForeground(Color.RED); 
nidTextField.setFont(new Font("Candara", Font.BOLD, 18)); // Set font to Times New Roman, bold
panel.add(nidTextField);

        
r1Button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String firstName = t1.getText();
        String lastName = t2.getText();
        String email = t3.getText();
        String username = t4.getText();
        String password = new String(t5.getPassword());

        String selectedYear = (String) yearComboBox.getSelectedItem();

        int currentYear = 2023;
        int birthYear = Integer.parseInt(selectedYear);
        int age = currentYear - birthYear;

        // Display age in the JTextField
        ageTextField.setText(Integer.toString(age));

        // Show eligibility message based on age
        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "Yes, you are eligible to vote!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Sorry, you are not eligible to vote. You must be 18 or older.");
        }

        if (age >= 18) {
            int randomDigits = (int) (Math.random() * 9000) + 1000;
            int currentYear1 = 2023;
            String nid = Integer.toString(currentYear1) + randomDigits;
            nidTextField.setText(nid);
        } else {
            nidTextField.setText("Not eligible for NID");
        }

        String selectedCountry = (String) countryComboBox.getSelectedItem();
        String selectedGender = (String) gendarComboBox.getSelectedItem();
        String selectedCity = (String) cityComboBox.getSelectedItem();
        String postalCode = postalCodeTextField.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || username.isEmpty()
                || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields!");
        } else {
            String filename = "user_info.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                writer.write("Username: " + username + "\n");
                writer.write("Password: " + password + "\n");
                writer.write("First Name: " + firstName + "\n");
                writer.write("Last Name: " + lastName + "\n");
                writer.write("Email: " + email + "\n");
                writer.write("Age: " + age + "\n");
                writer.write("NID: " + nidTextField.getText() + "\n");
                writer.write("Country: " + selectedCountry + "\n");
                writer.write("Gender: " + selectedGender + "\n");
                writer.write("City: " + selectedCity + "\n");
                writer.write("Postal Code: " + postalCode + "\n");
                // Write other user details similarly if needed

                JOptionPane.showMessageDialog(null, "Your account created successfully!");
                clearFields();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
});


        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2) {
                    new UserSU();
                    setVisible(false);
                }

            }

        });

        panel.add(u1);
        panel.add(t1);
        panel.add(u2);
        panel.add(t2);
        panel.add(u3);
        panel.add(t3);
        panel.add(u4);
        panel.add(t4);
        panel.add(u5);
        panel.add(t5);
        panel.add(r1Button);
        panel.add(b2); // Add the back button to the panel

        getContentPane().setBackground(new Color(220, 230, 240));
        add(panel);
        setVisible(true);
    }

    private void clearFields() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
    }


}


