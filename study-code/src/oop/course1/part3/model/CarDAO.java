package java.course1.part3.model;

public class CarDAO {
    // C.R.U.D
    // Create = insert(저장)
    public void carInsert(CarDTO car) {
        // DB Connection, Insert SQL
        System.out.println("car 정보가 DB에 저장되었습니다.");
    }

    public void carSelect() {
        // DB Connection, select SQL
        System.out.println("car 정보가 출력되었습니다.");
    }

    public void carUpdate() {
        System.out.println("car 정보가 수정되었습니다.");
    }

    public void carDelete() {
        System.out.println("car 정보가 삭제되었습니다.");
    }
}
