package com.srijan.sql.day2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerService {

    public void addCusomer(String firstName, String lastName, String email, double amount, String custId){
        String sqlStr = "INSERT INTO customer (first_name, last_name, email_id, amount,customer_id) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = MySqlDBConnection.getDBConnection().prepareStatement(sqlStr);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setDouble(4, amount);
            pst.setString(5, custId);
            pst.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void showRecords(){
        try{
            Statement st = MySqlDBConnection.getDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from customer");
            while(rs.next()){
                System.out.println("first name : " + rs.getString("first_name"));
                System.out.println("last name : " + rs.getString("last_name"));
                System.out.println("email : " + rs.getString("email_id"));
                System.out.println("salary : " + rs.getDouble("amount"));
                System.out.println("salary : " + rs.getDouble("customer_id"));

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void updatecus(String firstName, String lastName, String email, double amount, String custId) {
        String query = "UPDATE customer SET first_name = ?, last_name=?, amount=?,customer_id =? WHERE email_id=?";
        try {
            PreparedStatement pst = MySqlDBConnection.getDBConnection().prepareStatement(query);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setDouble(4, amount);
            pst.setString(5, custId);
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteRecord(String email){

        String query = "DELETE FROM customer WHERE email_id = ?";
        try {
            PreparedStatement pst = MySqlDBConnection.getDBConnection().prepareStatement(query);
            pst.setString(1,email);
            pst.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.addCusomer("Venkatram", "Veerareddy","ven@gmail.com", 98989, "98989");
        customerService.showRecords();
        customerService.updatecus("srijan","veerareddy","sri@gmail.com",87878787,"878787");
    }
}
