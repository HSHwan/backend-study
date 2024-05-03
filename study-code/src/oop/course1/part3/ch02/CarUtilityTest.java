package oop.course1.part3.ch02;


import oop.course1.part3.model.CarDTO;
import oop.course1.part3.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고 있는 Utility 클래스를 설계하세요.
        int carSerialNumber = 1110;
        String carName = "BMW528i";
        int carPrice = 90000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G";

        // 데이터를 하나로 묶는다(이동) -> DTO
        CarDTO car = new CarDTO(
                carSerialNumber,
                carName,
                carPrice,
                carOwner,
                carYear,
                carType);

//        carPrint(car);
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }
}
