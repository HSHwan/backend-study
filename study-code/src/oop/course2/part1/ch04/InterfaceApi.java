package oop.course2.part1.ch04;

import oop.course2.part1.model.BB;
import oop.course2.part1.model.CC;

// CC를 이용하여 BB를 동작시키는 프로그래밍 (Interface Based Programming)
public class InterfaceApi {

    public static void main(String[] args) {
        CC c = new BB(); // new FF(), new DD() ...
        c.x(); // BB의 x()가 동작 -> 동적 바인딩
        c.y();
        c.z();
    }
}
