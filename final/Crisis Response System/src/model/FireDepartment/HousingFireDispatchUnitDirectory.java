
package model.FireDepartment;

import java.util.ArrayList;


public class HousingFireDispatchUnitDirectory {
        private ArrayList<HousingFireDispatchUnit> HousingFireDispatchUnits = new ArrayList<>();
        private HousingFireDispatchUnit HousingFireDispatchUnit;

    public ArrayList<HousingFireDispatchUnit> getHousingFireDispatchUnits() {
        return HousingFireDispatchUnits;
    }

    public void setHousingFireDispatchUnits(ArrayList<HousingFireDispatchUnit> HousingFireDispatchUnits) {
        this.HousingFireDispatchUnits = HousingFireDispatchUnits;
    }

    public HousingFireDispatchUnit getHousingFireDispatchUnit() {
        return HousingFireDispatchUnit;
    }

    public void setHousingFireDispatchUnit(HousingFireDispatchUnit HousingFireDispatchUnit) {
        this.HousingFireDispatchUnit = HousingFireDispatchUnit;
    }
        
    public HousingFireDispatchUnit createResidentialFireDispatchUnit(String housingFireUnit) {
        HousingFireDispatchUnit = new HousingFireDispatchUnit(housingFireUnit);
                HousingFireDispatchUnits.add(HousingFireDispatchUnit);
                return HousingFireDispatchUnit;
    }   
        
        
        

}
