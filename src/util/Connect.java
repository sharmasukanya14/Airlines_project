package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect 
{
	public static Connection conn = null;
	public static Connection create_connection()
	{
		try
		{  
			Class.forName("org.h2.Driver");
			
		  	conn = DriverManager.getConnection("jdbc:h2~/Test", "sa","pass");
		  	System.out.println("Before Connection");
		  	if(conn!=null)
		  		System.out.println("connection created");
		  	
		}catch(Exception e){
			System.out.println("not created");
			e.printStackTrace();
			}  
		 return conn;
		}  

}
