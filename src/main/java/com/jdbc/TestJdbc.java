package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {
        String user = "hr";
        String pass = "hr";
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xe";
        String driver = "oracle.jdbc.driver.OracleDriver";
        try{
            System.out.println("conectting!!!");
            Class.forName(driver);
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("SUCCESS!!!");
            myConn.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
