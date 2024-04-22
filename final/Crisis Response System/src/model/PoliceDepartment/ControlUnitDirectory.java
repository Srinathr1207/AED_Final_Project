
package model.PoliceDepartment;

import java.util.ArrayList;


public class ControlUnitDirectory {
    private ArrayList<ControlUnit> controlUnit = new ArrayList<>();
    private ControlUnit cntrlunit;

    public ArrayList<ControlUnit> getControlUnit() {
        return controlUnit;
    }
    
    public void setControlUnit(ArrayList<ControlUnit> controlunit) {
        this.controlUnit = controlunit;
    }

    public ControlUnit getCntrlunit() {
        return cntrlunit;
    }

    public void setCntrlunit(ControlUnit cntrlunit) {
        this.cntrlunit = cntrlunit;
    }

    public ControlUnit createCUDirectory(String criticalControlUnitNum) {
        cntrlunit = new ControlUnit(criticalControlUnitNum);
        controlUnit.add(cntrlunit);
        return cntrlunit;
    }
}
