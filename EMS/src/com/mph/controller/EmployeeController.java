package com.mph.controller;

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

	public List addEmployee() {
		emp = new Employee1();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Emp Number:");
		int eno = sc.nextInt();
		emp.setEmployeeNumber(eno);

		System.out.println("Enter your name :");
		emp.setEmployeeName(sc.next());

		
		System.out.println("Enter your department :");
		emp.setDept(sc.next());
		


		Salary sal = new Salary();
		System.out.println("Enter Basic Salary:");
		int basic = sc.nextInt();

		float da =(float) (0.6*basic);
		sal.setDa(da);
		
		float hra =(float) (0.5*basic);
		sal.setHra(hra);
	
		float pf = (float) (0.12*basic);
		sal.setPf(pf);
		
		
		float grossSalary=basic+da+hra+pf;
		sal.setGrossSalary(grossSalary);
		
		float netSalary = grossSalary -pf;
		sal.setNetSalary(netSalary);
		
		emp.setSalary(sal);
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

	public void groupByDepartment(List elist) {
		Map<String,List<Employee1>> groupByDept =(Map<String, List<Employee1>>) elist.stream().collect(Collectors.groupingBy(Employee1::getDept));
		//System.out.println(groupByDept);
		groupByDept.forEach((dep,empInDept)->{
			System.out.println(dep);
			empInDept.forEach(System.out::println);
			
		});
		
	}
}
