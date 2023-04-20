package com.vinay.hr;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vinay.connect.*;
import java.sql.*;

/**
 * Servlet implementation class Adminv
 */
public class Adminv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminv() {
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
			PreparedStatement ps1=con.prepareStatement("select * from admin_table ");
			ResultSet rs1=ps1.executeQuery();
			while(rs1.next())
			{
				if(rs1.getString(1).equals(aemail) && rs1.getString(2).equals(apass))
				{
				     response.sendRedirect("adminoption.html");
				}
				else
				{
					response.sendRedirect("admin.html");
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
