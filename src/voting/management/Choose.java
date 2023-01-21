package voting.management;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Choose extends javax.swing.JFrame {

    public Choose() {
        initcomponent();
    }

    private void initcomponent() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFrame = new javax.swing.JFrame();
        jLabel = new javax.swing.JLabel();


        jFrame.setSize(400, 300);
        jFrame.getContentPane().setBackground(new java.awt.Color(190, 0, 255));


        jButton1.setText("browse file");
        jButton1.setBounds(70, 150, 100, 40);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    Action1Performed(evt);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jButton2.setText("Add manually");
        jButton2.setBounds(200, 150, 110, 40);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Action2Performed(evt);
            }
        });

        jButton1.setBackground(new Color(214, 102, 255));
        jButton2.setBackground(new Color(214, 102, 255));
        jButton1.setForeground(new Color(255, 255, 255));
        jButton2.setForeground(new Color(255, 255, 255));

        jButton1.setFont(new Font("Arial", Font.BOLD, 14));
        jButton2.setFont(new Font("Arial", Font.BOLD, 14));

        jButton1.setBorder(new LineBorder(new Color(214, 102, 255), 2));
        jButton2.setBorder(new LineBorder(new Color(214, 102, 255), 2));


        jButton2.setText("Add manually");
        jButton2.setBounds(200, 150, 110, 40);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Action2Performed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Calibri", 0, 24));
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setBounds(50, 50, 300, 100);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setText("<html>Which method do you <br>want to choose?</html>");


        jFrame.add(jLabel);
        jFrame.add(jButton1);
        jFrame.add(jButton2);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }


    private void Action1Performed(java.awt.event.ActionEvent evt) throws FileNotFoundException {

        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            System.out.println("Selected file path: " + filePath);

            String fileName = selectedFile.getName();
            String newFilePath = "C:/Users/User/Desktop/Voting-Management-System-V2/" + fileName;

            System.out.println("Selected file path: " + newFilePath);

            //parsing a CSV file into Scanner class constructor
            List<String[]> content = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(newFilePath))) {
                String line = "";
                while ((line = br.readLine()) != null) {
                    content.add(line.split(","));
                }
                importData(content);

            } catch (IOException e) {
                //Some error logging
            } //closes the scanner


        } else {
            System.out.println("Cannot find path file");
        }
    }

    private void Action2Performed(java.awt.event.ActionEvent evt) {
        Addvoter addvoter = new Addvoter();
        addvoter.setVisible(true);
        dispose();
    }

    private void importData(List<String[]> content) {
        try {

            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vms",
                    "postgres", "dbms");
            String sql = "";

            for (int i = 0; i < content.size(); i++) {
                if (i == 0) continue;

                String[] data = content.get(i);

                sql = String.format("INSERT INTO addvoter1 (voterid, password, name, fathername, address, sex, age) VALUES('%s','%s','%s','%s','%s','%s','%s')",
                        data[0], data[1], data[2], data[3], data[4], data[5], data[6]
                );
                Statement ps = con.createStatement();
                ps.execute(sql);
            }



            System.out.println("Data successfully added");
            JOptionPane.showMessageDialog(null, "Data Inserted Sucessfully");

        } catch (SQLException ex) {
            Logger.getLogger(Addvoter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static void main(String args[]) {
        new Choose().setVisible(false);
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame;
    private javax.swing.JLabel jLabel;
}
