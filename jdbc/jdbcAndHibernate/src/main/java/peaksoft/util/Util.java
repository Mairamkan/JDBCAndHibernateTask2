package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String User = "postgres";
    private static final String Pass = "12345";

    public static Connection connection (){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, User, Pass);
//            System.out.println("Connected!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
        return connection;
    }
}
