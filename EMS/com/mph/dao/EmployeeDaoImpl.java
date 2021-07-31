package com.mph.dao;

import com.mph.model.Employee1;
import com.mph.model.Salary;
import com.mph.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao{
	
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public void createEmployee(Employee1 emp, Salary sal) {
	
		con=DBConnection.getDBConnection();
		try {
			ps=con.prepareStatement("insert into EmployeeDetails(eno,ename,Salary,dept) values(?,?,?,?)");
			int eno=emp.getEmployeeNumber();
			String ename=emp.getEmployeeName();
			int  Salary=sal.getBasic();
			String dept=emp.getDept();
			ps.setInt(1, eno);
			ps.setString(2,ename);
			ps.setInt(3, Salary);
			ps.setString(4, dept);
			int noofrows =ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public void listEmployee() {
		con=DBConnection.getDBConnection();
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select* from EmployeeDetails");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void createEmployee(Employee1 emp) {
		// TODO Auto-generated method stub
		
	}
	
	
}
