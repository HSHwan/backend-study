package oop.course1.part3.model;

public class MemberDTO {
    private String name;
    private int age;
    private String phone;

    public MemberDTO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void play() {
        System.out.println("운동을 한다.");
    }

    @Override
    public String toString() {
        return "name= " + name +
                "\nage= " + age +
                "\nphone= " + phone;
    }
}
