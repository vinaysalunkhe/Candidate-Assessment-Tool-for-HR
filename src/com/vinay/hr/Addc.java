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

/**
 * Servlet implementation class Addc
 */
public class Addc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addc() {
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
		
		String c_name=request.getParameter("c_name");
		String c_mob=request.getParameter("c_mob");
		String c_email=request.getParameter("c_email");
		String c_add=request.getParameter("c_add");
		int c_age=Integer.parseInt(request.getParameter("c_age"));
		String c_edu=request.getParameter("c_edu");
		
		try
		{
		   Connection con = Connect.getConnect();
		   PreparedStatement ps1 = con.prepareStatement("insert into candidate_table values(?,?,?,?,?,?,?,?,?)");
		     ps1.setInt(1,0);
		     ps1.setString(2,c_name);
		     ps1.setString(3,c_mob);
		     ps1.setString(4,c_email);
		     ps1.setString(5,c_add);
		     ps1.setInt(6,c_age);
		     ps1.setString(7,c_edu);
		     ps1.setInt(8,UserData.getJob_id());
		     ps1.setInt(9,UserData.getHr_id());
		     int i = ps1.executeUpdate();  
		      if(i>0)
		      {
		    	  PreparedStatement ps2 = con.prepareStatement("select * from candidate_table where c_email=?");
		    	  ps2.setString(1,c_email);
		    	  ResultSet rs1=ps2.executeQuery();
		    	  while(rs1.next())
		    	  {
		    		  UserData.setC_id(rs1.getInt("c_id"));
		    	  }
		    	  
		    	  response.sendRedirect("test.jsp");
		  	}
		      else
		      {
		    	  response.sendRedirect("applyjob.jsp");
		      }
		      
		      
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
