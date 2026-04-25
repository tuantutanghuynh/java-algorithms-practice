/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaadday4;

import java.sql.*;

public class ConnectDB {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=StudentDb";
        String user ="sa";
        String password = "password";
        
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            
            if(con != null){
                System.out.println("Connect successful!");
            }
            con.close();
        }catch(Exception e){
            System.out.println("Fail to connect!" + e.getMessage());
        }
        
    }
}
