package oop.course2.part2.ch01;

import oop.course2.part2.model.Movie;

import java.util.ArrayList;

public class MovieListExample {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("괴물", "봉준호", "2006", "한국"));
        list.add(new Movie("기생충", "봉준호", "2019", "한국"));
        list.add(new Movie("완벽한 타인", "이재규", "2018", "한국"));

        for (Movie movie : list) {
            System.out.println(movie);
        }

        System.out.println("+----------------+--------+----+------+");
        System.out.println("|영화제목         |감독      |개봉년도|국가|");
        System.out.println("+----------------+--------+----+------+");
        for (Movie movie : list) {
            System.out.printf("|%-16s|%-8s|%4s|%-6s|\n", movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getCountry());
        }
        System.out.println("+----------------+--------+----+------+");

        String searchTitle = "기생충";
        // 순차검색 -> 이진검색
        for (Movie movie : list) {
            if (movie.getTitle().equals(searchTitle)) {
                System.out.println("제목:" + movie.getTitle());
                System.out.println("감독:" + movie.getDirector());
                System.out.println("개봉년도:" + movie.getYear());
                System.out.println("국가:" + movie.getCountry());
                break;
            }
        }
    }
}
