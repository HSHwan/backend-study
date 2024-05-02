package part4.poly;
// 추상클래스 = 추상메서드 + 구현메서드
public abstract class RemoCon {
    // chUp(), chDown(), volUp(), VolDown()
    public abstract void chUp();
    public abstract void chDown();
    public abstract void volUp();
    public abstract void volDown();
    public void internet() {
        System.out.println("인터넷이 구동된다");
    }

}
