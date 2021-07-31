package com.mph.controller;

import com.mph.model.Employee1;
import com.mph.model.Salary;

import java.util.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class EmployeeController implements EmployeeInterface {
	List empList = new ArrayList();
	Employee1 emp;

	public List addEmployee() {
		emp = new Employee1();

		// System.out.println(emp.empno+ " " + emp.empname);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Emp Number:");
		int eno = sc.nextInt();
		emp.setEmployeeNumber(eno);

		System.out.println("Enter your name :");
		emp.setEmployeeName(sc.next());

		Salary sal = new Salary();
		System.out.println("Enter Monthly Salary:");
		int basic = sc.nextInt();

		sal.setBasic(basic);
		sal.setDa(basic);
		sal.setHra(basic);
		sal.setPf(basic);
		sal.setGrossSalary(basic);
		sal.setNetSalary(basic);
		emp.setSalary(basic);

		empList.add(emp);
		System.out.println(emp);

		System.out.println("Employee Added Sucessfully !!!");
		return empList;

	}

	@Override
	public void viewEmployee(List elist) {
		// TODO Auto-generated method stub

		elist.forEach(li -> System.out.println(li));

	}

	@SuppressWarnings("unchecked")
	public void sortEmployeeByName(List elist) {
		Collections.sort(elist, Employee1.nameComparator);
		elist.forEach(li -> System.out.println(li));
	}
}
