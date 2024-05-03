package java.course1.part4.ch05;

import java.course1.part4.poly.Animal;
import java.course1.part4.poly.Cat;
import java.course1.part4.poly.Dog;

public class AbstractClassTest {

    public static void main(String[] args) {
        // 추상클래스는 단독으로 객체를 생성할 수 없다
//        Animal animal = new Animal(); // cannot be instantiated(객체 생성 불가능)
        // 추상클래스는 부모의 역할은 할 수 있다
        Animal animal = new Dog();
        animal.eat(); // 개처럼 먹다
        animal.move();

        animal = new Cat();
        animal.eat(); // 고양이처럼 먹다
        animal.move();
        ((Cat) animal).night();
    }
}
