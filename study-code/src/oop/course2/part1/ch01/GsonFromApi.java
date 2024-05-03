package oop.course2.part1.ch01;

import com.google.gson.Gson;
import oop.course2.part1.model.Person;

public class GsonFromApi {

    public static void main(String[] args) {
        String jsonData = "{\"name\":\"John\",\"age\":30}";
        Gson gsonObject = new Gson();
        Person person = gsonObject.fromJson(jsonData, Person.class);
        System.out.println(person);
    }
}
