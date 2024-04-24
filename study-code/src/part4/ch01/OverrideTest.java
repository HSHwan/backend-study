package part4.ch01;

import part4.model.*;

public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting : Dog -> Animal
        Animal animal = new Dog();
        animal.eat(); // Animal ---(동적 바인딩)--> Dog

        animal = new Cat();
        animal.eat(); // Animal ---(동적 바인딩)--> Cat

    }
}
