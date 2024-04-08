package ch01;
// 객체(object) = 상태정보(멤버변수) + 행위정보(멤버메서드)
public class Person {
    private String name;
    private int age;
    private String phone;

    public Person(String name, int age, String phone) {
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

    public void eat() {
        System.out.println("음식을 먹다.");
    }

    public void walk() {
        System.out.println("걷다.");
    }
}
