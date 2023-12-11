package org.DVitushkin.animalExample;

/**
 * Abstract (super) class Animal for show
 * how to use inheritance and polymorphism.
 */

abstract public class Animal {
    private final int age;

    protected Animal(int age) {
        this.age = age;
    }

    public abstract void makeSound();
}

