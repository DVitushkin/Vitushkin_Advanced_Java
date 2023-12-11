package org.DVitushkin.animalExample;

/**
 * Implementation of Lion animal that store size of lion`s mane.
 */

public class Lion extends Animal {
    private final int maneSize;

    public Lion(int age, int maneSize) {
        super(age);
        this.maneSize = maneSize;
    }

    @Override
    public void makeSound() {
        System.out.println("ROOOARRR!");
    }

    public int getManeSize() {
        return this.maneSize;
    }
}
