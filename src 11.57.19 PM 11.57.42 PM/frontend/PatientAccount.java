/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.patientdirectory;

/**
 *
 * @author sej
 */
public class PatientAccount extends javax.swing.JFrame {
patientdirectory patientdirect;
    /**
     * Creates new form PatientDetails
     */
     String username;
    public PatientAccount(patientdirectory patientdirect,String patientUsername) {
        initComponents();
        this.patientdirect=patientdirect;
        this.username=patientUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        personMedicalDetails = new javax.swing.JPanel();
        patientHeightLbl = new javax.swing.JLabel();
        patientDetailsHeight = new javax.swing.JTextField();
        patientWeightLbl = new javax.swing.JLabel();
        patientDetailsWeight = new javax.swing.JTextField();
        personPersonalDetails = new javax.swing.JPanel();
        patientDetailsName = new javax.swing.JTextField();
        patientNameLbl = new javax.swing.JLabel();
        patientContactLbl = new javax.swing.JLabel();
        patientDetailsContact = new javax.swing.JTextField();
        patientDetailsPatientID = new javax.swing.JTextField();
        patientPatientIDLbl = new javax.swing.JLabel();
        patientGenderLbl = new javax.swing.JLabel();
        patientDOBLbl = new javax.swing.JLabel();
        patientMaleRadioBtn = new javax.swing.JRadioButton();
        patientFemaleRadioBtn = new javax.swing.JRadioButton();
        patientOthersRadioBtn = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        patientDetailsLogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientDetailsHomeBtn = new javax.swing.JButton();
        personAddressDetails = new javax.swing.JPanel();
        patientDetailsHouse = new javax.swing.JTextField();
        patientHouseLbl = new javax.swing.JLabel();
        patientStreetLbl = new javax.swing.JLabel();
        patientDetailsStreet = new javax.swing.JTextField();
        patientDetailsCity = new javax.swing.JTextField();
        patientCommunityLbl = new javax.swing.JLabel();
        patientCityLbl = new javax.swing.JLabel();
        patientDetailsCommunity = new javax.swing.JTextField();
        patientZipCodeLbl = new javax.swing.JLabel();
        patientDetailsState = new javax.swing.JTextField();
        patientStateLbl = new javax.swing.JLabel();
        patientDetailsZipCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Update ");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 558, 108, 40));

        personMedicalDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 3, 13))); // NOI18N

        patientHeightLbl.setText("Height (in cms)");

        patientWeightLbl.setText("Weight (in lbs)");

        patientDetailsWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsWeightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personMedicalDetailsLayout = new javax.swing.GroupLayout(personMedicalDetails);
        personMedicalDetails.setLayout(personMedicalDetailsLayout);
        personMedicalDetailsLayout.setHorizontalGroup(
            personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personMedicalDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientHeightLbl)
                    .addComponent(patientWeightLbl))
                .addGap(18, 18, 18)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientDetailsWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientDetailsHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        personMedicalDetailsLayout.setVerticalGroup(
            personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personMedicalDetailsLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientHeightLbl))
                .addGap(20, 20, 20)
                .addGroup(personMedicalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientWeightLbl))
                .addGap(211, 211, 211))
        );

        getContentPane().add(personMedicalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 360, -1, -1));

        personPersonalDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 3, 13))); // NOI18N

        patientDetailsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsNameActionPerformed(evt);
            }
        });

        patientNameLbl.setText("Name");

        patientContactLbl.setText("Contact");

        patientPatientIDLbl.setText("Patient ID");

        patientGenderLbl.setText("Gender");

        patientDOBLbl.setText("DOB");

        patientMaleRadioBtn.setText("Male");
        patientMaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientMaleRadioBtnActionPerformed(evt);
            }
        });

        patientFemaleRadioBtn.setText("Female");
        patientFemaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientFemaleRadioBtnActionPerformed(evt);
            }
        });

        patientOthersRadioBtn.setText("Others");

        javax.swing.GroupLayout personPersonalDetailsLayout = new javax.swing.GroupLayout(personPersonalDetails);
        personPersonalDetails.setLayout(personPersonalDetailsLayout);
        personPersonalDetailsLayout.setHorizontalGroup(
            personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personPersonalDetailsLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personPersonalDetailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientContactLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientNameLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientDOBLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientGenderLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personPersonalDetailsLayout.createSequentialGroup()
                        .addComponent(patientPatientIDLbl)
                        .addGap(20, 20, 20)))
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientDetailsPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientDetailsName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientDetailsContact, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(personPersonalDetailsLayout.createSequentialGroup()
                        .addComponent(patientMaleRadioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientFemaleRadioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientOthersRadioBtn)))
                .addGap(20, 20, 20))
        );
        personPersonalDetailsLayout.setVerticalGroup(
            personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personPersonalDetailsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientDetailsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameLbl))
                .addGap(20, 20, 20)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientDetailsContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientContactLbl))
                .addGap(20, 20, 20)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientPatientIDLbl))
                .addGap(21, 21, 21)
                .addGroup(personPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientGenderLbl)
                    .addComponent(patientMaleRadioBtn)
                    .addComponent(patientFemaleRadioBtn)
                    .addComponent(patientOthersRadioBtn))
                .addGap(23, 23, 23)
                .addComponent(patientDOBLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(personPersonalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 75, -1, 273));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        patientDetailsLogoutBtn.setText("Logout");
        patientDetailsLogoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientDetailsLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsLogoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setText("Patient Details");

        patientDetailsHomeBtn.setText("Home");
        patientDetailsHomeBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientDetailsHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsHomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(patientDetailsHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317)
                .addComponent(jLabel1)
                .addGap(353, 353, 353)
                .addComponent(patientDetailsLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(patientDetailsLogoutBtn)
                    .addComponent(patientDetailsHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        personAddressDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 3, 13))); // NOI18N

        patientDetailsHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsHouseActionPerformed(evt);
            }
        });

        patientHouseLbl.setText("House");

        patientStreetLbl.setText("Street");

        patientCommunityLbl.setText("Community");

        patientCityLbl.setText("City");

        patientDetailsCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsCommunityActionPerformed(evt);
            }
        });

        patientZipCodeLbl.setText("Zipcode");

        patientDetailsState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDetailsStateActionPerformed(evt);
            }
        });

        patientStateLbl.setText("State");

        javax.swing.GroupLayout personAddressDetailsLayout = new javax.swing.GroupLayout(personAddressDetails);
        personAddressDetails.setLayout(personAddressDetailsLayout);
        personAddressDetailsLayout.setHorizontalGroup(
            personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personAddressDetailsLayout.createSequentialGroup()
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(patientZipCodeLbl))
                                    .addComponent(patientStateLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createSequentialGroup()
                                .addComponent(patientCityLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientDetailsState, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientDetailsCity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientDetailsZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(personAddressDetailsLayout.createSequentialGroup()
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(patientStreetLbl)
                                    .addComponent(patientHouseLbl)))
                            .addGroup(personAddressDetailsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(patientCommunityLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientDetailsCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientDetailsStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientDetailsHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        personAddressDetailsLayout.setVerticalGroup(
            personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientHouseLbl))
                .addGap(20, 20, 20)
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientDetailsStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientStreetLbl))
                .addGap(20, 20, 20)
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientDetailsCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientCommunityLbl))
                .addGap(20, 20, 20)
                .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createSequentialGroup()
                        .addComponent(patientStateLbl)
                        .addGap(18, 18, 18)
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientZipCodeLbl)
                            .addComponent(patientDetailsZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personAddressDetailsLayout.createSequentialGroup()
                        .addGroup(personAddressDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientCityLbl)
                            .addComponent(patientDetailsCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(patientDetailsState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(11, 11, 11))
        );

        getContentPane().add(personAddressDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 75, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patientDetailsWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsWeightActionPerformed

    private void patientDetailsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsNameActionPerformed

    private void patientMaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientMaleRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientMaleRadioBtnActionPerformed

    private void patientFemaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientFemaleRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientFemaleRadioBtnActionPerformed

    private void patientDetailsLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsLogoutBtnActionPerformed
        // TODO add your handling code here:

        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_patientDetailsLogoutBtnActionPerformed

    private void patientDetailsHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsHomeBtnActionPerformed
        // TODO add your handling code here:

        MainFrame newMainFrame = new MainFrame();
        newMainFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_patientDetailsHomeBtnActionPerformed

    private void patientDetailsHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsHouseActionPerformed

    private void patientDetailsCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsCommunityActionPerformed

    private void patientDetailsStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDetailsStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientDetailsStateActionPerformed

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
//            java.util.logging.Logger.getLogger(PatientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PatientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PatientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PatientAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PatientAccount().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel patientCityLbl;
    private javax.swing.JLabel patientCommunityLbl;
    private javax.swing.JLabel patientContactLbl;
    private javax.swing.JLabel patientDOBLbl;
    private javax.swing.JTextField patientDetailsCity;
    private javax.swing.JTextField patientDetailsCommunity;
    private javax.swing.JTextField patientDetailsContact;
    private javax.swing.JTextField patientDetailsHeight;
    private javax.swing.JButton patientDetailsHomeBtn;
    private javax.swing.JTextField patientDetailsHouse;
    private javax.swing.JButton patientDetailsLogoutBtn;
    private javax.swing.JTextField patientDetailsName;
    private javax.swing.JTextField patientDetailsPatientID;
    private javax.swing.JTextField patientDetailsState;
    private javax.swing.JTextField patientDetailsStreet;
    private javax.swing.JTextField patientDetailsWeight;
    private javax.swing.JTextField patientDetailsZipCode;
    private javax.swing.JRadioButton patientFemaleRadioBtn;
    private javax.swing.JLabel patientGenderLbl;
    private javax.swing.JLabel patientHeightLbl;
    private javax.swing.JLabel patientHouseLbl;
    private javax.swing.JRadioButton patientMaleRadioBtn;
    private javax.swing.JLabel patientNameLbl;
    private javax.swing.JRadioButton patientOthersRadioBtn;
    private javax.swing.JLabel patientPatientIDLbl;
    private javax.swing.JLabel patientStateLbl;
    private javax.swing.JLabel patientStreetLbl;
    private javax.swing.JLabel patientWeightLbl;
    private javax.swing.JLabel patientZipCodeLbl;
    private javax.swing.JPanel personAddressDetails;
    private javax.swing.JPanel personMedicalDetails;
    private javax.swing.JPanel personPersonalDetails;
    // End of variables declaration//GEN-END:variables
}