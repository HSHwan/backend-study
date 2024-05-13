package oop.course2.part2.ch03;

import oop.course2.part2.model.MathOperation;

public class LambdaExample {

    public static void main(String[] args) {
//        MathOperation add = (int x, int y) -> { return x + y; };
        MathOperation add = (x, y) -> x + y;
        MathOperation multi = (x, y) -> x * y;
        int result = add.operation(10, 20);
        System.out.println("result = " + result);
        int multiResult = multi.operation(10, 20);
        System.out.println("multiResult = " + multiResult);
    }
}
