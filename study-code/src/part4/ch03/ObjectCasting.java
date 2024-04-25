package part4.ch03;

import part4.model.*;

public class ObjectCasting {

    public static void main(String[] args) {
        // Animal --> Dog, Cat
        Animal animal = new Dog();
        animal.eat();

        animal = new Cat();
        animal.eat();
    }
}
