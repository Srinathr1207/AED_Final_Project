
package model.Role;

import UI.SystemAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;


public class AdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, account, business);
    }

}
