package org.example.Database;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

public class DatabaseConnection {

    private static Connection connection = null;
    private static Statement statement = null;

    @Before
    public void SetUpAccessDB() {

        try {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database = "jdbc:ucanaccess://D:\\Java_Projects\\Java_Basics\\JavaPrograms\\src\\main\\java\\org\\example\\Database\\SampleDB.accdb;memory=false";
            connection = DriverManager.getConnection(database, "", "");
            statement = connection.createStatement();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }

    @Test
    public void AccessDBConnection() {

        try {
            String selectTable = "Select * from EMPTABLE";
            statement.execute(selectTable);
            ResultSet rs = statement.getResultSet();
            while ((rs != null) && (rs.next())) {
                System.out.println(rs.getString(1) + " : " + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void TearDown(){
        try {
            statement.close();
            connection.close();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
