package com.vinay.hr;

import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vinay.connect.*;

/**
 * Servlet implementation class AddHr
 */
public class AddHr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddHr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String hr_name=request.getParameter("hr_name");
		String hr_mobile=request.getParameter("hr_mobile");
		String hr_designation=request.getParameter("hr_designation");
		String hr_email=request.getParameter("hr_email");
		String hr_pass=request.getParameter("hr_pass");
		
		try
		{
		   Connection con = Connect.getConnect();
		   PreparedStatement ps1 = con.prepareStatement("insert into hr_table values(?,?,?,?,?,?)");
		     ps1.setInt(1,0);
		     ps1.setString(2,hr_name);
		     ps1.setString(3,hr_designation);
		     ps1.setString(4,hr_mobile);
		     ps1.setString(5,hr_email);
		     ps1.setString(6,hr_pass);
		    
		     int i = ps1.executeUpdate();  
		      if(i>0)
		      {
		    	  response.sendRedirect("viewhr.jsp");
		  	}
		      else
		      {
		    	  response.sendRedirect("adminoption.html");
		      }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
