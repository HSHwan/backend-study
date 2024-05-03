package oop.course2.part1.model;

public class MinMaxFinder {

    private MinMaxFinder() {}

    public static int findMinNumber(int[] arr) {
        int min = arr[0]; // 초기값
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxNumber(int[] arr) {
        int max = arr[0]; // 초기값
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
