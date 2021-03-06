package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DbConnector;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		/*
		  author: donia
		 get email and password from textfield then check from database using method 
		 if true go to another page else stil in first page
		 */
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String pass=request.getParameter("pass");
		String e_mail=request.getParameter("e_mail");
		
		HttpSession session=request.getSession(true);
		session.setAttribute("e_emil", e_mail);
		
		DbConnector obj=new DbConnector();
		if(obj.chickLogin(pass,e_mail)){
                        session.setAttribute("attr", e_mail);
			response.sendRedirect("index.jsp");
		}else
		{
			response.sendRedirect("index.jsp");
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
