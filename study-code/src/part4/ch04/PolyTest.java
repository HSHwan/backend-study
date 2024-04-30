package part4.ch04;

import part4.model.Animal;
import part4.model.Cat;
import part4.model.Dog;

public class PolyTest {

    public static void main(String[] args) {
        // Upcasting으로 객체 생성
        // 상속관계, 재정의(Override), 동적 바인딩
        // 다형성(message polymorphism)
        // 상위 클래스가 동일한 메시지로 하위 클래스를
        // 서로 다르게 동작시키는 객체지향 원리
        Animal animal = new Dog();
        animal.eat(); // 실행 시점에서 사용될(호출될) 메서드가 결정되는 바인딩 (=동적 바인딩)

        animal = new Cat();
        animal.eat();
        // Downcasting
        ((Cat) animal).night();
    }
}
