/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.Doctor;
import backend.DoctorDirectory;
import backend.patient;
import backend.patientdirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sej
 */
public class DoctorRegistration extends javax.swing.JFrame {

    /**
     * Creates new form DoctorRegistration
     */
    public DoctorRegistration() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        doctorHomeBtn = new javax.swing.JButton();
        doctorLogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doctorName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        doctorContact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        doctorEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        doctorID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        doctorGender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        doctorAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        docotorQualifications = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        doctorSpecialization = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        doctorUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        doctorPassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        doctorPasswordAgain = new javax.swing.JTextField();
        doctorRegisterBtn = new javax.swing.JButton();
        doctorViewBtn = new javax.swing.JButton();
        doctorUpdateBtn = new javax.swing.JButton();
        doctorDeleteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 679));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorHomeBtn.setText("Home");
        doctorHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorHomeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(doctorHomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 15, -1, -1));

        doctorLogoutBtn.setText("Logout");
        doctorLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(doctorLogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 15, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 15)); // NOI18N
        jLabel1.setText("Doctor Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 16, -1, -1));

        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 76, -1, -1));
        jPanel1.add(doctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 73, 120, -1));

        jLabel3.setText("Contact");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 123, -1, -1));

        doctorContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorContactActionPerformed(evt);
            }
        });
        jPanel1.add(doctorContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 117, 120, -1));

        jLabel4.setText("Email ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 161, -1, -1));
        jPanel1.add(doctorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 158, 120, -1));

        jLabel5.setText("Docotor ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 202, -1, -1));
        jPanel1.add(doctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 199, 120, -1));

        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 240, -1, -1));

        doctorGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorGenderActionPerformed(evt);
            }
        });
        jPanel1.add(doctorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 248, 120, -1));

        jLabel7.setText("Age");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 287, -1, -1));
        jPanel1.add(doctorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 289, 120, -1));

        jLabel8.setText("DOB");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 76, -1, -1));

        jLabel9.setText("Qualifications");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 111, -1, -1));

        docotorQualifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docotorQualificationsActionPerformed(evt);
            }
        });
        jPanel1.add(docotorQualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 108, 130, -1));

        jLabel10.setText("Specialization");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 161, -1, -1));

        doctorSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorSpecializationActionPerformed(evt);
            }
        });
        jPanel1.add(doctorSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 158, 130, -1));

        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 202, -1, -1));

        doctorUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(doctorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 199, 130, -1));

        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 251, -1, -1));
        jPanel1.add(doctorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 248, 130, -1));

        jLabel13.setText("Re-enter Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 289, -1, -1));

        doctorPasswordAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorPasswordAgainActionPerformed(evt);
            }
        });
        jPanel1.add(doctorPasswordAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 289, 130, -1));

        doctorRegisterBtn.setText("Register");
        doctorRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorRegisterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(doctorRegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 409, -1, -1));

        doctorViewBtn.setText("View");
        doctorViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorViewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(doctorViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 409, 85, -1));

        doctorUpdateBtn.setText("Update");
        jPanel1.add(doctorUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 409, 78, -1));

        doctorDeleteBtn.setText("Delete");
        jPanel1.add(doctorDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 409, 90, -1));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "doctorId", "Gender", "Email", "Contact", "Username", "Qualifications"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 458, 940, 174));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorHomeBtnActionPerformed
        // TODO add your handling code here:

        MainFrame newMainFrame = new MainFrame();
        newMainFrame.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_doctorHomeBtnActionPerformed

    private void doctorLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorLogoutBtnActionPerformed
        // TODO add your handling code here:

        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_doctorLogoutBtnActionPerformed

    private void doctorContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorContactActionPerformed

    private void doctorGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorGenderActionPerformed

    private void doctorSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorSpecializationActionPerformed

    private void doctorUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorUsernameActionPerformed

    private void doctorPasswordAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorPasswordAgainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorPasswordAgainActionPerformed

    private void doctorRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorRegisterBtnActionPerformed
        // TODO add your handling code here:
       Doctor doc1=new Doctor();
       doc1.person.setName(doctorName.getText());
       doc1.person.setContactNo(Long.parseLong(doctorContact.getText()));
       doc1.person.setEmailId(doctorEmail.getText());
       doc1.person.setGender(doctorGender.getText());
       doc1.setDocId(Integer.parseInt(doctorID.getText()));
       doc1.setDocUsername(doctorUsername.getText());
       String Doc_Pwd=new String (doctorPassword.getPassword());
       doc1.setDocPwd(Doc_Pwd);
       doc1.setDocQualifications(docotorQualifications.getText());
       doc1.setDocSpecialize(doctorSpecialization.getText());
       DoctorDirectory.docdirect.add(doc1);
       JOptionPane.showMessageDialog(this, "doctor added successfully");
       DocDispTable();
       
       
       
        
    }//GEN-LAST:event_doctorRegisterBtnActionPerformed

    private void doctorViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorViewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex1=doc1Table.getSelectedRow();
        if (selectedRowIndex1<0){
            JOptionPane.showMessageDialog(this, "please select a row to view");
            return;
        }
        DefaultTableModel model1 = (DefaultTableModel) doc1Table.getModel();
        Doctor selectedDoc1=(Doctor)model1.getValueAt(selectedRowIndex1, 0);
        doctorName.setText(selectedDoc1.person.getName());
        doctorID.setText(String.valueOf(selectedDoc1.getDocId()));
        doctorGender.setText(selectedDoc1.person.getGender());
        doctorEmail.setText(selectedDoc1.person.getEmailId());
        doctorContact.setText(String.valueOf(selectedDoc1.person.getContactNo()));
        doctorUsername.setText(selectedDoc1.getDocUsername());
        docotorQualifications.setText(selectedDoc1.getDocQualifications());           
        
    }//GEN-LAST:event_doctorViewBtnActionPerformed

    private void docotorQualificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docotorQualificationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docotorQualificationsActionPerformed
    public void DocDispTable(){
        DefaultTableModel model1 = (DefaultTableModel) docTable.getModel();
        model1.setRowCount(0);
        System.out.println("done");
        for (Doctor d:DoctorDirectory.getdocdirect()){
            Object[] row=new Object[9];
            row[0]=d;
            row[1]=d.person.doctorID();
            row[2]=d.person.getContactNo();
            row[3]=d.person.getEmailId();
            row[4]=d.person.getGender();
            row[5]=d.person.getAge();
            row[6]=d.getDocQualifications();
            row[7]=d.getDocSpecialize();
            row[8]=d.getDocUsername();
            model1.addRow(row);
            
        }
        
    }
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
            java.util.logging.Logger.getLogger(DoctorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField docotorQualifications;
    private javax.swing.JTextField doctorAge;
    private javax.swing.JTextField doctorContact;
    private javax.swing.JButton doctorDeleteBtn;
    private javax.swing.JTextField doctorEmail;
    private javax.swing.JTextField doctorGender;
    private javax.swing.JButton doctorHomeBtn;
    private javax.swing.JTextField doctorID;
    private javax.swing.JButton doctorLogoutBtn;
    private javax.swing.JTextField doctorName;
    private javax.swing.JTextField doctorPassword;
    private javax.swing.JTextField doctorPasswordAgain;
    private javax.swing.JButton doctorRegisterBtn;
    private javax.swing.JTextField doctorSpecialization;
    private javax.swing.JButton doctorUpdateBtn;
    private javax.swing.JTextField doctorUsername;
    private javax.swing.JButton doctorViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}