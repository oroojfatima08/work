package com.app.dao;

import java.util.List;

import com.app.pojo.Employee;

public interface EmployeeDaoInterface
{
	public int save(Employee emp);
	public List<Employee> getAllRecords();
}
