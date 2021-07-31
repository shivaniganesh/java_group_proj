package com.mph.model;

import java.util.Comparator;

public class Employee1 {
	
	private int employeeNumber;
	private String employeeName;
	private String dept;
<<<<<<< HEAD
	private Salary salary;
=======
	private Salary sal;
>>>>>>> a8e69c1c64a3a6e8f45578a2573539ea8e1519f5
	
	public Employee1()
	{
		
	}
	
	public Employee1(int employeeNumber, String employeeName, Salary sal) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
<<<<<<< HEAD
		this.salary = sal;
=======
		this.sal = sal;
>>>>>>> a8e69c1c64a3a6e8f45578a2573539ea8e1519f5
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
<<<<<<< HEAD

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
=======
	public Salary getSal() {
		return sal;
	}
	public void setSalary(Salary sal) {
		this.sal = sal;
>>>>>>> a8e69c1c64a3a6e8f45578a2573539ea8e1519f5
	}




	@Override
	public String toString() {
		return "Employee1 [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", dept=" + dept
				+ ", salary=" + sal + "]";
	}






	public static Comparator<Employee1> nameComparator = new Comparator<Employee1>() {
		@Override
		public int compare(Employee1  s1,Employee1  s2) {
			return (s1.getEmployeeName().compareTo(s2.getEmployeeName()));
		}	
		
	};
	
}
