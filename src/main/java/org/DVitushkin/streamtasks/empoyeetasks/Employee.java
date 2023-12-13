package org.DVitushkin.streamtasks.empoyeetasks;

/**
 * Class describe employees.
 */

public class Employee {
    private final String name;
    private int age;
    private int salary;
    private int workExperience;


    public Employee(String name, int age, int salary, int workExperience) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getWorkExperience() {
        return this.workExperience;
    }

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
