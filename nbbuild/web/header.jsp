<%-- 
    Document   : header
    Created on : Feb 22, 2016, 1:47:37 AM
    Author     : dono
--%>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The Shop</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="css/styles.css" />
<script language="javascript" type="text/javascript">
function clearText(field) {
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}
</script>
<script language="javascript" type="text/javascript" src="js/mootools-1.2.1-core.js"></script>
<script language="javascript" type="text/javascript" src="js/mootools-1.2-more.js"></script>
<script language="javascript" type="text/javascript" src="js/slideitmoo-1.1.js"></script>
<script language="javascript" type="text/javascript">
window.addEvents({
    'domready': function () { /* gallery slider top of page */
        new SlideItMoo({
            overallContainer: 'SlideItMoo_outer',
            elementScrolled: 'SlideItMoo_inner',
            thumbsContainer: 'SlideItMoo_items',
            itemsVisible: 5,
            elemsSlide: 3,
            duration: 200,
            itemsSelector: '.SlideItMoo_element',
            itemWidth: 140,
            showControls: 1
        });
    },

});
</script>
</head>
<body>
<div id="wrapper">


<!-- start of menu-->
  <div id="menu">
    <ul>
      <li><a href="#" class="current">Home</a></li>
    </ul>
    <div class="header_right" style="float:right; padding-top:15px;font-weight: bold; font-size: 15px;">
			<div class="cart box_1">
				<a href="checkout.html">
				<div class="total" style="color:white; font-size:15px;">
					<span class="simpleCart_total">$00.0</span> (<span id="simpleCart_quantity" class="simpleCart_quantity">0</span> items)</div>
					<i class="glyphicon" style="float:right;"> <img src="images/shopping_trolley.png" width="30px" height="30px"/></i></a>
				<p><a href="javascript:;" class="simpleCart_empty" style="color:white; font-size:15px;">Empty Cart</a></p>
				<div class="clearfix"> </div>
			</div>				 
		</div>
  </div>
  <!-- end of menu -->

  <!--start of header bar-->
  <div id="header_bar">
    <div id="header">
      <div class="right"></div>
      <h1><a href="#"> <img src="images/logo.png" alt="" /> <span>Online Store </span> </a></h1>
    </div>
    <div id="search_box">
      <form action="#" method="get">
        <input type="text" value="Enter keyword here..." name="q" size="10" id="searchfield" onfocus="clearText(this)" onblur="clearText(this)" />
        <input type="submit" name="Search" value="" alt="Search" id="searchbutton" />
      </form>
    </div>
  </div>
  <!-- end of header_bar -->
  <div class="cleaner"></div>
  <div id="sidebar">
    <div class="sidebar_top"></div>
    <div class="sidebar_bottom"></div>
    <!-- left sidebar_section-->
    <div class="sidebar_section">
     <%
            
           
     if(request.getSession().getAttribute("attr")== null){
     %>
                <h2>Members</h2>
      <form action="login.jsp" method="get">
        <label>E-mail</label>
        <input type="text" value="" name="e_mail" size="10" class="input_field" />
        <label>Password</label>
        <input type="password" value="" name="pass" class="input_field" />
        <a href="SignUp.jsp">Register</a><!-- go sign up page-->

        <input type="submit" name="login" value="Login" alt="Login" id="submit_btn" />
        
      </form>
                <%
            }else{
    %>
      
    <div><h1> welcome <h1><h4><%=request.getSession().getAttribute("attr")%><h4></div>
    <a href="LogOut">LogOut</a><br>
     <a href="#">View Profile</a>
                <%
    }

        
        
        %>
        
      <div class="cleaner"></div>
    </div>
    <!--categories-->
    <div class="sidebar_section">
      <h2>Categories</h2>
      
      
     	<jsp:useBean id="objConnect" scope="session" class="model.DbConnector"></jsp:useBean>
      <ul class="categories_list">
      <%
      ArrayList <String> allCategory=new ArrayList<>();
      ArrayList <String> allIds=new ArrayList<>();
      	allCategory=objConnect.getCategories();
        allIds=objConnect.getIdOfCategories();
      	
      	
        
      for(int i=0;i<allCategory.size();i++){
    	  %>
    	   
    
        <li><a href="GoCategory?value=<%out.println(allIds.get(i));%>" name="<% out.println(allCategory.get(i));
        %>"> <% out.println(allCategory.get(i));%></a></li>
        
      
      <% 
    	   
      }
      
      %>
      </ul>
      
      
    </div>
  </div>

  <!-- end of sidebar -->
  <div id="content">
    <div id="latest_product_gallery">
     <!-- <h2>Featured Products</h2>-->
     <!-- image slider top-->
      <div id="SlideItMoo_outer">
        <div id="SlideItMoo_inner">
          <div id="SlideItMoo_items">
            <div class="SlideItMoo_element"> <a href="#"> <img src="images/product_01.png" alt="" /></a> </div>
            <div class="SlideItMoo_element"> <a href="#"> <img src="images/product_02.png" alt="" /></a> </div>
            <div class="SlideItMoo_element"> <a href="#"> <img src="images/product_03.png" alt="" /></a> </div>
            <div class="SlideItMoo_element"> <a href="#"> <img src="images/product_04.png" alt="" /></a> </div>
            <div class="SlideItMoo_element"> <a href="#"> <img src="images/product_05.png" alt="" /></a> </div>
            <div class="SlideItMoo_element"> <a href="#"> <img src="images/product_06.png" alt="" /></a> </div>
            <div class="SlideItMoo_element"> <a href="#"> <img src="images/product_07.png" alt="" /></a> </div>
            <div class="SlideItMoo_element"> <a href="#"> <img src="images/product_08.png" alt="" /></a> </div>
          </div>
        </div>
      </div>
    </div>
    <!-- end of latest_content_gallery -->
    <!-- content section-->
    <div class="content_section">
      <h2>Welcome to Shop</h2>
      <p>Free CSS Templates are provided by TemplateMo.com for everyone. Feel free to use this template for your websites. Credit goes to <a href="#">Free Photos</a> for photos used in this template. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed et quam vitae ipsum vulputate varius vitae semper nunc. Quisque eget elit quis augue pharetra feugiat.</p>
    </div>

    <br>
        <br>
    <br>

            <br>

  </div>
  <!-- end of content -->
</div>
<!-- end of wrapper -->
