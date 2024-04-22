
package model.Role;

import UI.FireDepartment.FireLandingJPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;




public class FireDepartmentAdmin extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new FireLandingJPanel(userProcessContainer, account, business);
    }
    
}
