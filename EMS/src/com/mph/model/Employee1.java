package com.mph.model;

import java.util.Comparator;

public class Employee1 {
	
	private int employeeNumber;
	private String employeeName;
	private int salary;
	public Employee1()
	{
		
	}
	
	public Employee1(int employeeNumber, String employeeName, int salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", salary=" + salary
				+ "]";
	}
	
	public static Comparator<Employee1> nameComparator = new Comparator<Employee1>() {
		@Override
		public int compare(Employee1  s1,Employee1  s2) {
			return (s1.getEmployeeName().compareTo(s2.getEmployeeName()));
		}	
		
	};
	
}
