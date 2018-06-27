package com.app.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.app.rest.pojo.Employee;

public class EmployeeService 
{

	 static HashMap<Integer,Employee> employeeIdMap=getEmployeeIdMap();
	 
	 public EmployeeService()
	 {
		 super();
	 
	 
	 if(employeeIdMap==null)
	 {
		 employeeIdMap = new HashMap<Integer,Employee>();
		 Employee e1= new Employee(1,"abc");
		 Employee e2=new Employee(2,"xyz");
		 Employee e3= new Employee(3,"pqr");
		 Employee e4= new Employee(4,"mno");
		 
		 employeeIdMap.put(1,e1);
		 employeeIdMap.put(2,e2);
		 employeeIdMap.put(3,e3);
		 employeeIdMap.put(4,e4);
		 
	 }

	 }
	
	 public List<Employee> getAll()
	 {
		 List<Employee> list = new ArrayList<Employee>(employeeIdMap.values());
		 System.out.println("list displayed of Employees");
	  return list;
	 }
	 
	 
	 public Employee getEmployee(int id)
		{
			Employee emp= employeeIdMap.get(id);
			System.out.println("Employee retreived with id "+id);
			return emp;
			
		}
	 
	 public Employee addEmployee(Employee employee)
	 {
	    
		 Employee emp= new Employee(employee.getId(),employee.getName());
		  employeeIdMap.put(employee.getId(), emp);
		  System.out.println(" New Employee added to the list");
	  return employee;
	 }
	 public Employee updateEmployee(Employee employee)
	 {
		employeeIdMap.put(employee.getId(), employee);
		System.out.println("Employee details updated in list");
		return employee;
		 
	 }
	  
	 public void deleteEmployee(int id)
	 
	 {
	  employeeIdMap.remove(id);
	  System.out.println("Employee deleted with id " +id);
	
	  
	 }

	private static HashMap<Integer, Employee> getEmployeeIdMap() {
		
		return employeeIdMap;
	}
}
