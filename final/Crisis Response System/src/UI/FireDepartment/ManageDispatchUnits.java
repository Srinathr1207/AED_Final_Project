
package UI.FireDepartment;

import model.EcoSystem;
import model.FireDepartment.FactoryFireDispatchUnit;
import model.FireDepartment.HousingFireDispatchUnit;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ManageDispatchUnits extends javax.swing.JPanel {

    /**
     * Creates new form ManageDispatchUnits
     */
    private JPanel userProcessContainer;

    private UserAccount account;
   
    EcoSystem system;
    public ManageDispatchUnits(JPanel userProcessContainer, UserAccount account,EcoSystem system, String reqID) {
    initComponents();
    this.account=account;
    this.userProcessContainer = userProcessContainer;
    this.system=system;
    
    getFactoryFireUnits();
    getHouseFireUnits();
    lblRequestId.setText(reqID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelectUnit = new javax.swing.JLabel();
        cmbHD = new javax.swing.JComboBox<>();
        btnFD = new javax.swing.JButton();
        lblHead1 = new javax.swing.JLabel();
        lblSelectUnit1 = new javax.swing.JLabel();
        cmbFD = new javax.swing.JComboBox<>();
        btnHD = new javax.swing.JButton();
        lblHead2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblRequestId = new javax.swing.JLabel();
        lblRequestN = new javax.swing.JLabel();
        lblSelectUnit2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSelectUnit.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        lblSelectUnit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectUnit.setText("Manage Dispatch Units");
        add(lblSelectUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 900, 30));

        cmbHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHDActionPerformed(evt);
            }
        });
        add(cmbHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 240, -1));

        btnFD.setBackground(new java.awt.Color(255, 51, 51));
        btnFD.setText("Send");
        btnFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFDActionPerformed(evt);
            }
        });
        add(btnFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 80, 30));

        lblHead1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHead1.setText("Factory Dispatch Unit");
        add(lblHead1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 220, -1));

        lblSelectUnit1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSelectUnit1.setText("Select the Unit: ");
        add(lblSelectUnit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, 20));

        add(cmbFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 230, -1));

        btnHD.setBackground(new java.awt.Color(255, 51, 51));
        btnHD.setText("Send");
        btnHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHDActionPerformed(evt);
            }
        });
        add(btnHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 80, 30));

        lblHead2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHead2.setText("Housing Dispatch Unit");
        add(lblHead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 230, -1));

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 30));

        lblRequestId.setText("jLabel9");
        add(lblRequestId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        lblRequestN.setText("Request No.");
        add(lblRequestN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblSelectUnit2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSelectUnit2.setText("Select the Unit:");
        add(lblSelectUnit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFDActionPerformed
        // TODO add your handling code here:
        String funit = cmbFD.getSelectedItem().toString();
          JOptionPane.showMessageDialog(null, "Please confirm the processes on next step");
        FactoryFireMang manageIndustrialFire=new FactoryFireMang(userProcessContainer,account, system,funit, lblRequestId.getText());
        userProcessContainer.add("Manage Industrial Fire",manageIndustrialFire);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnFDActionPerformed

    private void btnHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHDActionPerformed
        // TODO add your handling code here:
        String funit = cmbHD.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, "Please confirm the processes on next step");
        HouseFireMang manageResidentialFire=new HouseFireMang(userProcessContainer,account, system,funit, lblRequestId.getText());
        userProcessContainer.add("Manage Industrial Fire",manageResidentialFire);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnHDActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHDActionPerformed
    
//    private void getDoctors() {
//        for (Doctor a : system.getDoctorDirectory().getDoctors()) {
//            doctorComboBox.addItem(a.getDoctorName() + " " + a.getNpiCode());
//    }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFD;
    private javax.swing.JButton btnHD;
    private javax.swing.JComboBox<String> cmbFD;
    private javax.swing.JComboBox<String> cmbHD;
    private javax.swing.JLabel lblHead1;
    private javax.swing.JLabel lblHead2;
    private javax.swing.JLabel lblRequestId;
    private javax.swing.JLabel lblRequestN;
    private javax.swing.JLabel lblSelectUnit;
    private javax.swing.JLabel lblSelectUnit1;
    private javax.swing.JLabel lblSelectUnit2;
    // End of variables declaration//GEN-END:variables

    private void getFactoryFireUnits() {
        for (FactoryFireDispatchUnit c : system.getFactoryFireDispatchUnitDirectory().getFactoryFireDispatchUnits()) {
            cmbFD.addItem(c.getFactoryFireUnit());
        }
    }

    private void getHouseFireUnits() {
        for (HousingFireDispatchUnit d : system.getFireDispatchUnitDirectory().getHousingFireDispatchUnits()) {
            cmbHD.addItem(d.getHouseFireUnit());
        }
    }
}
