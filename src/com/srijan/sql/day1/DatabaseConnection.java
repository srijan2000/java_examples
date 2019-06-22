package com.srijan.sql.day1;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;

public class DatabaseConnection {

    public Connection getDBConnection(){

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException cnfx){
            cnfx.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/srijan_db", "root", "root");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return connection;

    }

    public void showRecords(){
        try{
            Statement st = getDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from employee");
            while(rs.next()){
                System.out.println("first name : " + rs.getString("first_name"));
                System.out.println("last name : " + rs.getString("last_name"));
                System.out.println("email : " + rs.getString("email_id"));
                System.out.println("salary : " + rs.getDouble("salary"));

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void insertRecord(String firstName, String lastName, String email, double salary){
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

    public void deleteByEmail(String email){

        String query = "DELETE FROM employee WHERE email_id = ?";
        try {
            PreparedStatement pst = getDBConnection().prepareStatement(query);
            pst.setString(1,email);
            pst.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void updateByEmail(String firstName, String lastName, double salary, String email){

        String query = "UPDATE employee SET first_name = ?, last_name=?, salary=? WHERE email_id=?";
        try {
            PreparedStatement pst = getDBConnection().prepareStatement(query);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setDouble(3, salary);
            pst.setString(4, email);

            pst.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        DatabaseConnection dbcon = new DatabaseConnection();
        //dbcon.insertRecord("","","",98989);

        dbcon.showRecords();
        //dbcon.deleteByEmail("chintu@gmail.com");
        dbcon.updateByEmail("Winnie","Veerareddy", 5656565d, "vinny@gmail.com" );
        System.out.println("*****************************");
        dbcon.showRecords();
    }
}
