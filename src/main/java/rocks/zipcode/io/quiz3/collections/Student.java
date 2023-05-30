package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        if (labs != null) {
            for (int i = 0; i < labs.size(); i++) {
                if (labs.get(i).getName().equals(labName)) {
                    return labs.get(i);
                }
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (getLab(labName) == null) {
            throw new UnsupportedOperationException();
        }
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

}
