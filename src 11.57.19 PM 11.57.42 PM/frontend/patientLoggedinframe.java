/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.EncounterHistory;
import backend.patient;
import backend.patientdirectory;



/**
 *
 * @author sej
 */
public class patientLoggedinframe extends javax.swing.JFrame {

    /**
     * Creates new form patientLoggedinframe
     */
    patient patient;
    patientdirectory patientdirect ;
//    DoctorDirectory doctordirectory = new DoctorDirectory();
    EncounterHistory encHis = new EncounterHistory();
    public String patientUsername;
    public patientLoggedinframe(String username) {
        initComponents();
        this.patientUsername=username;
    for(patient p:patientdirectory.getpatientdirect()){
            if(username.equals(p.getEmailId())){
                patient = p;
            }
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

        jPanel2 = new javax.swing.JPanel();
        patientLogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        viewDetsBtn = new javax.swing.JButton();
        BookPatientEncounterBtn = new javax.swing.JButton();
        ViewEncounterBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        patientLogoutBtn.setText("Logout");
        patientLogoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLogoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setText("Patient Home Screen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(jLabel1)
                .addGap(301, 301, 301)
                .addComponent(patientLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(patientLogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        viewDetsBtn.setText("View & Update Details");
        viewDetsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetsBtnActionPerformed(evt);
            }
        });

        BookPatientEncounterBtn.setText("Book appt & View Doctors");
        BookPatientEncounterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookPatientEncounterBtnActionPerformed(evt);
            }
        });

        ViewEncounterBtn.setText("Encounter History");
        ViewEncounterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEncounterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookPatientEncounterBtn)
                    .addComponent(viewDetsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewEncounterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(viewDetsBtn)
                .addGap(50, 50, 50)
                .addComponent(BookPatientEncounterBtn)
                .addGap(47, 47, 47)
                .addComponent(ViewEncounterBtn)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SplitPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientLogoutBtnActionPerformed
        // TODO add your handling code here:

        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_patientLogoutBtnActionPerformed

    private void viewDetsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetsBtnActionPerformed
        // TODO add your handling code here:
        PatientAccount ptDets = new PatientAccount(patientdirect,patientUsername);
        SplitPane.setRightComponent(ptDets);

    }//GEN-LAST:event_viewDetsBtnActionPerformed

    private void BookPatientEncounterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookPatientEncounterBtnActionPerformed
        // TODO add your handling code here:
//        PatientBookEncounter ptBookEnc= new PatientBookEncounter(patientUsername, encHis);
//        SplitPane.setRightComponent(ptBookEnc);
    }//GEN-LAST:event_BookPatientEncounterBtnActionPerformed

    private void ViewEncounterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEncounterBtnActionPerformed
        // TODO add your handling code here:
        PatientAccount ptEncDets = new PatientAccount(patientdirect,patientUsername);
        SplitPane.setRightComponent(ptEncDets);
    }//GEN-LAST:event_ViewEncounterBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(patientLoggedinframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(patientLoggedinframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(patientLoggedinframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(patientLoggedinframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new patientLoggedinframe().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookPatientEncounterBtn;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton ViewEncounterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton patientLogoutBtn;
    private javax.swing.JButton viewDetsBtn;
    // End of variables declaration//GEN-END:variables
}
