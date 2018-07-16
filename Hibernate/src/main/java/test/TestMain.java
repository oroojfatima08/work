package test;

import java.util.Scanner;

import dao.EmployeeDao;
import pojo.Employee;

public class TestMain {

	public static void main(String[] args) throws Exception {
	
		EmployeeDao dao=new EmployeeDao();
		
		System.out.println("Enter the number of employees");
		  Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for( int i =0 ;i<num;i++)
		{
			Employee emp = new Employee();
	        
	        System.out.println("Enter Employee Id: ");
	        int empId = sc.nextInt();
	        emp.setEmpId(empId);
	        System.out.println("Enter Employee Name");
	        String empName = sc.next();
	        emp.setEmpName(empName);
	        System.out.println("Enter Employee Designation");
	        String empDesignation = sc.next();
	        emp.setEmpDesignation(empDesignation);
	        dao.addEmployee(emp);
	        sc.close();
	}
		
		//dao.testL1();
			//dao.testL2();
		
	//	dao.querylevel();
}
}
