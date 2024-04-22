
package model.UserAdmin;

import java.util.ArrayList;
import model.Requests.Request;


public class Admin {
    private String fullName;
    private String userName;
    private String address;
    
    private ArrayList<Request> requests = new ArrayList<>();
    
    public Admin() {
    }

    public Admin(String fullName, String uname, String address) {
        this.fullName = fullName;
        this.userName = uname;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
    
    @Override
    public String toString() {
        return userName;
    }
}
