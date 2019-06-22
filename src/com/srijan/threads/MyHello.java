package com.srijan.threads;

import java.sql.*;

public class MyHello {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException cnfx){
            cnfx.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/srijan_db", "root", "root");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from employee");
            while(rs.next()){
                System.out.println("first name : " + rs.getString("first_name"));
                System.out.println("last name : " + rs.getString("last_name"));
                System.out.println("email : " + rs.getString("email_id"));
                System.out.println("salary : " + rs.getDouble("salary"));

            }
        }catch(SQLException e){

        }

    }
}
