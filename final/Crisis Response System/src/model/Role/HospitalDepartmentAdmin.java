
package model.Role;

import UI.HospitalDepartment.HospitalRequestManagementJPanel;
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;


public class HospitalDepartmentAdmin extends Role {
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new HospitalRequestManagementJPanel(userProcessContainer, account, business);
    }  
}
