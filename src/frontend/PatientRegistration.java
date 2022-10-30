/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.patient;
import backend.patientdirectory;
import backend.person;
import backend.personDirectory;
import backend.vitalsigns;
import backend.vitalsignshistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sej
 */
public class PatientRegistration extends javax.swing.JFrame {
    person per = new person();
    vitalsignshistory vitaldirect;
    patientdirectory patientdirect;
    //personDirectory persondirect;
    

    /**
     * Creates new form PatientRegistration
     */
    public PatientRegistration(patientdirectory patientdirect) {
        initComponents();
        //this.persondirect=persondirect;
        this.patientdirect=patientdirect;
        this.vitaldirect=vitaldirect;
        patientDispTable();
       
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        patientContact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        patientEmailId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        patientGender = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        patientAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientBloodgroup = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        patientHeight = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        patientWeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        patientHouse = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        patientCommunity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        patientCity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        patientState = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        patientZipcode = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        patientPassword = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        patientReenterpassword = new javax.swing.JTextField();
        registrationbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        viewbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        patientId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1029, 989));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setPreferredSize(new java.awt.Dimension(1029, 989));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setText("Patient Registration");

        jLabel2.setText("Name");

        jLabel3.setText("Contact");

        jLabel10.setText("Email ID");

        jLabel5.setText("Gender");

        jLabel15.setText("Age");

        jLabel8.setText("DOB");

        jLabel6.setText("BloodGrp");

        patientBloodgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBloodgroupActionPerformed(evt);
            }
        });

        jLabel17.setText("Height");

        jLabel18.setText("Weight");

        jLabel7.setText("House");

        jLabel19.setText("Community");

        jLabel9.setText("City");

        jLabel16.setText("State");

        jLabel12.setText("Zip Code");

        patientZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientZipcodeActionPerformed(evt);
            }
        });

        jLabel21.setText("Password");

        jLabel20.setText("Re-enter Password");

        patientReenterpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientReenterpasswordActionPerformed(evt);
            }
        });

        registrationbtn.setBackground(new java.awt.Color(204, 204, 204));
        registrationbtn.setText("REGISTER");
        registrationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationbtnActionPerformed(evt);
            }
        });

        patientTable.setBackground(new java.awt.Color(204, 204, 204));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "name", "patient id", "contact no", "email id", "gender", "age", "house", "community", "city", "state", "BloodPressure", "BodyTemperature"
            }
        ));
        patientTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        patientTable.setGridColor(new java.awt.Color(51, 51, 51));
        patientTable.setSelectionForeground(new java.awt.Color(0, 255, 255));
        jScrollPane2.setViewportView(patientTable);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        viewbtn.setBackground(new java.awt.Color(204, 204, 204));
        viewbtn.setText("view");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(204, 204, 204));
        updatebtn.setText("update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(204, 204, 204));
        deletebtn.setText("delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("LogOut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setText("PatientId");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(58, 58, 58)
                                .addComponent(patientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(307, 307, 307)
                                .addComponent(jLabel12)
                                .addGap(89, 89, 89))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(270, 270, 270))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton6)
                                .addGap(236, 236, 236)
                                .addComponent(jLabel1)
                                .addGap(286, 286, 286)
                                .addComponent(jButton5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48)
                                .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52)
                                .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(patientHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(517, 517, 517)
                                .addComponent(jLabel9)
                                .addGap(123, 123, 123)
                                .addComponent(patientCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(37, 37, 37)
                                .addComponent(patientGender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(307, 307, 307)
                                .addComponent(jLabel16)
                                .addGap(116, 116, 116)
                                .addComponent(patientState, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(patientBloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(309, 309, 309)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(patientReenterpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(321, 321, 321)
                                        .addComponent(jLabel21)
                                        .addGap(71, 71, 71)
                                        .addComponent(patientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(registrationbtn)
                                    .addGap(133, 133, 133)
                                    .addComponent(viewbtn)
                                    .addGap(143, 143, 143)
                                    .addComponent(updatebtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deletebtn))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel3)
                                    .addGap(36, 36, 36)
                                    .addComponent(patientContact, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(307, 307, 307)
                                    .addComponent(jLabel19)
                                    .addGap(80, 80, 80)
                                    .addComponent(patientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(jButton5))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(patientHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(patientContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(patientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(patientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(patientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(patientState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(patientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12))
                    .addComponent(patientZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(patientBloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(patientHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(patientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(patientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(patientReenterpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(123, 123, 123)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18)
                        .addGap(60, 60, 60)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewbtn)
                    .addComponent(updatebtn)
                    .addComponent(deletebtn)
                    .addComponent(registrationbtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientBloodgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBloodgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientBloodgroupActionPerformed

    private void patientZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientZipcodeActionPerformed

    private void patientReenterpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientReenterpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientReenterpasswordActionPerformed

    private void registrationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationbtnActionPerformed
        // TODO add your handling code here:
        patient pat1=new patient();
        pat1.setName(patientName.getText());
        pat1.setAge(Integer.parseInt(patientAge.getText()));
        pat1.setContactNo(Long.parseLong(patientContact.getText()));
        pat1.setContactNo(Long.parseLong(patientContact.getText()));
        pat1.setEmailId(patientEmailId.getText());
        pat1.setGender(patientGender.getText());
        
        pat1.residence.communityName = patientCommunity.getText();
                
                //.setCommunityName(patientCommunity.getText());
        pat1.residence.houseNo = Integer.parseInt(patientHouse.getText());
        pat1.residence.setZip(Integer.valueOf(patientZipcode.getText()));
        pat1.residence.newCity = patientCity.getText();
        pat1.residence.state = patientState.getText();
        pat1.setPatientId(Integer.parseInt(patientId.getText()));
        //pat1.setPatientUsername(patientUsername.getText());
        pat1.setPatientpwd(patientPassword.getText());
       
        patientdirectory.patientdirect.add(pat1);
        JOptionPane.showMessageDialog(this, "patient Successfully Added");
        patientDispTable();
    }//GEN-LAST:event_registrationbtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MainFrame newMainFrame = new MainFrame();
        newMainFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
     int selectedRowIndex1=patientTable.getSelectedRow();
     if(selectedRowIndex1<0){
         JOptionPane.showMessageDialog(this, "please select a row to to view");
         return;
     }
        DefaultTableModel model1 = (DefaultTableModel) patientTable.getModel();
        patient selectedpatient=(patient)model1.getValueAt(selectedRowIndex1, 0);
        patientName.setText(selectedpatient.per.getName());
        patientId.setText(String.valueOf(selectedpatient.getPatientId()));
        patientContact.setText(String.valueOf(selectedpatient.per.getContactNo()));
        patientEmailId.setText(selectedpatient.per.getEmailId());
        patientGender.setText(selectedpatient.per.getGender());
        patientAge.setText(String.valueOf(selectedpatient.per.getAge()));
        patientHouse.setText(String.valueOf(selectedpatient.per.residence.getHouseNo()));
        patientCommunity.setText(selectedpatient.per.residence.getCommunityName());
        patientCity.setText(selectedpatient.per.residence.getNewCity());
        patientState.setText(selectedpatient.per.residence.getState());
        patientZipcode.setText(String.valueOf(selectedpatient.per.residence.getZip()));
         
    }//GEN-LAST:event_viewbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex1=patientTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        patient selectedPatient=(patient)model.getValueAt(selectedRowIndex1, 0);
        selectedPatient.per.setName(patientName.getText());
        selectedPatient.per.setContactNo(Long.parseLong(patientContact.getText()));
        selectedPatient.per.setEmailId(patientEmailId.getText());
        selectedPatient.per.setGender(patientGender.getText());
        selectedPatient.per.residence.communityName = patientCommunity.getText();
        selectedPatient.per.residence.houseNo = Integer.parseInt(patientHouse.getText());
        selectedPatient.per.residence.houseNo = Integer.parseInt(patientHouse.getText());
        selectedPatient.per.residence.setZip(Integer.valueOf(patientZipcode.getText()));
        selectedPatient.per.residence.newCity = patientCity.getText();
        selectedPatient.per.residence.state = patientState.getText();
        selectedPatient.setPatientId(Integer.parseInt(patientId.getText()));
        //selectedPatient.setPatientUsername(patientUsername.getText());
        String Patient_pwd=new String(patientPassword.getText());
        patientDispTable();
        
        
    
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
//      TODO add your handling code here:
       int rowIndex = patientTable.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "please select a row to delete");
            return;
        }
         DefaultTableModel model1 = (DefaultTableModel) patientTable.getModel();
         patient selectedpatient=(patient)model1.getValueAt(rowIndex, 0);
         patientdirect.deletepatient(selectedpatient);
         JOptionPane.showMessageDialog(this, "data deleted");
         patientDispTable();
         
         
    }//GEN-LAST:event_deletebtnActionPerformed

    
//public void personDispTable(){
//        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
//        model.setRowCount(0);
//        System.out.println("Done");
//        for (person p:persondirect.getpersondirect()){
//            Object[] row=new Object[10];
//            row[0]=p;
//            row[1]=p.getPersonId();
//            row[2]=p.getContact();
//            row[3]=p.getEmailid();
//            row[4]=p.getGender();
//            row[5]=p.getAge();
//            row[6]=p.residence.getHouse();
//            row[7]=p.getCommunityname();
//            row[8]=p.getNewCity();
//            row[9]=p.getState();
//            model.addRow(row);
//            }
        
    
    public void patientDispTable(){
        DefaultTableModel model1 = (DefaultTableModel) patientTable.getModel();
        model1.setRowCount(0);
        System.out.println("Done");
        for (patient p1:patientdirect.getpatientdirect()){
            Object[] row=new Object[10];
            row[0]=p1.per;
            row[1]=p1.getPatientId();
            row[2]=p1.per.getContactNo();
            row[3]=p1.per.getEmailId();
            row[4]=p1.per.getGender();
            row[5]=p1.per.getAge();
            row[6]=p1.per.residence.getHouseNo();
            row[7]=p1.per.residence.getCommunityName();
            row[8]=p1.per.residence.getNewCity();
            row[9]=p1.per.residence.getState();
            model1.addRow(row);
         }
 
        
        
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PatientRegistration().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField patientAge;
    private javax.swing.JTextField patientBloodgroup;
    private javax.swing.JTextField patientCity;
    private javax.swing.JTextField patientCommunity;
    private javax.swing.JTextField patientContact;
    private javax.swing.JTextField patientEmailId;
    private javax.swing.JTextField patientGender;
    private javax.swing.JTextField patientHeight;
    private javax.swing.JTextField patientHouse;
    private javax.swing.JTextField patientId;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField patientPassword;
    private javax.swing.JTextField patientReenterpassword;
    private javax.swing.JTextField patientState;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField patientWeight;
    private javax.swing.JTextField patientZipcode;
    private javax.swing.JButton registrationbtn;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables

    
}
