package org.DVitushkin.animalExample;

/**
 * Main class of task to show to work inheritance and polymorphism.
 */

import java.util.ArrayList;

public class Demonstrator {
    public static void main(String[] args) {
        Cat kitty = new Cat(3, "British Shorthair");
        Dog bim = new Dog(10, true);
        Lion alex = new Lion(3, 50);

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(kitty);
        animals.add(bim);
        animals.add(alex);

        for (Animal animal :animals) {
            animal.makeSound();
        }
    }
}
