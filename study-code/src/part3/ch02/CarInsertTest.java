package part3.ch02;

import part3.model.CarDAO;
import part3.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // Q. 자동차 정보를 키보드로 부터 입력을 받아서 BD에 저장하세요. (JDBC)
        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 일련 번호: ");
        int carSerialNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차 이름: ");
        String carName = scanner.nextLine();

        System.out.print("자동차 가격: ");
        int carPrice = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차 소유자: ");
        String carOwner = scanner.nextLine();

        System.out.print("자동차 연식: ");
        int carYear = scanner.nextInt();

        scanner.nextLine();

        System.out.print("자동차 타입: "); // G(휘발유), D(경유)
        String carType = scanner.nextLine();

        CarDTO car = new CarDTO(carSerialNumber, carName, carPrice, carOwner, carYear, carType);

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
        dao.carUpdate();
        dao.carDelete();
    }
}
