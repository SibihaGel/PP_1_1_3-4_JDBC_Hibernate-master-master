package jm.task.core.jdbc.util;

import java.sql.*;
public class Util {
    private static final String URL = "jdbc:mysql://@localhost:3306/user";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Casella2011";
    private static Connection connection = null;
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД успешно установлено.");
            }
        } catch (SQLException e) {
            System.out.println("Не удалось загрузить драйвер");
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Соединение с БД успешно закрыто.");
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка закрытия соединения с БД.");
        }
    }
}


    

