package part4.ch06;

import part4.poly.Board;

public class ObjectToString {

    public static void main(String[] args) {
        Board board = new Board();
        board.setTitle("게시글입니다");
//        System.out.println(board.getTitle());
        System.out.println(board);
    }
}
