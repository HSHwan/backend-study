package oop.course1.part3.ch06;

import oop.course1.part3.model.MyUtil1;

public class NonStaticAccess {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil1
        // 객체 생성해서 접근
        MyUtil1 my1 = new MyUtil1();
        int sum = my1.hap(a, b);
        System.out.println("sum = " + sum);
    }
}
