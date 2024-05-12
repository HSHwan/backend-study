package oop.course2.part2.ch03;

import oop.course2.part2.model.Person;
import oop.course2.part2.model.PersonFactory;

public class PersonFactoryTest {

    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        /*PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };*/
//        PersonFactory personFactory = (name, age) -> new Person(name, age);
        Person person = personFactory.create("홍길동", 40);
        System.out.println(person);
    }
}
