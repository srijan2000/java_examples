package com.srijan.sql.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlDBConnection {

    private static Properties readDBProps() throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("application.properties"));
        return  properties;

    }

    public static Connection getDBConnection(){

        Connection connection = null;
        Properties properties = null;

        try {
            properties = readDBProps();
            String driver = properties.getProperty("jdbc.driver");
            Class.forName(driver);
        }catch (ClassNotFoundException cnfx){
            cnfx.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            String url = properties.getProperty("jdbc.url");
            String userName = properties.getProperty("jdbc.username");
            String password = properties.getProperty("jdbc.password");

            connection = DriverManager.getConnection(url, userName, password);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        try {
            Properties properties = readDBProps();

            System.out.println(properties.getProperty("jdbc.driver"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
