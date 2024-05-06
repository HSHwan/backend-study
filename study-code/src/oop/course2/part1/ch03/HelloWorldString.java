package oop.course2.part1.ch03;

public class HelloWorldString {

    public static void main(String[] args) {
        String str = new String("Hello World"); // Heap
        System.out.println(str);

        String str1 = "Hello World"; // String Constant Pool
        System.out.println(str1);
    }
}
