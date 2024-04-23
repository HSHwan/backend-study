package part4.model;
// 사원(VO, DTO)
public class Employee {
    protected String name;
    protected int age;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected boolean marriage;

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        super(); // 상위 클래스의 생성자 호출 -> new Object()
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
