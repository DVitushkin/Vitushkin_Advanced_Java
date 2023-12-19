package org.DVitushkin.animalExample;

import lombok.Builder;
import lombok.Getter;

/**
 * Implementation of Dog animal that show who is good boy.
 */
@Getter
public class Dog extends Animal {
    private final boolean goodBoy;

    @Builder
    public Dog(int age, boolean goodBoy) {
        super(age);
        this.goodBoy = goodBoy;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
