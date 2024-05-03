package oop.course2.part1.ch01;

import oop.course2.part1.model.MinMaxFinder;

public class MinMaxFinderTest {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};

        int min = MinMaxFinder.findMinNumber(arr);
        int max = MinMaxFinder.findMaxNumber(arr);

        System.out.println("min = " + min); // 1
        System.out.println("max = " + max); // 9
    }
}
