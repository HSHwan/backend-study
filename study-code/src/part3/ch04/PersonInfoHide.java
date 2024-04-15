package part3.ch04;

import part3.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // Q. 한 사람의 회원 정보를 저장할 객체를 생성하세요.
        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(5000);
        vo.setPhone("010-1111-1111");

        System.out.println(vo);
    }
}
