package oop.course1.part4.poly;

public class Board {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
