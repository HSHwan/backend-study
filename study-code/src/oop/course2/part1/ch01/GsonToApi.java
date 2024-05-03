package oop.course2.part1.ch01;

import com.google.gson.Gson;
import oop.course2.part1.model.Person;

public class GsonToApi {

    public static void main(String[] args) {
        Person person = new Person("John", 30);
        Gson gsonObject = new Gson();
        String personJsonData = gsonObject.toJson(person);
        System.out.println(personJsonData); // JSON : {"name":"John","age":30}
    }
}
