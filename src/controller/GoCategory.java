package controller;

import dao.Product;
import java.io.IOException;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DbConnector;

/**
 * Servlet implementation class GoCategory
 */
@WebServlet("/GoCategory")
public class GoCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       DbConnector dbConnector;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoCategory() {
        super();
        // object from database model class
        dbConnector = new DbConnector();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
                
                
		
		/*
		 @author:donia
		 check which link click to go to specific page
		 */
		/*HttpSession session=request.getSession();
			
		if (request.getParameter("value").equals("mobiles")) {
		     response.sendRedirect("mobile.jsp");
		     
        } else if (request.getParameter("value").equals("laptop")) {
           response.sendRedirect("laptop.html");
        }else if (request.getParameter("value").equals("clothes")){
        	response.sendRedirect("clothes.html");
        }else if(request.getParameter("value").equals("shoes")){
        	response.sendRedirect("shoes.html");
        }
                */
                RequestDispatcher dispatcher= request.getRequestDispatcher("Product.jsp");
                
                /**
                 * 
                 * @author atef
                 * this part of code is used to create a bean
                 */
                Vector<Product> products=dbConnector.getProducts(1);
                for(int i=0;i<products.size();i++){
                    System.out.println("-------------------------------");
                    System.out.print(products.elementAt(i).getName());
                    System.out.print(products.elementAt(i).getDescription());
                    System.out.print(products.elementAt(i).getPrice());
                    System.out.print(products.elementAt(i).getQuantity());
                    System.out.print(products.elementAt(i).getCategoryId());
                    
                }
                
                // add the vector of products to the request paramters 
                request.setAttribute("products",products);
                dispatcher.forward(request, response);
                
                
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
