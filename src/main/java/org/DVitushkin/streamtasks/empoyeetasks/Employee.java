package org.DVitushkin.streamtasks.empoyeetasks;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class describe employees.
 */

@Data
@AllArgsConstructor
public class Employee {
    private final String name;
    private int age;
    private int salary;
    private int workExperience;

    @Override
    public String toString() {
        return String.format("[Employee] name: %s; " +
                        "salary: %d$; " +
                        "age: %d years; " +
                        "work experience: %d years\n",
                        this.getName(),
                        this.getSalary(),
                        this.getAge(),
                        this.getWorkExperience());
    }
}
