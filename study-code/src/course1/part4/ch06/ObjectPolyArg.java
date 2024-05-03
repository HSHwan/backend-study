package course1.part4.ch06;

import course1.part4.poly.A;
import course1.part4.poly.B;

public class ObjectPolyArg {

    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object object) { // 다형성 인수 활용
        if (object instanceof A) {
            ((A) object).printGo();
        } else if (object instanceof B) {
            ((B) object).printGo();
        }
    }
}
