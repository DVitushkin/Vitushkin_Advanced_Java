package org.DVitushkin.streamtasks.empoyeetasks;

import java.util.Comparator;

/**
 * Class that implement comparator by age of employee.
 */

public class EmployeeAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int o1Age = o1.getAge();
        int o2SAge = o2.getAge();
        return Integer.compare(o1Age, o2SAge);
    }
}
