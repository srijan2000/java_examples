package com.srijan.sql.day3;

import com.srijan.sql.day2.MySqlDBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerService1 {

    public void addCustomer(String firstName,String lastName,double amount,String customer,String custId){
        String sqlStr = "INSERT INTO customer (first_name, last_name, email_id, amount,customer_id) VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement pst = MySqlDBConnection.getDBConnection().prepareStatement(sqlStr);
            pst.setString(1,firstName);
            pst.setString(2,lastName);
            pst.setDouble(3,amount);

        }catch (SQLException e){}
    }
}
