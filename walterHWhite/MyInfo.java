package walterHWhite;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;


public class MyInfo extends JFrame {

    private DefaultTableModel tableModel;
    private JTable dataTable;

    public MyInfo() {
        super("User Information");
        super.setSize(1366, 768); 
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setResizable(false); 
        getContentPane().setBackground(Color.ORANGE); 

        
        tableModel = new DefaultTableModel();
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Email");
        tableModel.addColumn("Age");
        tableModel.addColumn("NID");
        tableModel.addColumn("Country");
        tableModel.addColumn("Gender");
        tableModel.addColumn("City");
        tableModel.addColumn("Postal Code");

        

        dataTable = new JTable(tableModel);

        
        Font tableFont = new Font("Candara", Font.PLAIN, 15);
        dataTable.setFont(tableFont);

        
        dataTable.setForeground(Color.BLACK);

        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        dataTable.setDefaultRenderer(Object.class, centerRenderer);

        
        JTableHeader header = dataTable.getTableHeader();
        header.setBackground(Color.BLUE);
        header.setForeground(Color.WHITE);

        // Set cell size
        dataTable.setRowHeight(30);

        // Set cell background and text color
        dataTable.setBackground(Color.WHITE);
        dataTable.setSelectionBackground(Color.LIGHT_GRAY);
        dataTable.setSelectionForeground(Color.BLACK);

        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.setPreferredSize(new Dimension(1366, 380));
        add(scrollPane);
        

        //add(new JScrollPane(dataTable));

       
        loadDataFromFile("user_info.txt");
 
 
            




        setVisible(true);
    }

    private void loadDataFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            String[] userData = new String[9]; // Array to store user data

            while ((line = br.readLine()) != null) {
                String[] keyValue = line.split(":");

                if (keyValue.length == 2) {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();

                    switch (key) {
                        case "First Name":
                            userData[0] = value;
                            break;
                        case "Last Name":
                            userData[1] = value;
                            break;
                        case "Email":
                            userData[2] = value;
                            break;
                        case "Age":
                            userData[3] = value;
                            break;
                        case "NID":
                            userData[4] = value;
                            break;
                        case "Country":
                            userData[5] = value;
                            break;
                        case "Gender":
                            userData[6] = value;
                            break;
                        case "City":
                            userData[7] = value;
                            break;
                        case "Postal Code":
                            userData[8] = value;
                            
                            tableModel.addRow(userData);
                            
                            userData = new String[9];
                            break;
                        default:
                            
                            break;
                    }
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading the file.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


}

