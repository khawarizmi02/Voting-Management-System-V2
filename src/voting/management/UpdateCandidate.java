package voting.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateCandidate extends javax.swing.JFrame {

    public UpdateCandidate() {
        initComponents();
        sexname();
        partysign();
    }
    public void partysign()
    {
        jupartysign.addItem("");
        jupartysign.addItem("Roket");
        jupartysign.addItem("Dacing");
        jupartysign.addItem("Jawi");
        jupartysign.addItem("Bulan");
        jupartysign.addItem("Enggang");
    }
    public void sexname()
    {
        jusex.addItem("");
        jusex.addItem("Male");
        jusex.addItem("Female");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        juleader = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jupartyname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jupartysign = new java.awt.Choice();
        jLabel5 = new javax.swing.JLabel();
        juheadquater = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jusex = new java.awt.Choice();
        jLabel7 = new javax.swing.JLabel();
        juage = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Leader Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        juleader.setForeground(new java.awt.Color(0, 0, 0));
        juleader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(juleader, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 30));

        jLabel3.setText("Party Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        jupartyname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jupartyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupartynameActionPerformed(evt);
            }
        });
        jPanel3.add(jupartyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, 30));

        jLabel4.setText("Party Sign");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

//        jupartysign.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jupartysign, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 230, 30));

        jLabel5.setText("Party HeadQuater");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        juheadquater.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(juheadquater, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 230, 30));

        jLabel6.setText("Sex");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

//        jusex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jusex, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 230, 30));

        jLabel7.setText("Age");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        juage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(juage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 230, 30));

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 40));

        jButton2.setText("CLEAR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearpanel(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 110, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 300, 480));

        jPanel4.setBackground(new java.awt.Color(153, 102, 255));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/management/back.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Niraj\\Desktop\\voting manaagement\\ic_keyboard_backspace_white_24dp.png")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Add Voter");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 33)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Update Candidate");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Niraj\\Desktop\\voting manaagement\\Party List\\UPDATE1.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(715, 715, 715))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel13)
                                                                .addGap(523, 523, 523)))
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(574, 574, 574)
                                                                .addComponent(jLabel8))
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jLabel1))))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(272, 272, 272)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(835, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel8))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(152, 152, 152)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel12)
                                .addGap(86, 86, 86))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(218, 218, 218)
                                        .addComponent(jLabel11)
                                        .addContainerGap(218, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Connection  con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vms",
                    "postgres", "dbms");
            String sql;
            // adding constraint of age
            String s=juage.getText();

            int i=Integer.parseInt(s);
            if(i>=18)
            {
                sql="update partylist1 set party_leader='"+juleader.getText()+"',partysign='"+jupartysign.getSelectedItem()+"',partyheadquater='"+juheadquater.getText()+"',sex='"+jusex.getSelectedItem()+"',age='"+juage.getText()+"' where partyname='"+jupartyname.getText()+"'";
                Statement ps;
                ps = con.createStatement();
                ps.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data updated Sucessfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "age must greater than 18");
                juage.setText("");
            }


        } catch (SQLException ex) {
            Logger.getLogger(Addvoter.class.getName()).log(Level.SEVERE, null, ex);
        }





    }//GEN-LAST:event_jButton1ActionPerformed

    private void jupartynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupartynameActionPerformed


    }//GEN-LAST:event_jupartynameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Home h=new Home();
        h.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update().setVisible(true);
            }
        });
    }

    // my code update reset button
    private void clearpanel(java.awt.event.ActionEvent evt) {
        juheadquater.setText("");
        juage.setText("");
        jupartysign.select(0);
        jupartyname.setText("");
        jusex.select(0);
        juleader.setText("");
    }//GEN-LAST:event_jpaddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField juheadquater;
    private javax.swing.JTextField juage;
    private java.awt.Choice jupartysign;
    private javax.swing.JTextField jupartyname;
    private java.awt.Choice jusex;
    private javax.swing.JTextField juleader;
    // End of variables declaration//GEN-END:variables
}
