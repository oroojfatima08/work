package com.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.rest.pojo.Employee;
import com.app.rest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	EmployeeService empService=new EmployeeService();
	//@Autowired
	//EmployeeService empService;
	
	
	@RequestMapping(value = "/emp/get", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> getCountries() {
		List<Employee> list = empService.getAll();
		return list;
	}
	
	@RequestMapping(value="/emp/get/{id}" , method = RequestMethod.GET, headers = "Accept=application/json" )
	public Employee getEmployeeById(@PathVariable int id)
	{
		Employee emp=empService.getEmployee(id);
		return emp;
		
	}
	@RequestMapping(value = "/emp/post", method = RequestMethod.POST, headers = "Accept=application/json")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	@RequestMapping(value="/emp/put",method = RequestMethod.PUT ,headers = "Accept=application/json")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return empService.updateEmployee(employee);
	}

	@RequestMapping(value = "/emp/delete/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable int id) {
		empService.deleteEmployee(id);
		
	}

}
