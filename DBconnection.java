package database;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	 public static Connection getConnection()
	    {
	        Connection conn = null;
	        // 1. Load the driver
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver loaded");
	            // 2 connect to the driver => url, uname and pwd
	            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pranaydb1","root","root123");
	            System.out.println("Connected");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return conn;
	    }

}
