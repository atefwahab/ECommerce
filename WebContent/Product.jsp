<%-- 
    Document   : Product
    Created on : Feb 20, 2016, 9:37:00 PM
    Author     : atef
--%>

<%@page import="java.util.Vector"%>
<%@page import="dao.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%
               Vector<Product> products=(Vector<Product>)request.getAttribute("products"); 
            %>
    </head>
    <body>
        
        <%
            
            for(int i=0;i<products.size();i++){
                
                out.println("<h1>Product Name: "+products.elementAt(i).getName()+"</h1>");
                out.println("<h1>Product description: "+products.elementAt(i).getDescription()+"</h1>");
                out.println("<img src=\""+products.elementAt(i).getImagePath()+"\"/>");
                out.println("<h1> Product Category: "+products.elementAt(i).getCategoryId()+"</h1>");
                out.println("<h1> Product Id: "+products.elementAt(i).getId()+"</h1>");
                out.println("<h1> Product Price: "+products.elementAt(i).getPrice()+"</h1>");
                out.println("<h1> Product Quantity: "+products.elementAt(i).getQuantity()+"</h1>");
                
            }
        %>
    </body>
</html>
