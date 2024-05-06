package oop.course2.part1.ch03;

public class StringManipulation {

    public static void main(String[] args) {
        // Hello World라는 문자열을 생성하세요
        String str = "Hello World";
        System.out.println(str.charAt(1)); // 'e'
        System.out.println(str.replaceAll("o", "X"));
        System.out.println(str.indexOf("W")); // 6
        System.out.println(str.indexOf("Wr")); // -1
        System.out.println(str.length()); // 11
        System.out.println(str.toUpperCase()); // HELLO WORLD
        System.out.println(str.toLowerCase()); // hello world
        System.out.println(str.substring(6)); // World
        System.out.println(str.substring(6, 9)); // Wor
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
