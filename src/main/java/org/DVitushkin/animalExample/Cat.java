package org.DVitushkin.animalExample;

/**
 * Implementation of Cat animal that have characteristic like breed.
 */

public class Cat extends Animal {
    private final String breed;

    public Cat(int age, String breed) {
        super(age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("MEOW!");
    }

    public String getBreed() {
        return this.breed;
    }
}
