package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {

    private final static String URL = "jdbc:mysql://localhost:3306/dbtest1";
    private final static String LOGIN = "root";
    private final static String PASSWORD = "78877887";
    private static Connection connection;

    public static void createNewConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                createNewConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
