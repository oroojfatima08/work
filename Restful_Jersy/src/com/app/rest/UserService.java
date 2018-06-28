package com.app.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.rest.UserDao;
import com.app.rest.User;

@Path("/UserService")
public class UserService
{
	UserDao userDao = new UserDao();  
	   @GET 
	   @Path("/getusers")
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<User> getUsers(){ 
	      return userDao.getAllUsers(); 
	   }  
	  
	   @POST 
	   @Path("/saveusers")
	   @Produces(MediaType.APPLICATION_XML) 
	   public void saveUsers()
	   {
	   userDao.addUser();
	   }  
	   @PUT
	   @Path("/updateuser/{id}")
	   @Produces(MediaType.APPLICATION_XML) 
	   public void updateUser(@PathParam(value = "id")int id)
	   {
		userDao.updateUser(id);
	   }
	   @DELETE
	   @Path("/deleteuser/{id}")
	   @Produces(MediaType.APPLICATION_XML) 
	   public void deleteUser(@PathParam(value = "id")int id)
	   {
		   userDao.deleteUser(id);
	   }
}
