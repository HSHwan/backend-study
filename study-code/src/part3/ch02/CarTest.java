package part3.ch02;

import part3.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동해야 되는 경우를 생각해보자
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

//        System.out.println("carSerialNumber = " + carSerialNumber);
//        System.out.println("carName = " + carName);
//        System.out.println("carPrice = " + carPrice);
//        System.out.println("carOwner = " + carOwner);
//        System.out.println("carYear = " + carYear);
//        System.out.println("carType = " + carType);

        // 자동차 데이터를 이동하기 위한 바구니가 필요하다. (DTO, VO)
        // 클래스로 CarDTO, CarVO 모델을 설계
        CarDTO car = new CarDTO(carSerialNumber, carName, carPrice, carOwner, carYear, carType);
        carInfoPrint(car);
    }
    // Q. 매개변수로 자동차의 정보를 받아서 출력하는 메서드를 정의하세요.
    public static void carInfoPrint(CarDTO car) {
        System.out.println(car);
    }
}
