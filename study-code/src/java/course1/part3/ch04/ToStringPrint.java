package java.course1.part3.ch04;

import java.course1.part3.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 toString() 메서드로 출력하세요
        PersonVO vo = new PersonVO("홍길동", 34, "010-1111-1111");
        System.out.println(vo); // vo.toString()
    }
}
