
package model.WorkRequest;

import java.util.ArrayList;


public class WorkRequestDirectory {
    
    private ArrayList<WorkRequest> workRequestsList;

    public WorkRequestDirectory() {
        workRequestsList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestsList;
    }
}
