
package model.Role;

import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.EcoSystem;
import UI.SystemAdmin.SystemAdminWorkAreaJPanel;


public class SystemAdmin extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
