package oop.course2.part2.ch03;

import java.util.Arrays;
import java.util.List;

public class MapStreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(squaredNumbers); // [1, 4, 9, 16, 25]
    }
}
