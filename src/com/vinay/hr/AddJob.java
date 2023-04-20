package com.vinay.hr;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vinay.connect.Connect;

/**
 * Servlet implementation class AddJob
 */
public class AddJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddJob() {
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
		
		
		String job_title=request.getParameter("job_title");
		String job_description=request.getParameter("job_description");
		String job_salary=request.getParameter("salary");
		String job_quality=request.getParameter("job_quality");
		String job_experience=request.getParameter("job_experience");
		
		try
		{
		   Connection con = Connect.getConnect();
		   PreparedStatement ps1 = con.prepareStatement("insert into job_table values(?,?,?,?,?,?,?)");
		     ps1.setInt(1,0);
		     ps1.setString(2,job_title);
		     ps1.setString(3,job_description);
		     ps1.setString(4,job_salary);
		     ps1.setString(5,job_quality);
		     ps1.setString(6,job_experience);
		     ps1.setInt(7,UserData.getHr_id());
		    
		     int i = ps1.executeUpdate();  
		      if(i>0)
		      {
		    	  response.sendRedirect("viewjobjsp.jsp");
		  	}
		      else
		      {
		    	  response.sendRedirect("hroption.html");
		      }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
