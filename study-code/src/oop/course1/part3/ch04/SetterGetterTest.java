package java.course1.part3.ch04;

import java.course1.part3.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // Q. setter, getter 메소드를 통해 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력하세요
        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(50);
        vo.setPhone("010-1111-1111");

        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
    }
}
