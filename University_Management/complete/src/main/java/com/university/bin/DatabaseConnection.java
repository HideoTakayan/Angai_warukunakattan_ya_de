package com.university.bin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://mysql-1e39359f-anhlasinhvien2k51-56ec.b.aivencloud.com:25535/defaultdb?ssl-mode=REQUIRED";
    private static final String USER = "avnadmin";
    private static final String PASSWORD = "AVNS_sKstp-4yWqfIfSJ_IBb";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver 1 lần
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot load MySQL driver", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
