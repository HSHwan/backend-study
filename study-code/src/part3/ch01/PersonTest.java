package part3.ch01;

public class PersonTest {

    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 변수를 선언하세요.
        // 모델링 된 Person 클래스를 이용하여 객체를 메모리에 생성하세요.
        // 인스턴스 생성 과정
        Person person = new Person();
        person.setName("홍길동");
        person.setAge(30);
        person.setPhone("010-1234-5678");

        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());
        System.out.println("phone = " + person.getPhone());

        person.play();
        person.eat();
        person.walk();
    }
}
