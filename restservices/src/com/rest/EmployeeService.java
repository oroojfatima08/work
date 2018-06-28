package com.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/emp")
public class EmployeeService {
	EmployeeDao empDao = new EmployeeDao();
	

	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAll() {
		return empDao.getAllEmployee();
	}
	

	/*@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void create() {
		 empDao.createEmployee();
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void delete(@PathParam("id") String id)
	{
		empDao.deleteEmployee(id);
	}
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void update(@PathParam("id") String id)
	{
		empDao.updateEmployee(id);
	}*/
}