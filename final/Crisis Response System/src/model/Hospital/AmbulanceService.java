
package model.Hospital;


public class AmbulanceService {
    String ambulanceNumber;

    public String getAmbulanceNumber() {
        return ambulanceNumber;
    }

    public void setAmbulanceNumber(String ambulanceNumber) {
        this.ambulanceNumber = ambulanceNumber;
    }
    

  
    public AmbulanceService(String ambulanceNumber) {
        this.ambulanceNumber = ambulanceNumber;
    }
    
    
}
