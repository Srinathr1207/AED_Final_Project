
package model.Areas;
import java.util.ArrayList;


public class AreaDirectory {
    
    private ArrayList<Area> areasList = new ArrayList<>();
    private Area area;

    public AreaDirectory() {
    }

    public ArrayList<Area> getAreasList() {
        return areasList;
    }

    public void setAreasList(ArrayList<Area> areasList) {
        this.areasList = areasList;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    public Area createArea(String areaName, String areaZipCode) {
        area = new Area(areaName, areaZipCode);
        areasList.add(area);
        return area;
    }
    
}
