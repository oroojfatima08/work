package com.app.util;
import java.sql.*;


public class DbUtil {

	private	static Connection con=null;

	public static Connection getConnection(){

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//jdbc:oracle:thin:@localhost:1521:xe
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","database");

		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
