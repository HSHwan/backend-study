package oop.course2.part2.ch03;

import java.util.Arrays;

public class StreamApiTest {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        int evenSum = 0;
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                evenSum += number;
//            }
//        }
        int sumOfEvens = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("sumOfEvens = " + sumOfEvens); // 6

        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
        for (int evenNumber : evenNumbers) {
            System.out.println("evenNumber = " + evenNumber);
        }
    }
}
