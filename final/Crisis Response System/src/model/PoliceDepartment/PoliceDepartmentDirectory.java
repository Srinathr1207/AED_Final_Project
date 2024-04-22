
package model.PoliceDepartment;

import java.util.ArrayList;
import java.util.List;


public class PoliceDepartmentDirectory {
    
    private ArrayList<PoliceDepartment> policeDepartment = new ArrayList<>();
    private PoliceDepartment policeDept;

    public PoliceDepartmentDirectory() {
    }

    public ArrayList<PoliceDepartment> getPoliceDepartment() {
        return policeDepartment;
    }

    public void setPoliceDepartment(ArrayList<PoliceDepartment> policeDepartment) {
        this.policeDepartment = policeDepartment;
    }

  
    public PoliceDepartment createPoliceDeptartment(String name, String uname, String address, Boolean status) {
        policeDept = new PoliceDepartment(name, uname, address, status);
        policeDepartment.add(policeDept);
        return policeDept;
    }
    
    public void updatePoliceDepartment(String name, String uname,String address, Boolean status) {
        policeDept.setFullName(name);
        policeDept.setUserName(uname);   
        policeDept.setAddress(address);
        policeDept.setAvailability(status);
    }

    public void deleteDeptartment(String uname) {
        System.out.println("size insed del:::" + policeDepartment.size());
        PoliceDepartment currentDeptartment = null;
        for (PoliceDepartment p : policeDepartment) {
            System.out.println("totiong" + p.toString());
            if (p.getFullName().equals(uname)) {
                currentDeptartment = p;
                break;
            }
        }
        policeDepartment.remove(currentDeptartment);
    }
}
