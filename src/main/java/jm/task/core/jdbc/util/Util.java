package jm.task.core.jdbc.util;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/kataschema";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345zZ!";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}