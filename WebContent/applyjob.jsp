<%@ page import="com.vinay.hr.*" %>
<%@ page import="com.vinay.connect.*" %>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<head>
<title>Resitration Page</title>
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
                <li><a href="index.html"><i class="fa fa-key"></i>Home</a></li>
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
                
              <!--   <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>Admin Options</span>
                    </a>
                    <ul class="sub">
						
						<li><a href="deposit.html">Deposit</a></li>
                        <li><a href="withdraw.html">Withdraw</a></li>
                        <li><a href="transfer.html">Transfer</a></li>
                         <li><a href="delete.html">Delete Account</a></li>
                         <li><a href="view.jsp">View Accounts</a></li>
                          <li><a href="index.html"><i class="fa fa-key"></i> Log Out</a></li>
                    </ul>
                </li>
                 -->
                
                
                
                
                
                
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--sidebar end-->

<%int job_id=Integer.parseInt(request.getParameter("id")); 

   UserData.setJob_id(job_id);
   Connection con = Connect.getConnect();
   PreparedStatement ps1 = con.prepareStatement("select hr_id from job_table where job_id=?");
   ps1.setInt(1,UserData.getJob_id());
   ResultSet rs1=ps1.executeQuery();
   while(rs1.next())
   {
	   UserData.setHr_id(rs1.getInt("hr_id"));
   }
%>


<!--main content start-->
<section id="main-content">
	<section class="wrapper">
	<div class="form-w3layouts">
        
        <div class="row">
            <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Register Yourself With Us
                        </header>
                        <div class="panel-body">
                            <div class="position-center">
                               <form role="form" action="Addc" method="post" >
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Name</label>
                                    <input type="text" name="c_name" class="form-control" id="exampleInputEmail1" placeholder="Enter Name">
                                </div>
                          
                                 <div class="form-group">
                                    <label for="exampleInputEmail1">Contact </label>
                                    <input type="text" name="c_mob" class="form-control" id="exampleInputEmail1" placeholder="Enter contact">
                                </div>
                                
                      
                                 <div class="form-group">
                                    <label for="exampleInputEmail1"> Email </label>
                                    <input type="text" name="c_email" class="form-control" id="exampleInputEmail1" placeholder="Enter Email">
                                </div>
                                
                               
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Address </label>
                                    <input type="text" name="c_add" class="form-control" id="exampleInputEmail1" placeholder="Enter Address">
                                </div>
                                 <div class="form-group">
                                    <label for="exampleInputPassword1">Age</label>
                                    <input type="text" class="form-control" name="c_age" id="exampleInputPassword1" placeholder="Enter Age in years">
                                </div>
                                 <div class="form-group">
                                    <label for="exampleInputPassword1">Education</label>
                                    <input type="text" class="form-control" name="c_edu" id="exampleInputPassword1" placeholder="Enter Education">
                                </div>
                                
                                <button type="submit" class="btn btn-info">Submit</button>
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




<% 







%>
