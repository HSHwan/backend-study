package java.course1.part4.ch01;

import java.course1.part4.model.Employee;
import java.course1.part4.model.RempVO;

public class EmployeeInitTest {
    public static void main(String[] args) {
        Employee employee = new RempVO("홍길동", 33, "010-1111-1111", "2024-04-23", "개발부", true);
        System.out.println(employee);
    }
}
