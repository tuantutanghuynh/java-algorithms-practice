/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday4;
import java.sql.*;

public class DBConnection {
    private static final String URL= "jdbc:sqlserver://localhost:1433;databaseName=StudentDb";
    private static final String USER = "sa";
    private static final String PASSWORD ="password";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
