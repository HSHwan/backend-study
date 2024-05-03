package java.course1.part3.ch03;

import java.course1.part3.ch01.Person;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person person = new Person();
        person.setName("홍길동");
        person.setAge(1000); // 유효성 검사 필요
        person.setPhone("010-1111-1111");
        System.out.println(person);
    }
}
