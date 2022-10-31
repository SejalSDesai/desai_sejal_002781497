/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.Doctor;
import backend.DoctorDirectory;
import backend.Encounter;
import backend.EncounterHistory;
import backend.patient;
import backend.patientdirectory;
import backend.personDirectory;
import backend.vitalsignshistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DoctorLoggedInPage extends javax.swing.JFrame {
/**
 *
 * @author sej
 */

DoctorDirectory docdirect = new DoctorDirectory();
EncounterHistory encounterhis = new EncounterHistory();
patientdirectory patientdirect = new patientdirectory();
Doctor doc1;
public String username;
public String community;
    /**
     * Creates new form DoctorLoggedInPage
     */
    public DoctorLoggedInPage(String userName) {
        initComponents();
        this.username=userName;
         for(Doctor d: docdirect.getdocdirect()){
            if(username.equals(d.getEmailId())){
                doc1 = d;
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

        SplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        createEncounter = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientDashboardTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        PatientEncNametxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        patientIDEnctxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        doctorIDEnctxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        doctorNameEnctxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        encounterIDEnctxtr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        patientBloodPressureLbl = new javax.swing.JLabel();
        BloodPresEnctxt = new javax.swing.JTextField();
        patientSugarLevelLbl = new javax.swing.JLabel();
        SugarLevelEnctxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BodyTempEnctxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SymptomsEnctxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DiagnosisEnctxt = new javax.swing.JTextField();
        CreateEnctxt = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        jPanel2 = new javax.swing.JPanel();
        patientLogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        createEncounter.setText("Schdeule / Update Encounter");
        createEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEncounterActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        patientDashboardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Patient ID", "Contact ", "Email ID", "Gender", "Age", "Address", "Blood Grp", "Height", "Weight", "Allergies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientDashboardTable.setAutoscrolls(false);
        jScrollPane2.setViewportView(patientDashboardTable);

        jLabel2.setText("Patient Name");

        jLabel10.setText("Patient ID");

        patientIDEnctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDEnctxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Doctor ID");

        doctorIDEnctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIDEnctxtActionPerformed(evt);
            }
        });

        jLabel11.setText("Doctor Name");

        doctorNameEnctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorNameEnctxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Encounter ID");

        encounterIDEnctxtr.setEditable(false);

        jLabel8.setText("Date");

        jLabel5.setText("Time");

        patientBloodPressureLbl.setText("Blood Pressure");

        BloodPresEnctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodPresEnctxtActionPerformed(evt);
            }
        });

        patientSugarLevelLbl.setText("Sugar Level");

        SugarLevelEnctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SugarLevelEnctxtActionPerformed(evt);
            }
        });

        jLabel9.setText("Body Temperature");

        BodyTempEnctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BodyTempEnctxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Symptoms");

        SymptomsEnctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymptomsEnctxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Diagnosis");

        CreateEnctxt.setText("Create");
        CreateEnctxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateEnctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEnctxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(200, 200, 200))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(encounterIDEnctxtr, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(doctorIDEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(51, 51, 51)
                                .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(SymptomsEnctxt))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(DiagnosisEnctxt)
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(PatientEncNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(patientIDEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(patientSugarLevelLbl)
                                        .addGap(39, 39, 39)
                                        .addComponent(SugarLevelEnctxt, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(patientBloodPressureLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(BloodPresEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(445, 445, 445)
                                .addComponent(BodyTempEnctxt)
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(doctorNameEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(CreateEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PatientEncNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientBloodPressureLbl)
                    .addComponent(BloodPresEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(patientSugarLevelLbl)
                    .addComponent(SugarLevelEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIDEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BodyTempEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(doctorNameEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SymptomsEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(encounterIDEnctxtr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorIDEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(CreateEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(241, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(DiagnosisEnctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createEncounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(createEncounter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SplitPane.setLeftComponent(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        patientLogoutBtn.setText("Logout");
        patientLogoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLogoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setText("Doctor Home Screen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jLabel1)
                .addGap(279, 279, 279)
                .addComponent(patientLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 759, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEncounterActionPerformed
        // TODO add your handling code here:
        EncounterSystemRegistration encounterRegistration=new EncounterSystemRegistration (docdirect, encounterhis, patientdirect);
//        EncounterSystemRegistration encounterRegistration=new EncounterSystemRegistration(docdirect,username);
       SplitPane.setRightComponent(encounterRegistration);
    }//GEN-LAST:event_createEncounterActionPerformed

    private void patientLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientLogoutBtnActionPerformed
        // TODO add your handling code here:

        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_patientLogoutBtnActionPerformed

    private void patientIDEnctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDEnctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDEnctxtActionPerformed

    private void doctorIDEnctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIDEnctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIDEnctxtActionPerformed

    private void doctorNameEnctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorNameEnctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorNameEnctxtActionPerformed

    private void BloodPresEnctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodPresEnctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodPresEnctxtActionPerformed

    private void SugarLevelEnctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SugarLevelEnctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SugarLevelEnctxtActionPerformed

    private void BodyTempEnctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BodyTempEnctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BodyTempEnctxtActionPerformed

    private void SymptomsEnctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymptomsEnctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SymptomsEnctxtActionPerformed

    private void CreateEnctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateEnctxtActionPerformed
        // TODO add your handling code here:
        Encounter enc = new Encounter();
        boolean b1 = patientdirect.checkPID(Integer.parseInt(patientIDEnctxt.getText()));
        boolean b2 = docdirect.checkDID(Integer.parseInt(doctorIDEnctxt.getText()));
        if(b1 && b2){
            int randomEncId=(int)(Math.random()*999+100);

            for(Encounter e:EncounterHistory.getencounterhis()){
                if(randomEncId==e.getEncId()){

                    randomEncId =(int)(Math.random()*999+100);
                }
            }

           enc.setEncId((int)(Math.random()*999+100));
            enc.patient.setPatientId(Integer.parseInt(patientIDEnctxt.getText()));
            enc.doc.setDocId(Integer.parseInt(doctorIDEnctxt.getText()));
            enc.setEncDate(jDateChooser1.getDate());
            enc.setEncTime(timePicker1.getTime());
            enc.patient.setName(PatientEncNametxt.getText());
            enc.doc.setName(doctorNameEnctxt.getText());
            enc.setSugarlevel(Float.parseFloat(SugarLevelEnctxt.getText()));
            enc.setBloodPressure(Float.parseFloat(BloodPresEnctxt.getText()));
            enc.setBloodPressure(Float.parseFloat(BloodPresEnctxt.getText()));
            enc.setSymptoms(SymptomsEnctxt.getText());
            enc.setEncDiagnosis(DiagnosisEnctxt.getText());

            EncounterHistory.encounterhis.add(enc);
        JOptionPane.showMessageDialog(this, "Encounter Successfully Added");

        }
        else{
            JOptionPane.showMessageDialog(this, "Entered ID doesn't exist");
        }
    }//GEN-LAST:event_CreateEnctxtActionPerformed
public void patientDashboardTable(){
    
        DefaultTableModel model = (DefaultTableModel) patientDashboardTable.getModel();
        model.setRowCount(0);
        
        System.out.println("Done");
        for(patient pt:patientdirect.getpatientdirect()){
            Object[] row=new Object[11];
            row[0]=pt;
            row[1]=pt.getPatientId();
            row[2]=pt.getContactNo();
            row[3]=pt.getEmailId();
            row[4]=pt.getGender();
            row[5]=pt.getAge();
            row[6]=pt.residence.getHouseNo() + ", "+ ", " + pt.residence.getCommunityName() + ", " + pt.residence.getCityName() + ", " +pt.residence.getState()+ "," + pt.residence.getZip();
            row[7]=pt.getBloodGroup();
            row[8]=pt.getPatientHeight();
            row[9]=pt.getPatientWeight();
            //row[10]=pt.getAllergies();
            model.addRow(row);
                    
        
        
    }
}
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
//            java.util.logging.Logger.getLogger(DoctorLoggedInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DoctorLoggedInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DoctorLoggedInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DoctorLoggedInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new DoctorLoggedInPage().setVisible(true);
////            }
////        });
////    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BloodPresEnctxt;
    private javax.swing.JTextField BodyTempEnctxt;
    private javax.swing.JButton CreateEnctxt;
    private javax.swing.JTextField DiagnosisEnctxt;
    private javax.swing.JTextField PatientEncNametxt;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JTextField SugarLevelEnctxt;
    private javax.swing.JTextField SymptomsEnctxt;
    private javax.swing.JButton createEncounter;
    private javax.swing.JTextField doctorIDEnctxt;
    private javax.swing.JTextField doctorNameEnctxt;
    private javax.swing.JTextField encounterIDEnctxtr;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel patientBloodPressureLbl;
    private javax.swing.JTable patientDashboardTable;
    private javax.swing.JTextField patientIDEnctxt;
    private javax.swing.JButton patientLogoutBtn;
    private javax.swing.JLabel patientSugarLevelLbl;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    // End of variables declaration//GEN-END:variables


}