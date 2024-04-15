package part3.ch04;

import part3.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력하세요
        PersonVO vo = new PersonVO();
        System.out.println(vo);
    }
}
