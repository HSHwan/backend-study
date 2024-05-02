package part4.ch05;

import part4.poly.Radio;
import part4.poly.RemoCon;
import part4.poly.TV;

public class InterfaceTest {

    public static void main(String[] args) {
        // 리모컨으로 Radio와 TV를 동작시켜보자
        RemoCon remoCon = new Radio();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet(); // 오동작

        remoCon = new TV();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.volUp();
        remoCon.volDown();
        remoCon.internet();
    }
}
