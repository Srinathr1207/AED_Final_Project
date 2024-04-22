
package model.Hospital;

import java.util.ArrayList;


public class AmbulanceServiceDirectory {
    private ArrayList<AmbulanceService> ambulanceList = new ArrayList<>();
    private AmbulanceService ambulance;

    public ArrayList<AmbulanceService> getAmbulanceList() {
        return ambulanceList;
    }

    public void setAmbulanceList(ArrayList<AmbulanceService> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }
    
    public AmbulanceService getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(AmbulanceService ambulance) {
        this.ambulance = ambulance;
    }
   
    public AmbulanceService createAmbulance(String ambulanceNumber) {
        ambulance = new AmbulanceService(ambulanceNumber);
        ambulanceList.add(ambulance);
        return ambulance;
    }
    
}
