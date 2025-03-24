package pos_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Sadahiru
 */
public class Sign_Up extends javax.swing.JFrame {

    public Sign_Up() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        UserNametxt = new javax.swing.JTextField();
        SignUpbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Closelbl = new javax.swing.JLabel();
        Loginlbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(22, 116, 66));
        jLabel2.setText("SIGN UP");

        Emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Emailtxt.setForeground(new java.awt.Color(102, 102, 102));
        Emailtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Email");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Password");

        Passwordtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Passwordtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("User Name");

        UserNametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserNametxt.setForeground(new java.awt.Color(102, 102, 102));
        UserNametxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        UserNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNametxtActionPerformed(evt);
            }
        });

        SignUpbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SignUpbtn.setForeground(new java.awt.Color(22, 116, 66));
        SignUpbtn.setText("SignUp");
        SignUpbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 116, 66), 1, true));
        SignUpbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpbtn.setPreferredSize(new java.awt.Dimension(36, 22));
        SignUpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpbtnActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("I've an account");

        Closelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/delete_48px.png"))); // NOI18N
        Closelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloselblMouseClicked(evt);
            }
        });

        Loginlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Loginlbl.setForeground(new java.awt.Color(22, 116, 66));
        Loginlbl.setText("Login");
        Loginlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(UserNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(SignUpbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Loginlbl))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(Closelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addComponent(Closelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignUpbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Loginlbl))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, -1));

        jPanel2.setBackground(new java.awt.Color(22, 116, 66));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Login_Logo-removebg-preview.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENIUS TeCH");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("copyright © Genius Tech all rights reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel7)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNametxtActionPerformed

    private void SignUpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpbtnActionPerformed
        String Email, UserName, Password, query;
        String SUrl, SUser, Spass;
        SUrl = "jdbc:MYSQL://localhost:3307/pos_system";
        SUser = "root";
        Spass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            Statement st = con.createStatement();
            if("".equals(Emailtxt.getText())){
                JOptionPane.showMessageDialog(null, "Email is require!", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(UserNametxt.getText())){
                JOptionPane.showMessageDialog(null, "UserName is require!", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Passwordtxt.getText())){
                JOptionPane.showMessageDialog(null, "Password is require!", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Email = Emailtxt.getText();
                UserName = UserNametxt.getText();
                Password = Passwordtxt.getText();
                query = "INSERT INTO sign_up(Email, User_Name, Password) VALUES('"+Email+"', '"+UserName+"', '"+Password+"')";
                st.execute(query);
                Emailtxt.setText("");
                UserNametxt.setText("");
                Passwordtxt.setText("");
                JOptionPane.showMessageDialog(null, "New account has been created sucessfully!");
                Login log = new Login();
                log.setVisible(true);
            }

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_SignUpbtnActionPerformed

    private void CloselblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloselblMouseClicked
        int response = JOptionPane.showConfirmDialog(null, "Are you sure want to close?", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_CloselblMouseClicked

    private void LoginlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginlblMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginlblMouseClicked


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
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closelbl;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JLabel Loginlbl;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JButton SignUpbtn;
    private javax.swing.JTextField UserNametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
