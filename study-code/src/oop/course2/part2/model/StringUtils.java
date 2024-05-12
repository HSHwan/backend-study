package oop.course2.part2.model;

public class StringUtils {

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
