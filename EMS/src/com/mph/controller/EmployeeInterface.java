package com.mph.controller;

import java.io.IOException;
import java.util.List;



public interface EmployeeInterface {
	public List addEmployee();
	public void viewEmployee(List elist);
	public void sortEmployeeByName(List elist);
	void groupByDepartment(List elist);
	public void serializeEmp(List elist) throws IOException, Exception;
	public void deSerializeEmp(List elist) throws IOException, Exception;
	
}
