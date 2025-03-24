package pos_system;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Sadahiru
 */
public class Update_Password extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    private String User_Name;
    
    public Update_Password(String User_Name) {
        initComponents();
        con = DatabaseConnection.getConnection();
        this.User_Name = User_Name;
    }

    private Update_Password() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Confirmbtn = new javax.swing.JButton();
        Closelbl = new javax.swing.JLabel();
        Backtologinlbl = new javax.swing.JLabel();
        Newpasswordtxt = new javax.swing.JPasswordField();
        Confirmpasswordtxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Password");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 116, 66));
        jLabel1.setText("Update Password");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Confirm Password");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("New Password");

        Confirmbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Confirmbtn.setForeground(new java.awt.Color(22, 116, 66));
        Confirmbtn.setText("Confirm");
        Confirmbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 116, 66), 1, true));
        Confirmbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirmbtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmbtnActionPerformed(evt);
            }
        });

        Closelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/delete_48px.png"))); // NOI18N
        Closelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloselblMouseClicked(evt);
            }
        });

        Backtologinlbl.setForeground(new java.awt.Color(51, 51, 51));
        Backtologinlbl.setText("Back to Login page?");
        Backtologinlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Backtologinlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BacktologinlblMouseClicked(evt);
            }
        });

        Newpasswordtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Newpasswordtxt.setForeground(new java.awt.Color(51, 51, 51));

        Confirmpasswordtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Confirmpasswordtxt.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Newpasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Closelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(Backtologinlbl)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel1))
                                    .addComponent(Confirmpasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(51, 51, 51)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Closelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Newpasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Confirmpasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Backtologinlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmbtnActionPerformed
        String newPassword = Newpasswordtxt.getText();
        String confirmPassword = Confirmpasswordtxt.getText();

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.");
            return;
        }

        try {
            String query = "UPDATE sign_up SET password=? WHERE User_Name=?";
            pst = con.prepareStatement(query);
            pst.setString(1, newPassword);
            pst.setString(2, User_Name);
            int updated = pst.executeUpdate();

            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Password updated successfully!");
                this.dispose();
                Login log = new Login();
                log.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Password reset failed. Try again.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ConfirmbtnActionPerformed

    private void CloselblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloselblMouseClicked

    }//GEN-LAST:event_CloselblMouseClicked

    private void BacktologinlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BacktologinlblMouseClicked
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BacktologinlblMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backtologinlbl;
    private javax.swing.JLabel Closelbl;
    private javax.swing.JButton Confirmbtn;
    private javax.swing.JPasswordField Confirmpasswordtxt;
    private javax.swing.JPasswordField Newpasswordtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
