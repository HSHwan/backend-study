package oop.course2.part1.ch01;

import java.util.Random;

public class RandomApi {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];
        int i = 0; // 저장 위치 (pos)
        while (i < array.length) {
            int randomNumber = random.nextInt(45) + 1; // 1 ~ 45
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[j] == randomNumber) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                array[i++] = randomNumber;
            }
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
