package com.bcu.homeroom.util;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBUtil {
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/longtermroom?useUnicode=true&characterEncoding=utf8", "root", "root");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
