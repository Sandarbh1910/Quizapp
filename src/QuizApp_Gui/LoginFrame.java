/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_Gui;

import QuizApp_DAO.UserDAO;
import QuizApp_Pojo.User;
import QuizApp_Pojo.UserProfile;
import QuizApp_dbutil.DBConnection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandarbh Taran
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    private String username;
    private String password;
    
    private boolean validateInputs()
    {
        char[] pwd=txtPassword.getPassword();
        username=txtUsername.getText();
        if(username.isEmpty()||pwd.length==0)
        {return false;}
        password=String.valueOf(pwd);
        return true;
    }
            
    private String getUserType()
    {
        if(rbAdmin.isSelected())
            return rbAdmin.getText();
        
        else if(rbStudent.isSelected())
            return rbStudent.getText();
        
        else return null;
    }
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
         this.setTitle("QUIZAPP");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LoginPanel = new javax.swing.JPanel();
        LoginInnerPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnQuit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        rbAdmin = new javax.swing.JRadioButton();
        rbStudent = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JPasswordField();
        LoginFrameLabel = new javax.swing.JLabel();
        lblLoginImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LoginPanel.setBackground(new java.awt.Color(204, 255, 204));

        LoginInnerPanel.setBackground(new java.awt.Color(0, 153, 153));
        LoginInnerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Enter Credentials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 36), new java.awt.Color(255, 255, 51))); // NOI18N

        lblUsername.setBackground(new java.awt.Color(0, 255, 204));
        lblUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblUsername.setText("USERNAME");

        lblPassword.setBackground(new java.awt.Color(0, 255, 204));
        lblPassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblPassword.setText("PASSWORD");

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        btnQuit.setBackground(new java.awt.Color(0, 0, 0));
        btnQuit.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 153, 51));
        btnQuit.setText("QUIT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 153, 51));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        rbAdmin.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbAdmin);
        rbAdmin.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        rbAdmin.setForeground(new java.awt.Color(255, 255, 102));
        rbAdmin.setText("ADMIN");

        rbStudent.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbStudent);
        rbStudent.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        rbStudent.setForeground(new java.awt.Color(255, 255, 102));
        rbStudent.setText("STUDENT");

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        javax.swing.GroupLayout LoginInnerPanelLayout = new javax.swing.GroupLayout(LoginInnerPanel);
        LoginInnerPanel.setLayout(LoginInnerPanelLayout);
        LoginInnerPanelLayout.setHorizontalGroup(
            LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginInnerPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(txtPassword))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginInnerPanelLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
        LoginInnerPanelLayout.setVerticalGroup(
            LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginInnerPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAdmin)
                    .addComponent(rbStudent))
                .addGap(43, 43, 43)
                .addGroup(LoginInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuit)
                    .addComponent(btnLogin))
                .addGap(39, 39, 39))
        );

        LoginFrameLabel.setBackground(new java.awt.Color(204, 255, 204));
        LoginFrameLabel.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        LoginFrameLabel.setForeground(new java.awt.Color(0, 255, 0));
        LoginFrameLabel.setText("LOGIN/SIGN IN");

        lblLoginImage.setBackground(new java.awt.Color(255, 204, 204));
        lblLoginImage.setForeground(new java.awt.Color(255, 204, 204));
        lblLoginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizApp_Gui/Images/loginlockImage.gif"))); // NOI18N
        lblLoginImage.setText("jLabel1");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LoginFrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(lblLoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(LoginInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(LoginFrameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(LoginInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLoginImage, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        boolean isValidInput=validateInputs();
        if(isValidInput==false)
        {
            JOptionPane.showMessageDialog(null,"Username/Password cannot be left blank","!!!Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String userType=getUserType();
        if(userType==null)
        {
            JOptionPane.showMessageDialog(null,"Please select a usertype","!!!Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            User user=new User(username,password,userType);
        
            boolean isValidUser=UserDAO.validateUser(user);
            if(isValidUser)
            {
                 JOptionPane.showMessageDialog(null,"LOGIN ACCEPTED\nWELCOME : "+username.toUpperCase(),"!SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                 UserProfile.setUserType(userType);
                 UserProfile.setUsername(username);
                 
                 if(userType.equalsIgnoreCase("Admin"))
                 {
                     AdminOptionFrame adminFrame=new AdminOptionFrame();
                     adminFrame.setVisible(true);
                     
                 }
                 
                 else{
                     StudentOptionFrame studentFrame=new StudentOptionFrame();
                     studentFrame.setVisible(true);
                 }
                 this.dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(null,"LOGIN DENIED\nINVALID USERNAME/PASSWORD","!!FAILED",JOptionPane.ERROR_MESSAGE);
                buttonGroup1.clearSelection();
            }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB ERROR ","!!!LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        
        int ans=JOptionPane.showConfirmDialog(null,"Are you sure(Y/N)?","QUIT",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(ans==JOptionPane.YES_OPTION)
        {
            DBConnection.closeConnection();
            JOptionPane.showMessageDialog(null,"THANK YOU!! ","HAVE A GOOD DAY :)",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
        }
       
        
    }//GEN-LAST:event_btnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginFrameLabel;
    private javax.swing.JPanel LoginInnerPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblLoginImage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbStudent;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
