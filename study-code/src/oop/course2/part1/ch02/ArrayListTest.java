package oop.course2.part1.ch02;

import oop.course2.part1.model.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요
        // ArrayList == ObjectArray
        List list = new ArrayList<>(1);
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
