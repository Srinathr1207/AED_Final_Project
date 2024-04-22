
package model.Role;

import UI.Requests.CreateRequest;
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;


public class UserRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new CreateRequest(userProcessContainer,account, system);
    }
    
}
