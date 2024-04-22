
package model.Role;

import UI.ShelterHome.ShelterAdminJPanel;
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;


public class ShelterHomeAdmin extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new ShelterAdminJPanel(userProcessContainer, account, business);
    } 
}
