package org.DVitushkin.streamtasks.empoyeetasks;

import java.util.Comparator;

/**
 * Class that implement comparator by work experience of employee.
 */

public class EmployeeWorkExpComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int o1WorkExperience = o1.getWorkExperience();
        int o2SWorkExperience = o2.getWorkExperience();
        return Integer.compare(o1WorkExperience, o2SWorkExperience);
    }
}
