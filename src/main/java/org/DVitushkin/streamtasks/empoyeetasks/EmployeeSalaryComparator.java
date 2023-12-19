package org.DVitushkin.streamtasks.empoyeetasks;

import java.util.Comparator;

/**
 * Class that implement comparator by salary of employee.
 */

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int o1Salary = o1.getSalary();
        int o2Salary = o2.getSalary();
        return Integer.compare(o1Salary, o2Salary);
    }
}
