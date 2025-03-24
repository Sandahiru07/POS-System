package pos_system;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sadahiru
 */
public class OTP extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private String User_Name;
    private String otpCode;

    // Constructor with parameters
    public OTP(String User_Name, String otp) {
        initComponents(); // Initialize UI components
        con = DatabaseConnection.getConnection(); // Establish DB connection
        this.User_Name = User_Name;
        this.otpCode = otp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOTP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Confirmbtn = new javax.swing.JButton();
        Canclebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtOTP.setBackground(new java.awt.Color(204, 255, 204));
        txtOTP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOTP.setForeground(new java.awt.Color(51, 51, 51));
        txtOTP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOTP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOTPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 116, 66));
        jLabel1.setText("Verify Code");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(22, 116, 66));
        jLabel2.setText("Check your mail to get verify code");

        Confirmbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Confirmbtn.setForeground(new java.awt.Color(22, 116, 66));
        Confirmbtn.setText("Confirm");
        Confirmbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 116, 66), 1, true));
        Confirmbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmbtnActionPerformed(evt);
            }
        });

        Canclebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Canclebtn.setForeground(new java.awt.Color(255, 0, 0));
        Canclebtn.setText("Cancle");
        Canclebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(225, 0, 0), 1, true));
        Canclebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Canclebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanclebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(Confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Canclebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmbtn)
                    .addComponent(Canclebtn))
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void txtOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOTPActionPerformed

    private void ConfirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmbtnActionPerformed
        String enteredOTP = txtOTP.getText().trim(); // Get entered OTP
        
        try {
            String query = "SELECT otp FROM sign_up WHERE User_Name=?";
            pst = con.prepareStatement(query);
            pst.setString(1, User_Name);
            rs = pst.executeQuery();

            if (rs.next()) {
                String storedOTP = rs.getString("otp");

                if (enteredOTP.equals(storedOTP)) {
                    JOptionPane.showMessageDialog(this, "OTP Verified! You can now reset your password.");

                    // Open Reset Password Frame
                    Update_Password resetFrame = new Update_Password(User_Name);
                    resetFrame.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid OTP. Try again.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "User not found!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }//GEN-LAST:event_ConfirmbtnActionPerformed

    private void CanclebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanclebtnActionPerformed
        ForgotPassword FP = new ForgotPassword();
        FP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CanclebtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Canclebtn;
    private javax.swing.JButton Confirmbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtOTP;
    // End of variables declaration//GEN-END:variables
}
