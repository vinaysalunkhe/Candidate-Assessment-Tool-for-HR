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
 * Servlet implementation class Calculate
 */
public class Calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculate() {
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
		int o=0;
		int c=0;
		int e=0;
		int a=0;
		int n=0;
		String fin=null;
		String ans1=request.getParameter("q1");
		String ans2=request.getParameter("q2");
		String ans3=request.getParameter("q3");
		String ans4=request.getParameter("q4");
		String ans5=request.getParameter("q5");
		String ans6=request.getParameter("q6");
		String ans7=request.getParameter("q7");
		String ans8=request.getParameter("q8");
		String ans9=request.getParameter("q9");
		String ans10=request.getParameter("q10");
		String ans11=request.getParameter("q11");
		String ans12=request.getParameter("q12");
		String ans13=request.getParameter("q13");
		String ans14=request.getParameter("q14");
		String ans15=request.getParameter("q15");
		String arr[]={ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,ans11,ans12,ans13,ans14,ans15};
		
		for(int i=0;i<15;i++)
		{
		if(arr[i].equals("o"))
		{
			o++;
		}
	
		else if(arr[i].equals("c"))
		{
			c++;
		}
		else if(arr[i].equals("e"))
		{
			e++;
		}
		
		else if(arr[i].equals("a"))
		{
			a++;
		}
		else 
		{
			n++;
		}
		
		}
		/*System.out.println("value of o"+o);
		System.out.println("value of c"+c);
		System.out.println("value of e"+e);
		System.out.println("value of a"+a);
		System.out.println("value of n"+n);*/
		
		try
		{
			Connection con =Connect.getConnect();
			PreparedStatement ps1=con.prepareStatement("select * from job_table where job_id=?");
			ps1.setInt(1,UserData.getJob_id());
			ResultSet rs1=ps1.executeQuery();
			while(rs1.next())
			{
				fin=rs1.getString("job_quality");
			}
			if(fin.equals("Openness") && o>=5)
			{
				 PreparedStatement ps3 = con.prepareStatement("select * from candidate_table where c_id=?");
		    	  ps3.setInt(1,UserData.getC_id());
		    	  ResultSet rs3=ps3.executeQuery();
		    	  while(rs3.next())
		    	  {
				PreparedStatement ps2=con.prepareStatement("insert into scandidate_table values(?,?,?,?,?,?,?,?,?,?,?)");
				ps2.setInt(1,UserData.getC_id());
				ps2.setString(2,rs3.getString("c_name"));
				ps2.setString(3,rs3.getString("c_mob"));
				ps2.setString(4,rs3.getString("c_email"));
				ps2.setInt(5,UserData.getJob_id());
				ps2.setInt(6,o);
				ps2.setInt(7,c);
				ps2.setInt(8,e);
				ps2.setInt(9,a);
				ps2.setInt(10,n);
				ps2.setInt(11,UserData.getHr_id());
				int rs2=ps2.executeUpdate();
				if(rs2>0)
				{
					response.sendRedirect("shortlist.jsp");
				}
				
		    	  }
			}
			else if(fin.equals("Conscientiousness") && c>=5)
			{
				PreparedStatement ps3 = con.prepareStatement("select * from candidate_table where c_id=?");
		    	  ps3.setInt(1,UserData.getC_id());
		    	  ResultSet rs3=ps3.executeQuery();
		    	  while(rs3.next())
		    	  {
				PreparedStatement ps2=con.prepareStatement("insert into scandidate_table values(?,?,?,?,?,?,?,?,?,?,?)");
				ps2.setInt(1,UserData.getC_id());
				ps2.setString(2,rs3.getString("c_name"));
				ps2.setString(3,rs3.getString("c_mob"));
				ps2.setString(4,rs3.getString("c_email"));
				ps2.setInt(5,UserData.getJob_id());
				ps2.setInt(6,o);
				ps2.setInt(7,c);
				ps2.setInt(8,e);
				ps2.setInt(9,a);
				ps2.setInt(10,n);
				ps2.setInt(11,UserData.getHr_id());
				int rs2=ps2.executeUpdate();
				if(rs2>0)
				{
					response.sendRedirect("shortlist.jsp");
				}
		    	  }
			}
			else if(fin.equals("Extroversion") && e>=5)
			{
				PreparedStatement ps3 = con.prepareStatement("select * from candidate_table where c_id=?");
		    	  ps3.setInt(1,UserData.getC_id());
		    	  ResultSet rs3=ps3.executeQuery();
		    	  while(rs3.next())
		    	  {
				PreparedStatement ps2=con.prepareStatement("insert into scandidate_table values(?,?,?,?,?,?,?,?,?,?,?)");
				ps2.setInt(1,UserData.getC_id());
				ps2.setString(2,rs3.getString("c_name"));
				ps2.setString(3,rs3.getString("c_mob"));
				ps2.setString(4,rs3.getString("c_email"));
				ps2.setInt(5,UserData.getJob_id());
				ps2.setInt(6,o);
				ps2.setInt(7,c);
				ps2.setInt(8,e);
				ps2.setInt(9,a);
				ps2.setInt(10,n);
				ps2.setInt(11,UserData.getHr_id());
				int rs2=ps2.executeUpdate();
				if(rs2>0)
				{
					response.sendRedirect("shortlist.jsp");
				}
		    	  }
			}
			else if(fin.equals("Agreeableness") && a>=5)
			{
				PreparedStatement ps3 = con.prepareStatement("select * from candidate_table where c_id=?");
		    	  ps3.setInt(1,UserData.getC_id());
		    	  ResultSet rs3=ps3.executeQuery();
		    	  while(rs3.next())
		    	  {
				PreparedStatement ps2=con.prepareStatement("insert into scandidate_table values(?,?,?,?,?,?,?,?,?,?,?)");
				ps2.setInt(1,UserData.getC_id());
				ps2.setString(2,rs3.getString("c_name"));
				ps2.setString(3,rs3.getString("c_mob"));
				ps2.setString(4,rs3.getString("c_email"));
				ps2.setInt(5,UserData.getJob_id());
				ps2.setInt(6,o);
				ps2.setInt(7,c);
				ps2.setInt(8,e);
				ps2.setInt(9,a);
				ps2.setInt(10,n);
				ps2.setInt(11,UserData.getHr_id());
				int rs2=ps2.executeUpdate();
				if(rs2>0)
				{
					response.sendRedirect("shortlist.jsp");
				}
		    	  }
			}
			else if(fin.equals("Neuroticism") && n>=5)
			{
				PreparedStatement ps3 = con.prepareStatement("select * from candidate_table where c_id=?");
		    	  ps3.setInt(1,UserData.getC_id());
		    	  ResultSet rs3=ps3.executeQuery();
		    	  while(rs3.next())
		    	  {
				PreparedStatement ps2=con.prepareStatement("insert into scandidate_table values(?,?,?,?,?,?,?,?,?,?,?)");
				ps2.setInt(1,UserData.getC_id());
				ps2.setString(2,rs3.getString("c_name"));
				ps2.setString(3,rs3.getString("c_mob"));
				ps2.setString(4,rs3.getString("c_email"));
				ps2.setInt(5,UserData.getJob_id());
				ps2.setInt(6,o);
				ps2.setInt(7,c);
				ps2.setInt(8,e);
				ps2.setInt(9,a);
				ps2.setInt(10,n);
				ps2.setInt(11,UserData.getHr_id());
				int rs2=ps2.executeUpdate();
				if(rs2>0)
				{
					response.sendRedirect("shortlist.jsp");
				}
		    	  }
			}
			else
			{
				response.sendRedirect("notshortlist.jsp");
			}
			
		}
		catch(Exception k)
		{
			k.printStackTrace();
		}
	}

}
