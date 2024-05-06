package oop.course2.part1.ch02;

import oop.course2.part1.model.Book;
import oop.course2.part1.model.BookArray;

public class MyBookArrayTest {

    public static void main(String[] args) {
        // 책 3권의 데이터를 배열에 저장하고 출력하세요
        BookArray list = new BookArray();
        list.add(new Book("자바", 15000, "한빛", "홍길동"));
        list.add(new Book("C++", 17000, "대림", "이길동"));
        list.add(new Book("Python", 16000, "정보", "나길동"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
