/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package front;

import back.Employee;
import back.EmployeeData;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sej
 */

public class showpannel extends javax.swing.JPanel {

    /**
     * Creates new form showpannel
     */
    EmployeeData data;
    public showpannel(EmployeeData data) {
        initComponents();
        this.data = data;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ViewButton = new javax.swing.JButton();
        Deletebutton = new javax.swing.JButton();
        StartD = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        EmpId = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        Position = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        Level = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        TeamInfo = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        CellPhone = new javax.swing.JTextField();
        lblCellPhoneNo = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        Gender = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Employee Details");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ViewButton.setText("VIEW");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        Deletebutton.setText("DELETE");
        Deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebuttonActionPerformed(evt);
            }
        });

        StartD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDActionPerformed(evt);
            }
        });

        lblStartDate.setText("Start Date");

        EmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIdActionPerformed(evt);
            }
        });

        lblEmployeeID.setText("Employee ID");

        Position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionActionPerformed(evt);
            }
        });

        lblPositionTitle.setText("Position Title");

        Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelActionPerformed(evt);
            }
        });

        lblLevel.setText("Level");

        TeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamInfoActionPerformed(evt);
            }
        });

        lblTeamInfo.setText("Team Info");

        CellPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellPhoneActionPerformed(evt);
            }
        });

        lblCellPhoneNo.setText("Cell Phone No.");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        lblEmailAddress.setText("Email Address");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        lblName.setText("Name");

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        lblAge.setText("Age");

        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });

        lblGender.setText("Gender");

        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Deletebutton)
                        .addGap(174, 174, 174)
                        .addComponent(ViewButton)
                        .addGap(161, 161, 161)
                        .addComponent(UpdateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAge)
                                    .addComponent(lblGender)
                                    .addComponent(lblStartDate)
                                    .addComponent(lblEmployeeID)
                                    .addComponent(lblPositionTitle)
                                    .addComponent(lblLevel)
                                    .addComponent(lblTeamInfo)
                                    .addComponent(lblCellPhoneNo)
                                    .addComponent(lblName)
                                    .addComponent(lblEmailAddress))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Age)
                                    .addComponent(Gender)
                                    .addComponent(StartD)
                                    .addComponent(EmpId)
                                    .addComponent(Position)
                                    .addComponent(Level)
                                    .addComponent(TeamInfo)
                                    .addComponent(CellPhone)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitle)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Deletebutton)
                            .addComponent(ViewButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(UpdateButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStartDate)
                            .addComponent(StartD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeID)
                            .addComponent(EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(lblPositionTitle))
                    .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTeamInfo)
                    .addComponent(TeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellPhoneNo)
                    .addComponent(CellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmailAddress)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(311, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StartDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDActionPerformed

    private void EmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpIdActionPerformed

    private void PositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionActionPerformed

    private void LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LevelActionPerformed

    private void TeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamInfoActionPerformed

    private void CellPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CellPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CellPhoneActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void DeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebuttonActionPerformed
       int selectedRowIndex = jTable1.getSelectedRow();
        System.out.println(selectedRowIndex);
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"please select a row to delete");
            return; 
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        System.out.println(model.getValueAt(selectedRowIndex , 0));
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0 );
        
        data.deletedata(selectedEmployee);
        
        JOptionPane.showMessageDialog(this,"data deleted");
        populateTable();

    }//GEN-LAST:event_DeletebuttonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"please select a row to delete");
            return; 
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0 );
        Name.setText(String.valueOf(selectedEmployee.getName()));
        Age.setText(String.valueOf(selectedEmployee.getAge()));
        Gender.setText(String.valueOf(selectedEmployee.getGender()));
        StartD.setText(String.valueOf(selectedEmployee.getDate()));
        EmpId.setText(String.valueOf(selectedEmployee.getEmployeeID()));
        Position.setText(String.valueOf(selectedEmployee.getPositionTitle()));
        Level.setText(selectedEmployee.getLevel());
        TeamInfo.setText(selectedEmployee.getTeamInfo());
        CellPhone.setText(String.valueOf(selectedEmployee.getCellPhoneNo()));
        Email.setText(String.valueOf(selectedEmployee.getEmail()));
        
        
       
        
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField CellPhone;
    private javax.swing.JButton Deletebutton;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField EmpId;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField Level;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Position;
    private javax.swing.JTextField StartD;
    private javax.swing.JTextField TeamInfo;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhoneNo;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
       for (Employee ed : data.getdata())
       {
        Object[] row = new Object[10];
    
        row[0] = ed;
        row[1] = ed.getAge();
        row[2] = ed.getGender();
        row[3] = ed.getDate();
        row[4] = ed.getEmployeeID();
        row[5] = ed.getPositionTitle();
        row[6] = ed.getLevel();
        row[7] = ed.getTeamInfo();
        row[8] = ed.getCellPhoneNo();
        row[9] = ed.getEmail();
   
        model.addRow(row);
        
       
       }
    }

}
        
                
                
           
   


    

