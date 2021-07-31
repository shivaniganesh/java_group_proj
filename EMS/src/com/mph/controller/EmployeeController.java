package com.mph.controller;

import com.mph.dao.EmployeeDao;
import com.mph.dao.EmployeeDaoImpl;
import com.mph.model.Employee1;
import com.mph.model.Salary;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeController implements EmployeeInterface {
	List empList = new ArrayList();
	Employee1 emp;
	EmployeeDao dao=new EmployeeDaoImpl();

	public List addEmployee() {
		emp = new Employee1();

		// System.out.println(emp.empno+ " " + emp.empname);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Emp Number:");
		int eno = sc.nextInt();
		emp.setEmployeeNumber(eno);

		System.out.println("Enter your name :");
		emp.setEmployeeName(sc.next());

		
		System.out.println("Enter your department :");
		emp.setDept(sc.next());
		


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
		//System.out.println(emp);
		dao.createEmployee(emp);

		System.out.println("Employee Added Sucessfully !!!");
		return empList;

	}

	@Override
	public void viewEmployee(List elist) {
		// TODO Auto-generated method stub

		elist.forEach(li -> System.out.println(li));
		dao.listEmployee();

	}

	@SuppressWarnings("unchecked")
	public void sortEmployeeByName(List elist) {
		Collections.sort(elist, Employee1.nameComparator);
		elist.forEach(li -> System.out.println(li));
	}

	public void groupByDepartment(List elist) {
		Map<String,List<Employee1>> groupByDept =(Map<String, List<Employee1>>) elist.stream().collect(Collectors.groupingBy(Employee1::getDept));
		//System.out.println(groupByDept);
		groupByDept.forEach((dep,empInDept)->{
			System.out.println(dep);
			empInDept.forEach(System.out::println);
			
		});
		
	}
}
