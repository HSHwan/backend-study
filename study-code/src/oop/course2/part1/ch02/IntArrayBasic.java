package oop.course2.part1.ch02;

public class IntArrayBasic {

    public static void main(String[] args) {
        // 정수 5개를 배열에 저장하고 출력하세요
        int[] numbers = new int[5]; // 배열생성동작 : 고정길이(단점) -> 가변길이
        // 저장동작(입력, 추가)
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // numbers.length : 길이를 구하는 동작
        for (int i = 0; i < numbers.length; i++) {
            // 데이터를 얻는 동작 (가져오는 동작)
            System.out.println(numbers[i]);
        }

        // Enhanced for (foreach)
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
