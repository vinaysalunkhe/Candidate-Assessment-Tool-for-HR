<%@ page import="java.sql.*" %>
<%@ page import="com.vinay.connect.*" %>
<%@ page import="com.vinay.hr.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>Test Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="css/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/style-responsive.css" rel="stylesheet"/>
<!-- font CSS -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="css/font.css" type="text/css"/>
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<script src="js/jquery2.0.3.min.js"></script>
</head>
<body>
<section id="container">
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">

    <a href="index.html" class="logo">
      Candidate
    </a>
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars"></div>
    </div>
</div>
<!--logo end-->


<div class="top-nav clearfix">
    <!--search & user info start-->
    <ul class="nav pull-right top-menu">
        <!-- user login dropdown start-->
        <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <span class="username">Candidate</span>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu extended logout">
               <!--  <li><a href="#"><i class=" fa fa-suitcase"></i>Profile</a></li> -->
               <!--  <li><a href="#"><i class="fa fa-cog"></i> Settings</a></li> -->
                <li><a href="index.html"><i class="fa fa-key"></i> Log Out</a></li>
            </ul>
        </li>
        <!-- user login dropdown end -->
       
    </ul>
    <!--search & user info end-->
</div>
</header>
<!--header end-->
<!--sidebar start-->
<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                    <a href="index.html">
                        <i class="fa fa-dashboard"></i>
                        <span>Dashboard</span>
                    </a>
                </li>
                
               <!--  <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>HR Options</span>
                    </a>
                    <ul class="sub">
						<li><a href="addjob.html">Add Job</a></li>
                        
                        <li><a href="deletejob.html">Delete Job</a></li>
                         <li><a href="index.html"><i class="fa fa-key"></i> Log Out</a></li>
                        
                        
                    </ul>
                </li>
                 -->
                
                
                
                
                
                
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--sidebar end-->
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
	<div class="form-w3layouts">
        
        <div class="row">
            <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            OCEAN Personality Test
                        </header>
                        <div class="panel-body">
                            <div class="position-center">
                             <form action="Calculate"  method="post"    ">
                             
                               
                               <table class="table">
  <thead>
     <tr>
			      <th scope="col">Que ID.</th>
			      <th scope="col">Question</th>
			       <th scope="col">Option 1</th>
			      <th scope="col"> Option 2</th>
			      <th scope="col">Option 3</th>
			       <th scope="col">Option 4</th>
			       <th scope="col">Option 5</th>
			       
			        
			
    </tr>
  </thead>
		
	<%
	try
	{
		Connection con=Connect.getConnect();
		PreparedStatement ps1=con.prepareStatement("select * from question_table");
		
		ResultSet rs1=ps1.executeQuery();
		  
		while(rs1.next())
		{
			%>
							  <tbody>
							    <tr>
							      
							       <td><%=rs1.getInt(1)%></td>
							       
					             <td><%=rs1.getString(2)%></td>
					      
					      <td><input type="radio" id="html" name="q<%=rs1.getInt(1)%>" value="<%=rs1.getString(3)%>">
                           <label for="html">Strongly Agree</label></td>
                            <td><input type="radio" id="html" name="q<%=rs1.getInt(1)%>" value="<%=rs1.getString(4)%>">
                           <label for="html"> Agree</label></td>
                            <td><input type="radio" id="html" name="q<%=rs1.getInt(1)%>" value="<%=rs1.getString(5)%>">
                           <label for="html">Neutral</label></td>
                            <td><input type="radio" id="html" name="q<%=rs1.getInt(1)%>" value="<%=rs1.getString(6)%>">
                           <label for="html"> Disagree</label></td>
                            <td><input type="radio" id="html" name="q<%=rs1.getInt(1)%>" value="<%=rs1.getString(7)%>">
                           <label for="html">Strongly Disagree</label></td>
					    
					     <%--  <%int id; %>
					        <td><a href="deletejob.jsp?id=<%=rs1.getInt(1)%>"/a>Delete</td> --%>
					      
							    </tr>
			<% 
		}
		
		
		 
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	   %>
	   </tbody>
		</table>
		  <input type="submit" value="Submit">
</form>
		
                           
                            </div>

                        </div>
                    </section>

            </div>
           
          
       
       

     

        

        

       

       

        <!-- page end-->
        </div>
</section>
 <!-- footer -->
		 
		 
  <!-- / footer -->
</section>

<!--main content end-->
</section>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.dcjqaccordion.2.7.js"></script>
<script src="js/scripts.js"></script>
<script src="js/jquery.slimscroll.js"></script>
<script src="js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="js/jquery.scrollTo.js"></script>
</body>
</html>