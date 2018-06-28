package com.rest;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EmployeeDao {
	
	JSONParser parser = new JSONParser();
	List<Employee> empList = new ArrayList<>();
	public List<Employee> getAllEmployee() {
		
		try {
			JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("D:\\sample.json"));

			String id = (String) jsonObject.get("Employee id");
			String name = (String) jsonObject.get("Name");
		
			Employee employee = new Employee();
			employee.setId(id);
			employee.setName(name);
	
			empList.add(employee);
			
			} catch (Exception e) {
			e.printStackTrace();
			}
			return empList;
	}
	
	
	/*@SuppressWarnings("unchecked")
	public void createEmployee()
	{
		try{
		FileWriter fileWriter = new FileWriter("D:\\sample.json");
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("Employee id","101");
		jsonObject1.put("Name", "orooj");
		JSONObject employeeObj=new JSONObject();
		employeeObj.put("employee",jsonObject1);
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("Employee id","102");
		jsonObject2.put("Name", "naveen");
		JSONObject employeeObj1=new JSONObject();
		employeeObj1.put("employee",jsonObject2);
		
		JSONArray employeeList =new JSONArray();
		employeeList.add(employeeObj);
		//employeeList.add(employeeObj1);
		
		
		fileWriter.write(employeeList.toJSONString());
	     fileWriter.close();
       System.out.println("JSON Object Successfully written to the file!!");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public void deleteEmployee(String id)
	{
		  try
	        {
				JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("D:\\sample.json")); 
	            for(Employee e:empList)
	            {
	            	if(e.getId()==id)
	            	{
	            		jsonObject.remove("Employee id",id);
	            		
	            		
	            		
	            	}
	            }
	            	FileWriter fileWriter = new FileWriter("D:\\sample.json");
	    			fileWriter.write(jsonObject.toJSONString());
	    	        fileWriter.close();

	    	         System.out.println("JSON Object Successfully deleted from the file!!");
	    	
	        } catch (Exception e)
		  {
	        	e.printStackTrace();
		  }
		 
	}
	public void updateEmployee(String id)
	{
		JSONObject jsonObject;
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("D:\\sample.json"));
		
        for(Employee e:empList)
        {
        	
        	if(e.getId()==id)
        	{
        		
        		jsonObject.put("Name", "fatima");
        			
        	}	
        }
				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}*/
}