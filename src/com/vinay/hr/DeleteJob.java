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
 * Servlet implementation class DeleteJob
 */
public class DeleteJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteJob() {
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
		
		int job_id = Integer.parseInt(request.getParameter("job_id"));
		
		
		 try
		 {
			 Connection con = Connect.getConnect();
			  PreparedStatement ps3 = con.prepareStatement("delete from job_table where job_id=? and hr_id=?");
			        ps3.setInt(1,job_id);
			        ps3.setInt(2,UserData.getHr_id());
                  
			 int rs1 = ps3.executeUpdate();
			 
           if(rs1 > 0)
			 { 
           	
				  response.sendRedirect("viewjobjsp.jsp");
			 }
           else
			 {
				 response.sendRedirect("deletejob.html");
			 }
			 
		 }
		 catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
