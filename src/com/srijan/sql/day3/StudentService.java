package com.srijan.sql.day3;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class StudentService {
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
    public void addStudent(String firstName, String lastName, String email, double rollno, String discipline){


        String sqlStr = "INSERT INTO customer (first_name, last_name, email_id, amount,customer_id) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = getDBConnection().prepareStatement(sqlStr);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setDouble(4, rollno);
            pst.setString(5, discipline);
            pst.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void showRecords(){
        try{
            Statement st = getDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from customer");
            while(rs.next()){
                System.out.println("first name : " + rs.getString("first_name"));
                System.out.println("last name : " + rs.getString("last_name"));
                System.out.println("email : " + rs.getString("email_id"));
                System.out.println("rollno : " + rs.getDouble("rollno"));
                System.out.println("discipline : " + rs.getString("discipline"));

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void updatestudent(String firstName, String lastName, String email, double rollno, String discipline) {
        String query = "UPDATE customer SET first_name = ?, last_name=?, amount=?,customer_id =? WHERE email_id=?";
        try {
            PreparedStatement pst =getDBConnection().prepareStatement(query);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setDouble(4, rollno);
            pst.setString(5, discipline);
            pst.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteRecord(String email){

        String query = "DELETE FROM customer WHERE email_id = ?";
        try {
            PreparedStatement pst =getDBConnection().prepareStatement(query);
            pst.setString(1,email);
            pst.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args)throws Exception {
        StudentService student = new StudentService();
        student.addStudent("buttler","Eion","Eion@gmail",1005,"CSE");
        student.showRecords();
    }
}
