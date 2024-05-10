package oop.course2.part2.ch01;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 4, 6, 7, 1, 3};

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Unique numbers...");
        for (Integer uniqueNumber : uniqueNumbers) {
            System.out.println(uniqueNumber);
        }
    }
}
