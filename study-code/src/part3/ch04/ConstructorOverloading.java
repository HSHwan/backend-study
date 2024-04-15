package part3.ch04;

import part3.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 출력하세요
        PersonVO vo = new PersonVO();
        PersonVO vo1 = new PersonVO("나길동", 60, "010-2222-2222");
        PersonVO vo2 = new PersonVO("조길동", 50, "010-3333-3333");
        System.out.println(vo);
        System.out.println(vo1);
        System.out.println(vo2);
    }
}
