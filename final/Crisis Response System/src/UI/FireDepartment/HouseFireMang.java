
package UI.FireDepartment;

import model.EcoSystem;
import model.Requests.Request;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class HouseFireMang extends javax.swing.JPanel {

    /**
     * Creates new form HouseFireMang
     */
    private JPanel userProcessContainer;

    private UserAccount account;
   
    EcoSystem system;
    public HouseFireMang(JPanel userProcessContainer, UserAccount account,EcoSystem system, String funit, String reqID) {
        initComponents();
        this.account=account;
    this.userProcessContainer = userProcessContainer;
    this.system=system;
    txtRDU.setEditable(false);
    txtRDU.setText(funit);
    lblReqId.setText(reqID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRDU = new javax.swing.JTextField();
        lblReqId = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("House Fire Management Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 900, -1));

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Fire Unit Dispatched is :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));
        add(txtRDU, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 160, -1));

        lblReqId.setText("jLabel9");
        add(lblReqId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        btnComplete.setBackground(new java.awt.Color(255, 51, 51));
        btnComplete.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        System.out.println("reqID" + lblReqId.getText());
        for (Request j : system.getRequestDirectory().getRequests()) {
            if (j.getRequestId() == lblReqId.getText()) {

                j.setStatus("Completed");
                j.setEntityDesc("RFU " + txtRDU.getText());
                JOptionPane.showMessageDialog(null, "Unit has been dispatched");
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblReqId;
    private javax.swing.JTextField txtRDU;
    // End of variables declaration//GEN-END:variables
}
