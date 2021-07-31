package com.mph.controller;

import java.util.List;



public interface EmployeeInterface {
	public List addEmployee();
	public void viewEmployee(List elist);
	public void sortEmployeeByName(List elist);
	void groupByDepartment(List elist);
	
	
}
