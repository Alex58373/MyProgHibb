package jm.task.core.jdbc.util;

import java.sql.*;
import java.util.logging.Logger;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/task_jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "кщще1212";
    private static final Logger logger = Logger.getLogger(Util.class.getName());

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL JDBC Driver not found", e);
        }
    }

    public static Connection getConnection() {
        try {
            logger.info("Подключение к MySQL: " + URL);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка подключения к MySQL", e);
        }
    }
}
