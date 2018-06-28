package com.app.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.app.rest.User;

public class UserDao
{
	 List<User> userList = null; 
	 @SuppressWarnings("unchecked")
	 public List<User> getAllUsers()
	 { 
	      
	     
	      try { 
	         File file = new File("Users.txt"); 
	         if (!file.exists()) { 
	            User user = new User(101, "Mahesh", "Teacher"); 
	            userList = new ArrayList<User>(); 
	            userList.add(user); 
	            saveUserList(userList); 
	         } 
	         else{ 
	            FileInputStream fis = new FileInputStream(file); 
	            ObjectInputStream ois = new ObjectInputStream(fis); 
	            userList = (List<User>) ois.readObject(); 
	            System.out.println("All users retrevied");
	            ois.close(); 
	         } 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } catch (ClassNotFoundException e) { 
	         e.printStackTrace(); 
	      }   
	      return userList; 
	   } 
	   private void saveUserList(List<User> userList){ 
	      try { 
	         File file = new File("Users.txt"); 
	         FileOutputStream fos;  
	         fos = new FileOutputStream(file); 
	         ObjectOutputStream oos = new ObjectOutputStream(fos); 
	         oos.writeObject(userList); 
	         oos.close(); 
	      } catch (FileNotFoundException e) { 
	         e.printStackTrace(); 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } 
	   }
	   
	   public void addUser()
	   {
		   User user = new User(102, "Shreya", "Pilot"); 
		userList = new ArrayList<User>(); 
		userList.add(user); 
		saveUserList(userList);     
		System.out.println("Added User");
		User user1 = new User(103, "riya", "Cook"); 
		userList.add(user1); 
		saveUserList(userList);     
		System.out.println("Added User1");
	  }
	   public void updateUser(int id)
	   {
		   User user=new User(id,"Shyam","Shopkeeper");
			userList = new ArrayList<User>(); 
			userList.add(user); 
			saveUserList(userList);  
			System.out.println("Updated User with id "+id);  
	   }
	   
	   public void deleteUser(int id)
	   {
		   userList = new ArrayList<User>(); 
		   User user=new User(id,"Shyam","Shopkeeper");
			userList.remove(user); 
			saveUserList(userList);  
			System.out.println("Deleted User with id "+id);   
	   }
}
