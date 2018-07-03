package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.pojo.Employee;
import com.app.util.DbUtil;

@Repository
public class EmployeeDao implements EmployeeDaoInterface

{

	@Override
	public int save(Employee emp) {
		int status=0;
		try{
			Connection con=DbUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO EMPLOYEE(ID,NAME,SALARY,DESIGNATION) values(emp_id.nextval,?,?,?)");
			ps.setString(1,emp.getName());
			ps.setDouble(2,emp.getSalary());
			ps.setString(3,emp.getDesignation());
			status=ps.executeUpdate();
			System.out.println("In Save method");
		}catch(Exception e){System.out.println(e);}
		return status;
	
	}

	@Override
	public List<Employee> getAllRecords() {
		
		
		List<Employee> list=new ArrayList<Employee>();
		try{
			Connection con=DbUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from EMPLOYEE");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Employee b=new Employee();
				b.setId(rs.getInt("id"));
				b.setName(rs.getString("name"));
				b.setSalary(rs.getDouble("salary"));
				b.setDesignation(rs.getString("designation"));
				list.add(b);
			    System.out.println(" is called");
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}

	/*public int update(Employee emp) {
		int status=0;
		try{
			Connection con=DbUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("UPDATE EMPLOYEE SET NAME=?,SALARY=?,DESIGNATION=? WHERE ID=?");
		    System.out.println("update is called");
		    
		    
		    ps.setString(1,emp.getName());
			 System.out.println(emp.getName());
		    
			ps.setDouble(2,emp.getSalary());
			 System.out.println(emp.getSalary());
			 
			ps.setString(3,emp.getDesignation());
			 System.out.println(emp.getDesignation());
			ps.setInt(4,emp.getId());
			 System.out.println(emp.getId());
			
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}*/
	
}
