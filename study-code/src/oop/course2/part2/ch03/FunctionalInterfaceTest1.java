package oop.course2.part2.ch03;

import oop.course2.part2.model.MathOperation;
import oop.course2.part2.model.MathOperationImpl;

public class FunctionalInterfaceTest1 {

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperationImpl();
        int result = mathOperation.operation(10, 20);
        System.out.println("result = " + result);
    }
}
