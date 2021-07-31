package com.mph.model;

import java.util.Comparator;
import java.io.Serializable;

public class Employee1 implements Serializable {

	private int employeeNumber;
	private String employeeName;
	private String dept;
	//private int salary;
	private Salary sal;

	//private Salary salary;

	
	public Employee1()
	{

	}


	public Employee1(int employeeNumber, String employeeName, String dept, Salary sal) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.dept=dept;
		this.sal = sal;
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

	public String getDept() {
		return dept;
	}

	



	public void setDept(String dept) {
		this.dept = dept;
	}

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee1 [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", dept=" + dept
				+ ", salary=" + sal + "]";
	}









	public static Comparator<Employee1> nameComparator = new Comparator<Employee1>() {
		@Override
		public int compare(Employee1 s1, Employee1 s2) {
			return (s1.getEmployeeName().compareTo(s2.getEmployeeName()));
		}

	};

}
