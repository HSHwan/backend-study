package oop.course2.part1.ch02;

import oop.course2.part1.model.A;
import oop.course2.part1.model.B;
import oop.course2.part1.model.C;
import oop.course2.part1.model.ObjectArray;

public class MyObjectArrayTest {

    public static void main(String[] args) {
        // A, B, C 객체를 배열에 저장하고 출력하세요
        ObjectArray list = new ObjectArray();
        list.add(new A());
        list.add(new B());
        list.add(new C());

        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            if (object instanceof A) {
                ((A) object).display();
            } else if (object instanceof B) {
                ((B) object).display();
            } else {
                ((C) object).display();
            }
        }
    }
}
