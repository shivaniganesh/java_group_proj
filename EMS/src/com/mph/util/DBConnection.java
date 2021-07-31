package com.mph.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DBConnection {
	static Connection con;
	public static Connection getDBConnection()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","skm");
<<<<<<< HEAD
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shishir12");
=======
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sathiya");
>>>>>>> a8e69c1c64a3a6e8f45578a2573539ea8e1519f5
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getDBConnection();
	}

}
