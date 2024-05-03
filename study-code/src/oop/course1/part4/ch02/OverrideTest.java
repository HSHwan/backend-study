package java.course1.part4.ch02;

import java.course1.part4.model.*;

public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting : Dog -> Animal
        Animal animal = new Dog();
        animal.eat(); // Animal ---(동적 바인딩)--> Dog

        animal = new Cat();
        animal.eat(); // Animal ---(동적 바인딩)--> Cat

    }
}
