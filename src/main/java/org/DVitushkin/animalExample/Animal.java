package org.DVitushkin.animalExample;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Abstract (super) class Animal for show
 * how to use inheritance and polymorphism.
 */
@Getter
@AllArgsConstructor
abstract public class Animal {
    private final int age;

    public abstract void makeSound();
}

