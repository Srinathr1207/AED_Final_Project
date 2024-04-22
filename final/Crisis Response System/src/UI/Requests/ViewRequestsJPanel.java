
package UI.Requests;

import model.EcoSystem;
import model.Hospital.Hospital;
import model.Requests.Request;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;


public class ViewRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestsJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecoSystem;

    public ViewRequestsJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        reqTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        updateReq = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reqTable.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        reqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Name", "Location", "Area", "Type Of Emergency", "Comments", "Date", "Hospital", "FD", "PD", "Shelter", "Status"
            }
        ));
        reqTable.setRowHeight(60);
        jScrollPane3.setViewportView(reqTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 850, 218));

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        updateReq.setBackground(new java.awt.Color(0, 153, 153));
        updateReq.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        updateReq.setText("Update Request");
        updateReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateReqActionPerformed(evt);
            }
        });
        add(updateReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 30));

        deleteButton.setBackground(new java.awt.Color(0, 153, 153));
        deleteButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteButton.setText("Delete Request");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View All Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = reqTable.getSelectedRow();
        if (selectedRow >= 0) {
            String reqId = (String) reqTable.getValueAt(selectedRow, 0);

            int selectionButton = JOptionPane.YES_NO_OPTION;
            String warningMessage = "Are you sure you want to delete the user [Request] - " + reqId.toUpperCase() + " ?";
            int selectionResult = JOptionPane.showConfirmDialog(null, warningMessage, "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                ecoSystem.getRequestDirectory().deleteRequest(reqId);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateRequestTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateReqActionPerformed
        // TODO add your handling code here:
        int selectRow = reqTable.getSelectedRow();
        if (selectRow >= 0) {
            String reqId = (String) reqTable.getValueAt(selectRow, 0);
            String personName = (String) reqTable.getValueAt(selectRow, 1);
            String location = (String) reqTable.getValueAt(selectRow, 2);
            String area = (String) reqTable.getValueAt(selectRow, 3);
            String typeOfEmergency = (String) reqTable.getValueAt(selectRow, 4);
            String comments = (String) reqTable.getValueAt(selectRow, 5);
            String dateTimeStamp = (String) reqTable.getValueAt(selectRow, 6);
            String hosp = (String) reqTable.getValueAt(selectRow, 7);
            String fireDept = (String) reqTable.getValueAt(selectRow, 8);
            String policeDept = (String) reqTable.getValueAt(selectRow, 9);
            String shelter = (String) reqTable.getValueAt(selectRow, 10);
            String status = (String) reqTable.getValueAt(selectRow, 11);

            UpdateRequestJPanel updateReq1 = new UpdateRequestJPanel(userProcessContainer, ecoSystem, reqId, personName, location, area, typeOfEmergency, comments, dateTimeStamp, hosp, fireDept, policeDept, shelter, status);
            userProcessContainer.add("updateReq1", updateReq1);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }

    }//GEN-LAST:event_updateReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable reqTable;
    private javax.swing.JButton updateReq;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) reqTable.getModel();
        JTableHeader th = reqTable.getTableHeader();
        th.setFont(new Font("Serif", Font.BOLD, 15));
        model.setRowCount(0);

        TableColumnModel columnModel = reqTable.getColumnModel();
        columnModel.getColumn(0).setWidth(200);

        for (Request req : ecoSystem.getRequestDirectory().getRequests()) {
            Object[] row = new Object[13];
            row[0] = req.getRequestId();
            row[1] = req.getPersonName();
            row[2] = req.getPersonLocation();
            row[3] = req.getArea();
            row[4] = req.getTypeOfEmergency();
            row[5] = req.getComments();
            row[6] = req.getDate();
            row[7] = req.getSelectedHospital();
            row[8] = req.getSelectedFireDept();
            row[9] = req.getSelectedPoliceDept();
            row[10] = req.getSelectedShelter();
            row[11] = req.getStatus();

            model.addRow(row);

        }
    }
}