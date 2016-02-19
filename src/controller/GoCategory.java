package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GoCategory
 */
@WebServlet("/GoCategory")
public class GoCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoCategory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		/*
		 author:donia
		 check which link click to go to specific page
		 */
		HttpSession session=request.getSession();
			
		if (request.getParameter("value").equals("mobiles")) {
		     response.sendRedirect("mobile.jsp");
		     
        } else if (request.getParameter("value").equals("laptop")) {
           response.sendRedirect("laptop.html");
        }else if (request.getParameter("value").equals("clothes")){
        	response.sendRedirect("clothes.html");
        }else if(request.getParameter("value").equals("shoes")){
        	response.sendRedirect("shoes.html");
        }
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
