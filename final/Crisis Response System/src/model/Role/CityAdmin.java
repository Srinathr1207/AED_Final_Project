
package model.Role;

import UI.AreaAdmin.AreaJPanel;
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;


public class CityAdmin extends Role{
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AreaJPanel(userProcessContainer, account, business);
    } 
}
