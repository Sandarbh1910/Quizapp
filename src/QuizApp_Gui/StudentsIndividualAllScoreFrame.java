/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_Gui;

import QuizApp_DAO.PerformanceDAO;
import QuizApp_Pojo.Performance;
import QuizApp_Pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sandarbh Taran
 */
public class StudentsIndividualAllScoreFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentsIndividualAllScoreFrame
     */
    Color oldcolor;
    public StudentsIndividualAllScoreFrame() {
        initComponents();
        oldcolor=lblLogout.getForeground();
        setLocationRelativeTo(null);
        showDataInTable();
    }
    
    private void showDataInTable() {
        try{
            ArrayList<Performance>perf=PerformanceDAO.getAllDataByUsername(UserProfile.getUsername());
            if(perf.size()==0)
            {
                JOptionPane.showMessageDialog(null, " You have not appeared for any test\nPlease attempt the test series","NO RECORD FOUND",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            DefaultTableModel model=(DefaultTableModel)tblStudentsIndividualAllScores.getModel();
            Object[]row=new Object[7];
            for(Performance p:perf)
            {
                row[0]=p.getUserId();
                row[1]=p.getExamId();
                row[2]=p.getSubject();
                row[3]=p.getRight();
                row[4]=p.getWrong();
                row[5]=p.getUnattempted();
                row[6]=p.getPercent();
                model.addRow(row);
                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"!!! DB Error","!!! STUDENTS INDIVIDUALS ALL SCORE ERROR",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewAllStudentsScorePanel = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        lblStudentsIndividualAllScoreFrame = new javax.swing.JLabel();
        pnlViewAllStudentsInner = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentsIndividualAllScores = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblDisplayUsername = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewAllStudentsScorePanel.setBackground(new java.awt.Color(0, 0, 0));

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

        lblStudentsIndividualAllScoreFrame.setBackground(new java.awt.Color(204, 255, 204));
        lblStudentsIndividualAllScoreFrame.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        lblStudentsIndividualAllScoreFrame.setForeground(new java.awt.Color(0, 255, 0));
        lblStudentsIndividualAllScoreFrame.setText("MY RECORDS");

        pnlViewAllStudentsInner.setBackground(new java.awt.Color(0, 0, 0));

        tblStudentsIndividualAllScores.setBackground(new java.awt.Color(204, 204, 204));
        tblStudentsIndividualAllScores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENT ID", "EXAM ID", "SUBJECT", "RIGHT", "WRONG", "UNATTEMPTED", "PERCENTAGE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentsIndividualAllScores);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 153, 51));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlViewAllStudentsInnerLayout = new javax.swing.GroupLayout(pnlViewAllStudentsInner);
        pnlViewAllStudentsInner.setLayout(pnlViewAllStudentsInnerLayout);
        pnlViewAllStudentsInnerLayout.setHorizontalGroup(
            pnlViewAllStudentsInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewAllStudentsInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlViewAllStudentsInnerLayout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlViewAllStudentsInnerLayout.setVerticalGroup(
            pnlViewAllStudentsInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewAllStudentsInnerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        lblDisplayUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblDisplayUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblDisplayUsername.setForeground(new java.awt.Color(0, 255, 0));

        lblScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizApp_Gui/Images/l&t-logo.PNG"))); // NOI18N

        javax.swing.GroupLayout ViewAllStudentsScorePanelLayout = new javax.swing.GroupLayout(ViewAllStudentsScorePanel);
        ViewAllStudentsScorePanel.setLayout(ViewAllStudentsScorePanelLayout);
        ViewAllStudentsScorePanelLayout.setHorizontalGroup(
            ViewAllStudentsScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewAllStudentsScorePanelLayout.createSequentialGroup()
                .addComponent(pnlViewAllStudentsInner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ViewAllStudentsScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewAllStudentsScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewAllStudentsScorePanelLayout.createSequentialGroup()
                        .addComponent(lblDisplayUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 717, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewAllStudentsScorePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ViewAllStudentsScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScore)
                            .addComponent(lblStudentsIndividualAllScoreFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(354, 354, 354))))
        );
        ViewAllStudentsScorePanelLayout.setVerticalGroup(
            ViewAllStudentsScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewAllStudentsScorePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewAllStudentsScorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewAllStudentsScorePanelLayout.createSequentialGroup()
                        .addComponent(lblDisplayUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(288, 288, 288))
                    .addGroup(ViewAllStudentsScorePanelLayout.createSequentialGroup()
                        .addComponent(lblLogout)
                        .addGap(3, 3, 3)
                        .addComponent(lblStudentsIndividualAllScoreFrame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(pnlViewAllStudentsInner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewAllStudentsScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewAllStudentsScorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ViewScoreFrame viewScore=new ViewScoreFrame();
        viewScore.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(StudentsIndividualAllScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsIndividualAllScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsIndividualAllScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsIndividualAllScoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsIndividualAllScoreFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ViewAllStudentsScorePanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisplayUsername;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblStudentsIndividualAllScoreFrame;
    private javax.swing.JPanel pnlViewAllStudentsInner;
    private javax.swing.JTable tblStudentsIndividualAllScores;
    // End of variables declaration//GEN-END:variables
}