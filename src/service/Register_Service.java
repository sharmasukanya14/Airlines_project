package service;

import java.sql.PreparedStatement;

import util.Connect;

public class Register_Service
{

	public void select(String flight_id, String source_flight, String destination_flight) 
	{
		java.sql.Connection con = (java.sql.Connection) Connect.create_connection();
		try
		{
			if(con!=null)
			{
				String sql ="Select * from flight where flight_id=? and source_flight=? and destination_flight=?";
				PreparedStatement ps = con.prepareStatement(sql);
			}
			else
			{
				System.out.println("Connection object is null");
			}
			
		    
		    
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	

}
