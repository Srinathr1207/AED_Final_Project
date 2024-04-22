
package model.Role;

import UI.PoliceDepartment.PoliceDeptWorkAreaJPanel;
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;


public class PoliceDepartmentAdmin extends Role {
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new PoliceDeptWorkAreaJPanel(userProcessContainer, account, business);
    } 
}
