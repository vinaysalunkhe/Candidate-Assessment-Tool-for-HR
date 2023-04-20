package com.vinay.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect 
{

	
	static Connection con = null;
	  public  static Connection getConnect()
	      {
	    	  try
	    	  {
	    		  Class.forName("com.mysql.jdbc.Driver");
	    		   con = DriverManager.getConnection("jdbc:mysql://LocalHost:3388/hr_assessment","root","");
	    	  }
	    	  catch(Exception e)
	    	  {
	    		e.printStackTrace();  
	    	  }
	    	  
	    	  return con;
	      }
}
