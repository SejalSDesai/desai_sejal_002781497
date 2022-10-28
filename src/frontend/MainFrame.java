/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.personDirectory;

/**
 *
 * @author sej
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        menuRoles = new javax.swing.JMenuBar();
        roleSysAdmin = new javax.swing.JMenu();
        itemSysPatient = new javax.swing.JMenuItem();
        itemSysDoctor = new javax.swing.JMenuItem();
        itemSysHospital = new javax.swing.JMenuItem();
        itemSysEncounters = new javax.swing.JMenuItem();
        roleHospAdmin = new javax.swing.JMenu();
        itemHospPatient = new javax.swing.JMenuItem();
        itemHospDoctor = new javax.swing.JMenuItem();
        itemHospHospital = new javax.swing.JMenuItem();
        itemHospEncounters = new javax.swing.JMenuItem();
        roleCommAdmin = new javax.swing.JMenu();
        itemCommCity = new javax.swing.JMenuItem();
        itemCommCommunity = new javax.swing.JMenuItem();
        itemCommHouses = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        btnLogout.setBackground(new java.awt.Color(153, 153, 153));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        menuRoles.setBackground(new java.awt.Color(102, 102, 102));
        menuRoles.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 14)); // NOI18N

        roleSysAdmin.setBackground(new java.awt.Color(0, 0, 0));
        roleSysAdmin.setForeground(new java.awt.Color(153, 153, 153));
        roleSysAdmin.setText("System Admin");

        itemSysPatient.setBackground(new java.awt.Color(204, 204, 204));
        itemSysPatient.setText("Patient");
        itemSysPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysPatientActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysPatient);

        itemSysDoctor.setBackground(new java.awt.Color(204, 204, 204));
        itemSysDoctor.setText("Doctor");
        itemSysDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysDoctorActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysDoctor);

        itemSysHospital.setBackground(new java.awt.Color(204, 204, 204));
        itemSysHospital.setText("Hospital");
        itemSysHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysHospitalActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysHospital);

        itemSysEncounters.setBackground(new java.awt.Color(204, 204, 204));
        itemSysEncounters.setText("Encounters");
        itemSysEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysEncountersActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysEncounters);

        menuRoles.add(roleSysAdmin);

        roleHospAdmin.setBackground(new java.awt.Color(153, 153, 153));
        roleHospAdmin.setText("Hospital Admin");

        itemHospPatient.setText("Patient");
        roleHospAdmin.add(itemHospPatient);

        itemHospDoctor.setText("Doctor");
        roleHospAdmin.add(itemHospDoctor);

        itemHospHospital.setText("Hospital");
        itemHospHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHospHospitalActionPerformed(evt);
            }
        });
        roleHospAdmin.add(itemHospHospital);

        itemHospEncounters.setText("Encounters");
        roleHospAdmin.add(itemHospEncounters);

        menuRoles.add(roleHospAdmin);

        roleCommAdmin.setBackground(new java.awt.Color(153, 153, 153));
        roleCommAdmin.setText("Community Admin");

        itemCommCity.setText("City");
        itemCommCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCommCityActionPerformed(evt);
            }
        });
        roleCommAdmin.add(itemCommCity);

        itemCommCommunity.setText("Community");
        itemCommCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCommCommunityActionPerformed(evt);
            }
        });
        roleCommAdmin.add(itemCommCommunity);

        itemCommHouses.setText("Houses");
        itemCommHouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCommHousesActionPerformed(evt);
            }
        });
        roleCommAdmin.add(itemCommHouses);

        menuRoles.add(roleCommAdmin);

        setJMenuBar(menuRoles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 325, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 253, Short.MAX_VALUE)
                .addComponent(btnLogout))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCommCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCommCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCommCityActionPerformed

    private void itemCommCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCommCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCommCommunityActionPerformed

    private void itemHospHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHospHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemHospHospitalActionPerformed

    private void itemSysPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysPatientActionPerformed
        // TODO add your handling code here:
        PatientRegistration registerPatient = new PatientRegistration(patientdirect,persondirect,vitalsignsdirect);
        registerPatient.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_itemSysPatientActionPerformed

    private void itemSysHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSysHospitalActionPerformed

    private void itemSysEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysEncountersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSysEncountersActionPerformed

    private void itemSysDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSysDoctorActionPerformed

    private void itemCommHousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCommHousesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCommHousesActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
         LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void AssignMenu(String role){
        if(role.equals("system_admin")){
            roleSysAdmin.setVisible(true);
            roleHospAdmin.setVisible(true);
            roleCommAdmin.setVisible(true);
        }
        if(role.equals("hospital_admin")){
            roleSysAdmin.setVisible(false);
            roleHospAdmin.setVisible(true);
            roleCommAdmin.setVisible(false);
        }
        if(role.equals("community_admin")){
            roleSysAdmin.setVisible(false);
            roleHospAdmin.setVisible(false);
            roleCommAdmin.setVisible(true);
        }
    
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JMenuItem itemCommCity;
    private javax.swing.JMenuItem itemCommCommunity;
    private javax.swing.JMenuItem itemCommHouses;
    private javax.swing.JMenuItem itemHospDoctor;
    private javax.swing.JMenuItem itemHospEncounters;
    private javax.swing.JMenuItem itemHospHospital;
    private javax.swing.JMenuItem itemHospPatient;
    private javax.swing.JMenuItem itemSysDoctor;
    private javax.swing.JMenuItem itemSysEncounters;
    private javax.swing.JMenuItem itemSysHospital;
    private javax.swing.JMenuItem itemSysPatient;
    private javax.swing.JMenuBar menuRoles;
    private javax.swing.JMenu roleCommAdmin;
    private javax.swing.JMenu roleHospAdmin;
    private javax.swing.JMenu roleSysAdmin;
    // End of variables declaration//GEN-END:variables
}
