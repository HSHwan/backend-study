package java.course1.part3.ch06;

public class NonStaticTest {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NonStaticTest nst = new NonStaticTest();
        int sum = nst.hap(a, b);
        System.out.println("sum = " + sum); // 30
    }

    public int hap(int a, int b) {
        int v = a + b;
        return v;
    }
}
