package part4.ch01;

import part4.model.Animal;
import part4.model.Cat;
import part4.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog 객체를 사용해보자
//        Dog dog = new Dog();
//        dog.eat();
        // Upcasting(업캐스팅)
        // 부모가 자식을 가리킨다
        Animal animal = new Dog();
        animal.eat(); // 동물처럼 먹다 -> 개처럼 먹다

        animal = new Cat();
        animal.eat(); // 동물처럼 먹다 -> 고양이처럼 먹다
    }
}
