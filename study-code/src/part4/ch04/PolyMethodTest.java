package part4.ch04;

import part4.model.Animal;
import part4.model.Cat;
import part4.model.Dog;

public class PolyMethodTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        display(dog);
        Cat cat = new Cat();
        display(cat);
    }

    // Overloading
    /*private static void display(Dog dog) {
        dog.eat();
    }

    private static void display(Cat cat) {
        cat.eat();
    }*/

    // Overriding
    private static void display(Animal animal) { // 다형성 인수
        animal.eat();
        // Cat 타입으로 받은 경우에만 실행 -> if
        if (animal instanceof Cat) {
            ((Cat) animal).night();
        }
        // ((Cat) animal).night();
    }
}
