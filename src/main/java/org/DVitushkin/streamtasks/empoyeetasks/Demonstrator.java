package org.DVitushkin.streamtasks.empoyeetasks;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Main class of task about comparing Employees objects.
 */

public class Demonstrator {
    static Collection<Employee> employees = List.of(new Employee("Bob", 22, 45000, 2),
                                                    new Employee("Alice", 28, 90000, 7),
                                                    new Employee("Bar", 54, 300000, 30));

    private static void printEmployeeCollection() {
        employees.forEach(employee -> System.out.println(employee.toString()));
    }

    private static Collection<Employee> getSalaryMoreThan(int mark) {
        return employees
                .stream()
                .filter(employee -> employee.getSalary() > mark)
                .toList();
    }

    private static void printMaxSalary() {
        EmployeeSalaryComparator salaryComparator = new EmployeeSalaryComparator();

        employees
                .stream()
                .max(salaryComparator)
                .ifPresent((empl) -> System.out.printf("Max salary is: <%d>\n", empl.getSalary()));
    }

    private static void printAverageSalary() {
        employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .ifPresent((avgSal) -> System.out.printf("Average salary is: <%.3f>\n", avgSal));
    }

    private static void printSalarySum() {
        int sumOfSalary = employees.stream().map(Employee::getSalary).reduce(0, Integer::sum);
        System.out.printf("Sum of all salary is: <%d>\n", sumOfSalary);
    }

    private static Map<String, Employee> groupEmployeeByName() {
        return employees
                .stream()
                .collect(Collectors.toMap(Employee::getName, e -> (Employee) employees));
    }

    public static void main(String[] args){
        printEmployeeCollection();

        getSalaryMoreThan(100000).forEach(employee -> System.out.printf("<%s> has salary more than 100k;\n",
                                                                                employee.getName()));

        printMaxSalary();

        groupEmployeeByName().forEach((k,v) -> System.out.println(k + ": " + v.toString()));

        printAverageSalary();

        printSalarySum();
    }
}
