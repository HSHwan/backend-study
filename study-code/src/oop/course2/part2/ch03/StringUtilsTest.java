package oop.course2.part2.ch03;

import oop.course2.part2.model.Converter;
import oop.course2.part2.model.StringUtils;

public class StringUtilsTest {

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Converter<String, String> converter = stringUtils::reverse;
        String result = converter.convert("hello");
        System.out.println("result = " + result); // olleh
    }
}
