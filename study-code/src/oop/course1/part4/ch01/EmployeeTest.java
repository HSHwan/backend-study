package oop.course1.part4.ch01;

import oop.course1.part4.model.Employee;
import oop.course1.part4.model.RempVO;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반사원 한 명의 객체를 생성하고 데이터를 저장 후 출력하세요
        Employee employee = new RempVO("홍길동", 50, "010-1111-1111", "2022-10-10", "홍보부", true);
        System.out.println(employee);
    }
}
