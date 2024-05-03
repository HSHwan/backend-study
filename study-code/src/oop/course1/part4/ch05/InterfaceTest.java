package oop.course1.part4.ch05;

import oop.course1.part4.poly.Radio;
import oop.course1.part4.poly.RemoCon;
import oop.course1.part4.poly.TV;

public class InterfaceTest {

    public static void main(String[] args) {
        // 리모컨으로 Radio와 TV를 동작시켜보자
        // 다형성이 보장된다
        // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬 수가 있다
        // RemoCon remoCon = new RemoCon(); 객체 생성 불가
        // 부모의 역할을 할 수 있다
        RemoCon remoCon = new Radio();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet(); // 오동작

        remoCon = new TV();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet();
    }
}
