package oop.course2.part2.ch01;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {
        String str = "Hello, World";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray(); // {'H', 'e', 'l', 'l', 'o', ...}

        for (char ch : strArray) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        System.out.println("Character Counts");
        for (Character ch : charCountMap.keySet()) {
            System.out.println(ch + ": " + charCountMap.get(ch));
        }
    }
}
