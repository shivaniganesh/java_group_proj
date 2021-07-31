package com.mph.dao;

import com.mph.model.Employee1;
import com.mph.model.Salary;

public interface EmployeeDao {

	public void createEmployee(Employee1 emp);
	public void listEmployee();
	void createEmployee(Employee1 emp, Salary sal);
	
}
