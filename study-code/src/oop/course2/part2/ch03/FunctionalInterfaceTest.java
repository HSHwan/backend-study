package oop.course2.part2.ch03;

import oop.course2.part2.model.MathOperation;

public class FunctionalInterfaceTest implements MathOperation {

    public static void main(String[] args) {
        MathOperation mathOperation = new FunctionalInterfaceTest();
        int result = mathOperation.operation(10, 20);
        System.out.println("result = " + result);
    }

    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
