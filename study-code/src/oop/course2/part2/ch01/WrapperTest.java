package oop.course2.part2.ch01;

public class WrapperTest {

    public static void main(String[] args) {
        // 정수형 변수에 10을 저장하세요
        int a = 10; // 기본 자료형
//        Integer aa = new Integer(10); // 사용자 정의 자료형 (deprecated)
        Integer aa = 10; // Auto-Boxing
        System.out.println(aa.intValue()); // Unboxing(Integer -> int)

        Integer bb = 20; // Auto-Boxing
        int b = bb; // Auto-Unboxing

        float f = 10.5F;
//        Float ff = new Float(10.5F);
        Float ff = 45.6F; // Auto-Boxing
        System.out.println(ff.floatValue());

        Float af = 49.1F;
        System.out.println(af.floatValue());
        float aff = af; // Auto-Unboxing
        System.out.println(aff);
    }
}
