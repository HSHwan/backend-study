package oop.course2.part2.ch03;

import java.util.Arrays;
import java.util.List;

public class MapStreamExample2 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "orange");
        List<String> uppercase = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(uppercase); // [APPLE, BANANA, CHERRY, ORANGE]
    }
}
