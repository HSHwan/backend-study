package oop.course2.part2.ch01;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Kim", 95);
        studentScores.put("Lee", 85);
        studentScores.put("Park", 90);
        studentScores.put("Choi", 80);

        System.out.println("Kim's score: " + studentScores.get("Kim"));
        System.out.println("Lee's score: " + studentScores.get("Lee"));

        studentScores.put("Park", 92); // 수정
        System.out.println("Park's score: " + studentScores.get("Park"));

        studentScores.remove("Choi");
        System.out.println("Choi's score removal: " + studentScores.get("Choi")); // null

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + "'s score: " + entry.getValue());
        }
    }
}
