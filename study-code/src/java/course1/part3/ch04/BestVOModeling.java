package java.course1.part3.ch04;

import java.course1.part3.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        // Q. 영화(MovieVO) 객체를 설계하고 데이터를 저장한 후 출력하세요
        MovieVO vo = new MovieVO("아바타", 20221214, "제이크 설리", "액션", 192.0F, 12);
        System.out.println(vo);
    }
}
