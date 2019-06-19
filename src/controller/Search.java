package controller;

	import java.io.*;  
	import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  
	  
@WebServlet("/Search")
public class Search extends HttpServlet{ 
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	  
	response.setContentType("text/html");  
	PrintWriter out = response.getWriter();  
	          
	String flight_date=request.getParameter("flight_date");  
	String flight_source=request.getParameter("flight_source");
	String flight_destination=request.getParameter("flight_destination");
	
	try{  
		Class.forName("jdbc:h2~/Test");  
		Connection con=DriverManager.getConnection(  
				"jdbc:h2~/Test", "sa","pass");  
		              
		PreparedStatement ps=con.prepareStatement("select * from flightdetails where flight_date=?and flight_source=?and flight_destination=?");  
		ps.setString(1,flight_date);  
		ps.setString(2,flight_source);
		ps.setString(3,flight_destination);
		ResultSet rs=ps.executeQuery(); 
	}

	    catch (Exception e2) {
			e2.printStackTrace();
			}  
		          
		finally{out.close();
		}  
	}
}
		  
		

		




