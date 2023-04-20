package com.vinay.hr;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vinay.connect.Connect;

/**
 * Servlet implementation class Hrv
 */
public class Hrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hrv() {
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
		
		
		String aemail=request.getParameter("email");
		String apass=request.getParameter("password");
		try
		{
			Connection con = Connect.getConnect();
			PreparedStatement ps1=con.prepareStatement("select * from hr_table where hr_email=? and hr_pass=? ");
			ps1.setString(1,aemail);
			ps1.setString(2,apass);
			ResultSet rs1=ps1.executeQuery();
			
			if(rs1.next())
			{
				  
				
				    UserData.setHr_id(rs1.getInt("hr_id"));
				   
				     response.sendRedirect("hroption.html");
			}
			else
			{
				response.sendRedirect("hr.html");
			}
				
				
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
	}

	}
}
