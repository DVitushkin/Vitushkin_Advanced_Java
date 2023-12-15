package org.DVitushkin.animalExample;

/**
 * Main class of task to show to work inheritance and polymorphism.
 */

import java.util.ArrayList;
import java.util.List;

public class Demonstrator {
    public static void main(String[] args) {
        Animal kitty = Cat.builder()
                .age(3)
                .breed("cat breed")
                .build();
        Animal bim = Dog.builder()
                .age(10)
                .goodBoy(true)
                .build();
        Animal alex = Lion.builder()
                .age(15)
                .maneSize(50)
                .build();

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(kitty);
        animals.add(bim);
        animals.add(alex);

        for (Animal animal :animals) {
            animal.makeSound();
        }
    }
}
