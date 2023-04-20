package com.vinay.hr;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vinay.connect.*;

/**
 * Servlet implementation class DeleteHr
 */
public class DeleteHr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteHr() {
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
		int hr_id= Integer.parseInt(request.getParameter("hr_id"));
		
		
		 try
		 {
			 Connection con = Connect.getConnect();
			  PreparedStatement ps3 = con.prepareStatement("delete from hr_table where hr_id=?");
			        ps3.setInt(1,hr_id);
                  
			 int rs1 = ps3.executeUpdate();
			 
           if(rs1 > 0)
			 { 
           	
				  response.sendRedirect("viewhr.jsp");
			 }
           else
			 {
				 response.sendRedirect("deletehr.html");
			 }
			 
		 }
		 catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
