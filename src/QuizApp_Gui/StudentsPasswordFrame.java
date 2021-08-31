/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_Gui;

import QuizApp_DAO.UserDAO;
import QuizApp_Pojo.User;
import QuizApp_Pojo.UserProfile;
import static QuizApp_Pojo.UserProfile.getUserType;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandarbh Taran
 */
public class StudentsPasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentsPasswordFrame
     */
    public StudentsPasswordFrame() {
        initComponents();
        setLocationRelativeTo(null);
        oldcolor=lblLogout.getForeground();
        lblDisplayUsername.setText("Hello "+UserProfile.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlStudentsPasswordFrame = new javax.swing.JPanel();
        lblChangePasswordFrame = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        LoginInnerPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        lblRetypePassword = new javax.swing.JLabel();
        txtRetypePassword = new javax.swing.JTextField();
        lblCurrentPassword = new javax.swing.JLabel();
        txtCurrentPassword = new javax.swing.JPasswordField();
        lblDisplayUsername = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlStudentsPasswordFrame.setBackground(new java.awt.Color(0, 0, 0));

        lblChangePasswordFrame.setBackground(new java.awt.Color(204, 255, 204));
        lblChangePasswordFrame.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        lblChangePasswordFrame.setForeground(new java.awt.Color(0, 255, 0));
        lblChangePasswordFrame.setText("CHANGE PASSWORD");

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 153, 51));
        lblLogout.setText("Logout");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        LoginInnerPanel.setBackground(new java.awt.Color(0, 0, 0));
        LoginInnerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Enter Credentials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 36), new java.awt.Color(0, 102, 102))); // NOI18N

        lblUsername.setBackground(new java.awt.Color(0, 255, 204));
        lblUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 153, 51));
        lblUsername.setText("USERNAME");

        lblNewPassword.setBackground(new java.awt.Color(0, 255, 204));
        lblNewPassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblNewPassword.setForeground(new java.awt.Color(255, 153, 51));
        lblNewPassword.setText("NEW PASSWORD");

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        txtNewPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtNewPassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 153, 51));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnChangePassword.setBackground(new java.awt.Color(0, 0, 0));
        btnChangePassword.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 153, 51));
        btnChangePassword.setText("CHANGE PASSWORD");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        lblRetypePassword.setBackground(new java.awt.Color(204, 255, 204));
        lblRetypePassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblRetypePassword.setForeground(new java.awt.Color(255, 153, 51));
        lblRetypePassword.setText("RETYPE PASSWORD");

        txtRetypePassword.setBackground(new java.awt.Color(204, 204, 204));
        txtRetypePassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        lblCurrentPassword.setBackground(new java.awt.Color(0, 0, 0));
        lblCurrentPassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblCurrentPassword.setForeground(new java.awt.Color(255, 153, 51));
        lblCurrentPassword.setText("CURRENT PASSWORD");

        txtCurrentPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtCurrentPassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        javax.swing.GroupLayout LoginInnerPanelLayout = new javax.swing.GroupLayout(LoginInnerPanel);
        LoginInnerPanel.setLayout(LoginInnerPanelLayout);
        LoginInnerPanelLayout.setHorizontalGroup(
            LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginInnerPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginInnerPanelLayout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnChangePassword)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginInnerPanelLayout.createSequentialGroup()
                        .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRetypePassword)
                            .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblCurrentPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNewPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtNewPassword)
                            .addComponent(txtRetypePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtCurrentPassword))
                        .addGap(100, 100, 100))))
        );
        LoginInnerPanelLayout.setVerticalGroup(
            LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginInnerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCurrentPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCurrentPassword))
                .addGap(30, 30, 30)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetypePassword)
                    .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnChangePassword))
                .addGap(98, 98, 98))
        );

        lblDisplayUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblDisplayUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblDisplayUsername.setForeground(new java.awt.Color(0, 255, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizApp_Gui/Images/icon-setting-5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout pnlStudentsPasswordFrameLayout = new javax.swing.GroupLayout(pnlStudentsPasswordFrame);
        pnlStudentsPasswordFrame.setLayout(pnlStudentsPasswordFrameLayout);
        pnlStudentsPasswordFrameLayout.setHorizontalGroup(
            pnlStudentsPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                .addGroup(pnlStudentsPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDisplayUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(pnlStudentsPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginInnerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(pnlStudentsPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                    .addGap(274, 274, 274)
                    .addComponent(lblChangePasswordFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(412, Short.MAX_VALUE)))
        );
        pnlStudentsPasswordFrameLayout.setVerticalGroup(
            pnlStudentsPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStudentsPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogout)
                    .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                        .addComponent(lblDisplayUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGroup(pnlStudentsPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(LoginInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlStudentsPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlStudentsPasswordFrameLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(lblChangePasswordFrame)
                    .addContainerGap(578, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlStudentsPasswordFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlStudentsPasswordFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Color oldcolor;
    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(oldcolor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        StudentOptionFrame studentFrame=new StudentOptionFrame();
        studentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

     private String username;
    private String password;
    private String retype;
    private String currentPassword;
    
    private boolean validateInput()
{
    char[] pwd=txtCurrentPassword.getPassword();
    username=txtUsername.getText();
    password=txtNewPassword.getText();
    retype=txtRetypePassword.getText();
    
    
    if(username.isEmpty()||password.isEmpty()||retype.isEmpty()||pwd.length==0)
    {return false;}
    currentPassword=String.valueOf(pwd);
    return true;
}
    
    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        if(validateInput()==false)
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields","!!!Error",JOptionPane.ERROR_MESSAGE);
            return;}

        String userType="STUDENT";
        if(userType==null)
        {
            JOptionPane.showMessageDialog(null,"Invalid usertype","!!!Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(retype.equals(password)==false)
        {JOptionPane.showMessageDialog(null,"Passwords does not match","!Error",JOptionPane.ERROR_MESSAGE);
            return;}

        User user=new User(username,password,userType);
        try{
            boolean isValidUser=UserDAO.changeStudentsPassword(user,currentPassword);
            if(isValidUser)
            {
                JOptionPane.showMessageDialog(null,"Password changed successfully ","!SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                StudentOptionFrame studentFrame=new StudentOptionFrame();
                studentFrame.setVisible(true);
                this.dispose();

            }
            else{
                JOptionPane.showMessageDialog(null,"!Invalid current password","!!FAILED",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB ERROR ","!!!LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnChangePasswordActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StudentsPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsPasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginInnerPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblChangePasswordFrame;
    private javax.swing.JLabel lblCurrentPassword;
    private javax.swing.JLabel lblDisplayUsername;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblRetypePassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlStudentsPasswordFrame;
    private javax.swing.JPasswordField txtCurrentPassword;
    private javax.swing.JTextField txtNewPassword;
    private javax.swing.JTextField txtRetypePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}