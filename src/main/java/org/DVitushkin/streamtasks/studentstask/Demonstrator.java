package org.DVitushkin.streamtasks.studentstask;

import java.util.Collection;
import java.util.List;

/**
 * Main class of task about work with Students collection by stream.
 */

public class Demonstrator {
    public static void main(String[] args){
        Collection<Student> students = List.of(new Student("Вася", 16, Sex.MAN),
                new Student("Петя", 23, Sex.MAN),
                new Student("Елена", 42, Sex.WOMEN),
                new Student("Иван Иванович", 69, Sex.MAN));

        students
                .stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27 && student.getSex() == Sex.MAN)
                .forEach(student -> System.out.printf("<%s> got povestochka\n", student.getName()));


        students
                .stream()
                .filter(student -> (student.getAge() >= 18)
                                    && ((student.getAge()  <= 55 && student.getSex() == Sex.WOMEN)
                                    || (student.getAge()  <= 60 && student.getSex() == Sex.MAN)))
                .forEach(student -> System.out.printf("<%s> is rabotyaga\n", student.getName()));
    }





}
