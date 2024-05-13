package oop.course2.part2.ch03;

import oop.course2.part2.model.StringOperation;

public class LambdaApply {

    public static void main(String[] args) {
        StringOperation toUpperCase = s -> s.toUpperCase();
        StringOperation toLowerCase = s -> s.toLowerCase();

        String input = "Lambda Expressions";
        System.out.println(processString(input, toUpperCase));
        System.out.println(processString(input, toLowerCase));
    }

    public static String processString(String input, StringOperation operation) {
        return operation.apply(input);
    }
}
