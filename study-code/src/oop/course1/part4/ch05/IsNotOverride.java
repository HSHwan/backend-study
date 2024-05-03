package oop.course1.part4.ch05;

import oop.course1.part4.poly.Animal;
import oop.course1.part4.poly.Cat;
import oop.course1.part4.poly.Dog;

public class IsNotOverride {

    public static void main(String[] args) {
        // 재정의를 하지 않았기 때문에 부모가 명령을 내리면(= 메시지를 보내면) 오동작을 한다
        // 다형성을 보장하지 않음 -> 그러면 다형성을 보장하려면? (재정의를 강제로 하도록 만들어 주면 된다)
        // 추상클래스, 인터페이스 사용 -> 다형성 보장
        Animal animal = new Dog();
        animal.eat(); // ? -> 개처럼

        animal = new Cat();
        animal.eat(); // ? -> 고양이처럼
    }
}
