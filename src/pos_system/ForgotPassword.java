package pos_system;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sadahiru
 */
public class ForgotPassword extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private String User_Name;

    public ForgotPassword() {
        initComponents();
        this.User_Name = User_Name;
        con = DatabaseConnection.getConnection(); // DatabaseConnection class
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserNametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JTextField();
        sendcodebtn = new javax.swing.JButton();
        Closelbl = new javax.swing.JLabel();
        BacktoLoginlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forgot Password");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 116, 66));
        jLabel1.setText("FORGOT");

        UserNametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserNametxt.setForeground(new java.awt.Color(102, 102, 102));
        UserNametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("User Name");

        Emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Emailtxt.setForeground(new java.awt.Color(102, 102, 102));
        Emailtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailtxtActionPerformed(evt);
            }
        });

        sendcodebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sendcodebtn.setForeground(new java.awt.Color(22, 116, 66));
        sendcodebtn.setText("Send code");
        sendcodebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 116, 66), 1, true));
        sendcodebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendcodebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendcodebtnActionPerformed(evt);
            }
        });

        Closelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/delete_48px.png"))); // NOI18N
        Closelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloselblMouseClicked(evt);
            }
        });

        BacktoLoginlbl.setForeground(new java.awt.Color(51, 51, 51));
        BacktoLoginlbl.setText("Back to Login page?");
        BacktoLoginlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BacktoLoginlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BacktoLoginlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Closelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel1))
                            .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UserNametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5)
                            .addComponent(sendcodebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BacktoLoginlbl))
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Closelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(sendcodebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BacktoLoginlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void EmailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailtxtActionPerformed

    private void sendcodebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendcodebtnActionPerformed
        String User_Name = UserNametxt.getText();
        String email = Emailtxt.getText();

        try {
            String query = "SELECT * FROM sign_up WHERE User_Name=? AND Email=?";
            pst = con.prepareStatement(query);
            pst.setString(1, User_Name);
            pst.setString(2, email);
            rs = pst.executeQuery();

            if (rs.next()) {
                String otp = OTPGenerator.generateOTP();
                boolean emailSent = OTPGenerator.sendEmail(email, otp);

                if (emailSent) {
                    JOptionPane.showMessageDialog(this, "OTP has been sent to your email.");

                    // Store OTP temporarily in the database
                    String updateQuery = "UPDATE sign_up SET otp=? WHERE User_Name=?";
                    pst = con.prepareStatement(updateQuery);
                    pst.setString(1, otp);
                    pst.setString(2, User_Name);
                    pst.executeUpdate();

                    // Open OTP Frame
                    OTP otpFrame = new OTP(User_Name, otp);
                    otpFrame.setVisible(true);  // Ensure the OTP frame opens first

                    this.dispose(); // Close Forgot Password frame AFTER opening OTP frame
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to send OTP. Try again.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Email.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_sendcodebtnActionPerformed

    private void CloselblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloselblMouseClicked
        int response = JOptionPane.showConfirmDialog(null, "Are you sure want to close?", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_CloselblMouseClicked

    private void BacktoLoginlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BacktoLoginlblMouseClicked
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BacktoLoginlblMouseClicked

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BacktoLoginlbl;
    private javax.swing.JLabel Closelbl;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JTextField UserNametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sendcodebtn;
    // End of variables declaration//GEN-END:variables
}
