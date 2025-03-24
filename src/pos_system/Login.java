package pos_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.JFrame;

/**
 *
 * @author Sadahiru
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserNametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JPasswordField();
        Loginbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Closelbl = new javax.swing.JLabel();
        SignUplbl = new javax.swing.JLabel();
        Forgotpasswordlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Right.setBackground(new java.awt.Color(22, 116, 66));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));
        Right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Login_Logo-removebg-preview.png"))); // NOI18N
        Right.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 122, 129, 88));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENIUS TECH");
        Right.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 228, -1, 42));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("copyright © Genius Tech all rights reserved");
        Right.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 438, -1, -1));

        getContentPane().add(Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setForeground(new java.awt.Color(102, 102, 102));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 116, 66));
        jLabel1.setText("LOGIN");
        Left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("User Name");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 127, -1, -1));

        UserNametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserNametxt.setForeground(new java.awt.Color(102, 102, 102));
        UserNametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        UserNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNametxtActionPerformed(evt);
            }
        });
        Left.add(UserNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 153, 313, 30));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        Left.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 212, -1, -1));

        Passwordtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Passwordtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Passwordtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Left.add(Passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 238, 313, 30));

        Loginbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Loginbtn.setForeground(new java.awt.Color(22, 116, 66));
        Loginbtn.setText("Login");
        Loginbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 116, 66), 1, true));
        Loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        Left.add(Loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 286, 83, 31));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(" I don't have an account");
        Left.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 392, -1, 25));

        Closelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/delete_48px.png"))); // NOI18N
        Closelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloselblMouseClicked(evt);
            }
        });
        Left.add(Closelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 44, 43));

        SignUplbl.setBackground(new java.awt.Color(255, 255, 255));
        SignUplbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SignUplbl.setForeground(new java.awt.Color(22, 116, 66));
        SignUplbl.setText("Sign Up");
        SignUplbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUplbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUplblMouseClicked(evt);
            }
        });
        Left.add(SignUplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 393, -1, -1));

        Forgotpasswordlbl.setForeground(new java.awt.Color(51, 51, 51));
        Forgotpasswordlbl.setText("Forgot Password?");
        Forgotpasswordlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Forgotpasswordlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotpasswordlblMouseClicked(evt);
            }
        });
        Left.add(Forgotpasswordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 316, -1, 25));

        getContentPane().add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        String UserName, Password, query, passDb = null;
        String SUrl, SUser, Spass;
        SUrl = "jdbc:MYSQL://localhost:3307/pos_system";
        SUser = "root";
        Spass = "";
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            Statement st = con.createStatement();
            if ("".equals(UserNametxt.getText())) {
                JOptionPane.showMessageDialog(null, "UserName is require!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(Passwordtxt.getText())) {
                JOptionPane.showMessageDialog(null, "Password is require!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                UserName = UserNametxt.getText();
                Password = Passwordtxt.getText();
                query = "SELECT * FROM sign_up WHERE User_Name = '" + UserName + "'";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    passDb = rs.getString("Password");
                    notFound = 1;
                }
                if (notFound == 1 && Password.equals(passDb)) {
                    JOptionPane.showMessageDialog(null, "Loggin sucessfully!");
                    POS_Interface POS = new POS_Interface();
                    POS.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect email or password!", "Error", JOptionPane.ERROR_MESSAGE);

                }
                st.execute(query);
                UserNametxt.setText("");
                Passwordtxt.setText("");
            }

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void CloselblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloselblMouseClicked
        int response = JOptionPane.showConfirmDialog(null, "Are you sure want to close?", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_CloselblMouseClicked

    private void SignUplblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUplblMouseClicked
        Sign_Up sign = new Sign_Up();
        sign.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUplblMouseClicked

    private void UserNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNametxtActionPerformed

    private void ForgotpasswordlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotpasswordlblMouseClicked
        ForgotPassword FP = new ForgotPassword();
        FP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ForgotpasswordlblMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closelbl;
    private javax.swing.JLabel Forgotpasswordlbl;
    private javax.swing.JPanel Left;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel SignUplbl;
    private javax.swing.JTextField UserNametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
