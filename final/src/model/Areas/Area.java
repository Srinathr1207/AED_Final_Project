
package model.Areas;

    public class Area {
    private String areaName;
    private String areaZipCode;

    public Area(String areaName, String areaZipCode) {
        this.areaName = areaName;
        this.areaZipCode = areaZipCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaZipCode() {
        return areaZipCode;
    }

    public void setAreaZipCode(String areaZipCode) {
        this.areaZipCode = areaZipCode;
    }
    
    
    
}


