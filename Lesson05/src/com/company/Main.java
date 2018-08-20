package com.company;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/product_db",
                "postgres", "postgres");
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM product");
        while (rs.next()) {
            int id = rs.getInt("id");
            
        }
        String n = rs.getString("name");
        System.out.println(n);
        connection.close();
    }
}
