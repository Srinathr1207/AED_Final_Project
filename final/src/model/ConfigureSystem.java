package model;

import model.UserAccount.UserAccount;
import model.Role.SystemAdmin;

/**
 *
 * @author Jay
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();       
        UserAccount ua = ecosystem.getUserAccountDirectory().addUserAccount("admin" ,"admin", "super@123",null,null, new SystemAdmin());
        
        return ecosystem;
    }
    
}
