package course1.part4.ch04;

import course1.part4.model.Animal;
import course1.part4.model.Cat;
import course1.part4.model.Dog;

public class PolyArrayTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Dog, Cat을 저장할 배열을 생성하시오.
        // 다형성 배열
        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;

        display(animals);
    }

    private static void display(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
            if (animal instanceof Cat) {
                ((Cat) animal).night();
            }
        }
    }
}
