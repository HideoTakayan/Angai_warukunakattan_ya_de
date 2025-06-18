package com.university.database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

public class aivenConnection {
    public void aivenConn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://mysql-1e39359f-anhlasinhvien2k51-56ec.b.aivencloud.com:25535/defaultdb?ssl-mode=REQUIRED",
                    "avnadmin", "AVNS_sKstp-4yWqfIfSJ_IBb");

            Statement sta = conn.createStatement();
            ResultSet reset = sta.executeQuery("select * from user");
            System.out.println("Display data from database: ");
            while (reset.next()) {
                String userID = reset.getString("userId");
                String username = reset.getString("username");
                String address = reset.getString("address");
                System.out.println(userID + " " + username + " " + address);

            }

            reset.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error in database connecion");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
