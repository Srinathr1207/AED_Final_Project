
package UI.HospitalDepartment;

import model.EcoSystem;
import model.Hospital.AmbulanceService;
import model.Hospital.Doctor;
import model.Hospital.Hospital;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class HospitalManagementJpanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    
    public HospitalManagementJpanel(JPanel userProcessContainer, UserAccount account,EcoSystem system, String patientName, String area, String status, String reqID, String docName, String npiNum, String ambNum) {
        initComponents();
        
        this.account=account;
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        
        cmbSelectAmbNum.setVisible(false);
        cmbSelectEMT.setVisible(false);
        lblSelectAmbNum.setVisible(false);
        lblSelectEMT.setVisible(false);
        btnConfirm.setVisible(false);
        getDoctorList();
        getAmbulance();
        
        setData(patientName, area, status, reqID, docName, npiNum, ambNum);
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
        btnBack = new javax.swing.JButton();
        cmbSelectAmbNum = new javax.swing.JComboBox<>();
        cmbSelectEMT = new javax.swing.JComboBox<>();
        btnCheck = new javax.swing.JButton();
        lblProceed = new javax.swing.JLabel();
        lblSelectAmbNum = new javax.swing.JLabel();
        lblSelectEMT = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        lblDisplayPatientName = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblDisplayPatientArea = new javax.swing.JLabel();
        lblDisplayStatus = new javax.swing.JLabel();
        lblPatientArea = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDisplayRequestId = new javax.swing.JLabel();
        lblRequestId = new javax.swing.JLabel();
        lblEMTName = new javax.swing.JLabel();
        lblAmbNum = new javax.swing.JLabel();
        lblNPINum = new javax.swing.JLabel();
        lblDisplayEMTName = new javax.swing.JLabel();
        lblDisplayAmbNum = new javax.swing.JLabel();
        lblDisplayNPINum = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Assign Ambulance and Doctor");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 20, 900, -1));

        btnBack.setBackground(new java.awt.Color(153, 255, 102));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        cmbSelectAmbNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectAmbNumActionPerformed(evt);
            }
        });
        add(cmbSelectAmbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 180, -1));

        cmbSelectEMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectEMTActionPerformed(evt);
            }
        });
        add(cmbSelectEMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 190, -1));

        btnCheck.setBackground(new java.awt.Color(153, 255, 102));
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, 30));

        lblProceed.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblProceed.setText("Click here to proceed :");
        add(lblProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        lblSelectAmbNum.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSelectAmbNum.setText("Select Ambulance Number :");
        add(lblSelectAmbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        lblSelectEMT.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSelectEMT.setText("Select Emergency Medical Technician : ");
        add(lblSelectEMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        btnConfirm.setBackground(new java.awt.Color(0, 255, 255));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 90, 30));

        lblDisplayPatientName.setText("jLabel6");
        add(lblDisplayPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        lblPatientName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPatientName.setText("Patient Name :");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, -1));

        lblDisplayPatientArea.setText("jLabel8");
        add(lblDisplayPatientArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        lblDisplayStatus.setText("jLabel8");
        add(lblDisplayStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        lblPatientArea.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPatientArea.setText("Patient Area :");
        add(lblPatientArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        lblStatus.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblStatus.setText("Status :");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 100, -1));

        lblDisplayRequestId.setText("jLabel8");
        add(lblDisplayRequestId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        lblRequestId.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblRequestId.setText("Request ID :");
        add(lblRequestId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        lblEMTName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblEMTName.setText("EMT Technician Name:");
        add(lblEMTName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        lblAmbNum.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAmbNum.setText("Ambulance number:");
        add(lblAmbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        lblNPINum.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblNPINum.setText("NPI Number:");
        add(lblNPINum, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        lblDisplayEMTName.setText("jLabel13");
        add(lblDisplayEMTName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        lblDisplayAmbNum.setText("jLabel14");
        add(lblDisplayAmbNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        lblDisplayNPINum.setText("jLabel15");
        add(lblDisplayNPINum, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        lblSelectAmbNum.setVisible(true);
        lblSelectEMT.setVisible(true);
        cmbSelectAmbNum.setVisible(true);
        cmbSelectEMT.setVisible(true);
        
    }//GEN-LAST:event_btnCheckActionPerformed

    private void cmbSelectEMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectEMTActionPerformed
        // TODO add your handling code here:
        
        btnConfirm.setVisible(true);
    }//GEN-LAST:event_cmbSelectEMTActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String patientName = lblDisplayPatientName.getText();
        String area = lblDisplayPatientArea.getText();
        String status = lblDisplayStatus.getText();
        String reqID = lblDisplayRequestId.getText();
        String docName = lblDisplayEMTName.getText();
        String npiNum = lblDisplayNPINum.getText();
        String ambNum = lblDisplayAmbNum.getText();

        PatientManagementJPanel managePatient=new PatientManagementJPanel(userProcessContainer,account, system, patientName, area, status, reqID, docName, npiNum, ambNum);
        userProcessContainer.add("Manage Patient",managePatient);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void cmbSelectAmbNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectAmbNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectAmbNumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cmbSelectAmbNum;
    private javax.swing.JComboBox<String> cmbSelectEMT;
    private javax.swing.JLabel lblAmbNum;
    private javax.swing.JLabel lblDisplayAmbNum;
    private javax.swing.JLabel lblDisplayEMTName;
    private javax.swing.JLabel lblDisplayNPINum;
    private javax.swing.JLabel lblDisplayPatientArea;
    private javax.swing.JLabel lblDisplayPatientName;
    private javax.swing.JLabel lblDisplayRequestId;
    private javax.swing.JLabel lblDisplayStatus;
    private javax.swing.JLabel lblEMTName;
    private javax.swing.JLabel lblNPINum;
    private javax.swing.JLabel lblPatientArea;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblProceed;
    private javax.swing.JLabel lblRequestId;
    private javax.swing.JLabel lblSelectAmbNum;
    private javax.swing.JLabel lblSelectEMT;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private void getDoctorList() {
        for (Doctor a : system.getDoctorDirectory().getDoctorList()) {
            cmbSelectEMT.addItem(a.getDoctor_FullName() + " " + a.getNpi_Code());
    }
    }

    private void getAmbulance() {
        for (AmbulanceService b : system.getAmbulanceServiceDirectory().getAmbulanceList()) {
            cmbSelectAmbNum.addItem(b.getAmbulanceNumber());
    }    }

    private void setData(String patientName, String area, String status, String reqID, String docName, String npiNum, String ambNum) {
        lblDisplayPatientName.setText(patientName);
        lblDisplayPatientArea.setText(area);
        lblDisplayStatus.setText(status);    
        lblDisplayRequestId.setText(reqID);
        lblDisplayEMTName.setText(docName);
        lblDisplayAmbNum.setText(npiNum);
        lblDisplayNPINum.setText(ambNum);
    }
    
}
