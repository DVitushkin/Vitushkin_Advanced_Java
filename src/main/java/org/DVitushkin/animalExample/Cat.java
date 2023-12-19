package org.DVitushkin.animalExample;

import lombok.Builder;
import lombok.Getter;

/**
 * Implementation of Cat animal that have characteristic like breed.
 */

@Getter
public class Cat extends Animal {
    private final String breed;

    @Builder
    public Cat(int age, String breed) {
        super(age);
        this.breed = breed;
    }
    @Override
    public void makeSound() {
        System.out.println("MEOW!");
    }
}
