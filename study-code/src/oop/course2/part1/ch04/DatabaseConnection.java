package oop.course2.part1.ch04;

import oop.course2.part1.model.Connection;
import oop.course2.part1.model.MSSQLDriver;
import oop.course2.part1.model.MySQLDriver;
import oop.course2.part1.model.OracleDriver;

public class DatabaseConnection {

    public static void main(String[] args) {
        // oracle DB 접속
        Connection connection = new OracleDriver();
        connection.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");

        // mysql DB 접속
        connection = new MySQLDriver();
        connection.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

        // mssql DB 접속
        connection = new MSSQLDriver();
        connection.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=test", "sa", "sa");
    }
}
