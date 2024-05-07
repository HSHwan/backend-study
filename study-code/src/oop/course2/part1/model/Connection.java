package oop.course2.part1.model;

public interface Connection {
    // DB 연결 동작
    public void getConnection(String url, String username, String password);
}
