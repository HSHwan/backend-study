package oop.course2.part2.ch03;

import oop.course2.part2.model.MathOperation;

public class FunctionalInterfaceTest2 {

    public static void main(String[] args) {
        // MathOperation 인터페이스를 익명 클래스로 구현해보자
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };
        int result = mathOperation.operation(10, 20);
        System.out.println("result = " + result);
    }
}
