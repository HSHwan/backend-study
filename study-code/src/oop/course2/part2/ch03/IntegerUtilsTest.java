package oop.course2.part2.ch03;

import oop.course2.part2.model.Converter;
import oop.course2.part2.model.IntegerUtils;

public class IntegerUtilsTest {

    public static void main(String[] args) {
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.convert("123");
        System.out.println("result = " + result); // 123
    }
}
