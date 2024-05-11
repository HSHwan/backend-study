package oop.course2.part2.ch02;

import oop.course2.part2.model.Movie;
import oop.course2.part2.model.ObjectArray;

public class GenericTest {

    public static void main(String[] args) {
        /*ObjectArray<String> array = new ObjectArray<>(5);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "Java");
        array.set(3, "Generic");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }*/
        ObjectArray<Movie> movieList = new ObjectArray<>(5);
        movieList.set(0, new Movie("괴물", "봉준호", "2006", "한국"));
        movieList.set(1, new Movie("기생충", "봉준호", "2019", "한국"));
        movieList.set(2, new Movie("완벽한 타인", "이재규", "2018", "한국"));

        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i));
        }
    }
}
