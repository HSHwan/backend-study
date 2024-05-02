package part4.ch06;

import part4.poly.A;

public class ObjectTest {

    public static void main(String[] args) {
        // A 객체를 Upcasting으로 생성하세요
        A a = new A();
        a.display();
        Object object = new A(); // Upcasting
        ((A) object).display(); // Downcasting
    }
}
