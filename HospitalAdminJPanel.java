
package UI.HospitalDepartment;

import model.EcoSystem;
import model.Hospital.AmbulanceService;
import model.Hospital.AmbulanceServiceDirectory;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Component;
import model.Hospital.Doctor;
import model.Hospital.DoctorDirectory;
import model.Hospital.Hospital;
import model.Hospital.HospitalDirectory;
import javax.swing.JOptionPane;


public class HospitalAdminJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    
    
    public HospitalAdminJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem system, String patientName, String area, String status, String reqID) {
        initComponents();
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        setData(patientName, area, status, reqID);
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
        btnManage = new javax.swing.JButton();
        lblAdditionalDetails = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtNPINum = new javax.swing.JTextField();
        btnAddDoctor = new javax.swing.JButton();
        txtEMTName = new javax.swing.JTextField();
        lblEMTName = new javax.swing.JLabel();
        lblNPINum = new javax.swing.JLabel();
        lblAddEMT = new javax.swing.JLabel();
        btnAddAmbulance = new javax.swing.JButton();
        txtAmbNum = new javax.swing.JTextField();
        lblAmbNum = new javax.swing.JLabel();
        lblAddAmb = new javax.swing.JLabel();
        lblDisplayPatientName = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblDisplayPatientArea = new javax.swing.JLabel();
        lblDisplayStatus = new javax.swing.JLabel();
        lblPatientArea = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDisplayRequestId = new javax.swing.JLabel();
        lblRequestID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblTitle.setText("Check EMT & Ambulance Availabilility");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 530, -1));

        btnManage.setBackground(new java.awt.Color(0, 255, 255));
        btnManage.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnManage.setText("Manage");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 90, 40));

        lblAdditionalDetails.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblAdditionalDetails.setText("Click here to get additional details :");
        add(lblAdditionalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        btnBack.setBackground(new java.awt.Color(153, 255, 102));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 30));
        add(txtNPINum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 160, -1));

        btnAddDoctor.setBackground(new java.awt.Color(204, 255, 102));
        btnAddDoctor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddDoctor.setText("Add Doctor");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });
        add(btnAddDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, 30));
        add(txtEMTName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 160, -1));

        lblEMTName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblEMTName.setText("EMT Name:");
        add(lblEMTName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, 20));

        lblNPINum.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNPINum.setText("NPI Number:");
        add(lblNPINum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        lblAddEMT.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblAddEMT.setText("Add EMT Availability :");
        add(lblAddEMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        btnAddAmbulance.setBackground(new java.awt.Color(153, 255, 102));
        btnAddAmbulance.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAddAmbulance.setText("Add Ambulance");
        btnAddAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAmbulanceActionPerformed(evt);
            }
        });
        add(btnAddAmbulance, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, 30));
        add(txtAmbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 160, -1));

        lblAmbNum.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAmbNum.setText("Ambulance Number:");
        add(lblAmbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, 20));

        lblAddAmb.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblAddAmb.setText("Add Ambulance Availability :");
        add(lblAddAmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        lblDisplayPatientName.setText("jLabel6");
        add(lblDisplayPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        lblPatientName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPatientName.setText("Patient Name :");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 120, -1));

        lblDisplayPatientArea.setText("jLabel8");
        add(lblDisplayPatientArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        lblDisplayStatus.setText("jLabel8");
        add(lblDisplayStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        lblPatientArea.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPatientArea.setText("Patient Area :");
        add(lblPatientArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        lblStatus.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblStatus.setText("Status :");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 100, -1));

        lblDisplayRequestId.setText("jLabel8");
        add(lblDisplayRequestId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        lblRequestID.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblRequestID.setText("Request ID :");
        add(lblRequestID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        String patientName = lblDisplayPatientName.getText();
        String area = lblDisplayPatientArea.getText();
        String status = lblDisplayStatus.getText();
        String reqID = lblDisplayRequestId.getText();
        String docName = txtEMTName.getText();
        String npiNum = txtNPINum.getText();
        String ambNum = txtAmbNum.getText();
        

        
        HospitalManagementJpanel manageHospital=new HospitalManagementJpanel(userProcessContainer,account, system, patientName, area, status, reqID, docName, npiNum, ambNum);
        userProcessContainer.add("Manage ManageHospital",manageHospital);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        String doctorName = txtEMTName.getText();
        String npiNum = txtNPINum.getText();

        DoctorDirectory docDir = system.getDoctorDirectory();
        Doctor doc = null;
        if (system.getDoctorDirectory() == null) {
            doc = new Doctor(doctorName, npiNum);
            docDir.getDoctorList().add(doc);
            JOptionPane.showMessageDialog(null, "Doctor Entry added");
        } else {
            doc = system.getDoctorDirectory().createDoctor(doctorName, npiNum);
        }

    }//GEN-LAST:event_btnAddDoctorActionPerformed

    private void btnAddAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAmbulanceActionPerformed
        // TODO add your handling code here:
        String ambulanceNum = txtAmbNum.getText();
        
        AmbulanceServiceDirectory ambulanceDir = system.getAmbulanceServiceDirectory();
        AmbulanceService ambulance = null;
        
        if(system.getAmbulanceServiceDirectory() == null) {
            ambulance = new AmbulanceService(ambulanceNum);
            ambulanceDir.getAmbulanceList().add(ambulance);
            JOptionPane.showMessageDialog(null, "Doctor Entry added");

        }
        else {
            ambulance = system.getAmbulanceServiceDirectory().createAmbulance(ambulanceNum);
        }
    }//GEN-LAST:event_btnAddAmbulanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAmbulance;
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManage;
    private javax.swing.JLabel lblAddAmb;
    private javax.swing.JLabel lblAddEMT;
    private javax.swing.JLabel lblAdditionalDetails;
    private javax.swing.JLabel lblAmbNum;
    private javax.swing.JLabel lblDisplayPatientArea;
    private javax.swing.JLabel lblDisplayPatientName;
    private javax.swing.JLabel lblDisplayRequestId;
    private javax.swing.JLabel lblDisplayStatus;
    private javax.swing.JLabel lblEMTName;
    private javax.swing.JLabel lblNPINum;
    private javax.swing.JLabel lblPatientArea;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblRequestID;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAmbNum;
    private javax.swing.JTextField txtEMTName;
    private javax.swing.JTextField txtNPINum;
    // End of variables declaration//GEN-END:variables

   

    private void setData(String patientName, String area, String status, String reqID) {
        lblDisplayPatientName.setText(patientName);
        lblDisplayPatientArea.setText(area);
        lblDisplayStatus.setText(status);
        lblDisplayRequestId.setText(reqID);
    }
}
