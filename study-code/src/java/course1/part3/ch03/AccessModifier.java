package java.course1.part3.ch03;

import java.course1.part3.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO("홍길동", 20, "010-1111-1111");
        System.out.println(dto);
        dto.play();
    }
}
