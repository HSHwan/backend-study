package course1.part4.ch06;

import course1.part4.poly.A;
import course1.part4.poly.B;

public class ObjectPolyArray {

    public static void main(String[] args) {
        // A, B 클래스를 저장할 배열을 생성하세요
        // 다형성 배열
        Object[] objects = new Object[2];
        objects[0] = new A(); // Upcasting
//        ((A) objects[0]).printGo();

        objects[1] = new B(); // Upcasting
//        ((B) objects[1]).printGo();

        display(objects);
    }

    private static void display(Object[] objects) {
        for (Object object : objects) {
            if (object instanceof A) {
                ((A) objects[0]).printGo();
            } else {
                ((B) objects[1]).printGo();
            }
        }
    }
}
