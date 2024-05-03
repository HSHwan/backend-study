package course1.part4.model;
// 일반사원(VO)
public class RempVO extends Employee {
    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        super(name, age, phone, empDate, dept, marriage); // 상위 클래스 초기화
    }
}
