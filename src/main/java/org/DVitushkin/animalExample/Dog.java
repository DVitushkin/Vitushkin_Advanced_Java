package org.DVitushkin.animalExample;

/**
 * Implementation of Dog animal that show who is good boy.
 */

public class Dog extends Animal {
    private final boolean goodBoy;

    public Dog(int age, boolean goodBoy) {
        super(age);
        this.goodBoy = goodBoy;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    public boolean isGoodBoy() {
        return this.goodBoy;
    }
}
