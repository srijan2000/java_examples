package com.srijan.sql.day1;

import java.sql.*;

public class Demo4Class {

    public static Connection getDBConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/srijan_db", "root", "root");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void showRecords(){
        try {
            Statement st = getDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from employee");
            while (rs.next()){
                System.out.println("first name : " + rs.getString("first_name"));
                System.out.println("last name :" + rs.getString("last_name"));
                System.out.println("email :" + rs.getString("email_id"));
                System.out.println("salary : " + rs.getString("salary"));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void insertRecord(String firstName,String lastName,String email,double salary){
        String sqlStr = "INSERT INTO employee (first_name, last_name, email_id, salary) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pst = getDBConnection().prepareStatement(sqlStr);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setDouble(4, salary);
            pst.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        insertRecord("kiran","rao","rao@gmail.com", 234343);
        showRecords();
    }
}
