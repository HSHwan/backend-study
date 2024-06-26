package oop.course1.part3.ch06;

import oop.course1.part3.model.AllStatic;

public class AllStaticTest {

    public static void main(String[] args) {
//        AllStatic st = new AllStatic();
//        System.out.println(st.hap(10, 20)); // 30
//        System.out.println(st.max(10, 20)); // 20
//        System.out.println(st.min(10, 20)); // 10

        System.out.println(AllStatic.hap(10, 20)); // 30
        System.out.println(AllStatic.max(10, 20)); // 20
        System.out.println(AllStatic.min(10, 20)); // 10

//        System sys = new System(); // private
//        Math m = new Math(); // private
        System.out.println(Math.max(30, 60)); // 60
        System.out.println(Math.min(40, 10)); // 10
    }
}
