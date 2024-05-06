package oop.course2.part1.ch02;

import oop.course2.part1.model.IntArray;

public class MyIntArrayTest {

    public static void main(String[] args) {
        // 정수 3개를 배열에 저장하고 출력하세요
        IntArray list = new IntArray(); // 크기가 5인 정수형 배열
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); // 예외발생 -> 배열의 길이를 늘려주어야 한다

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
