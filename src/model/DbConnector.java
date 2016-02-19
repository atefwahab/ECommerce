package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DbConnector {

	String url="jdbc:mysql://localhost:3306/";
    String Driver="com.mysql.jdbc.Driver";
    String dbname="ecommerce";
    String username="root";
    String password="Ab1234567";
    Connection con;
    Statement st;
    ResultSet rs;
	public DbConnector() {
		 try{
	            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	            con = (Connection) DriverManager.getConnection(url+dbname,username,password);
	        }catch(Exception e){e.printStackTrace();}    
	}
	
	/* 
	  author: donia
	  function get name of categories from DB
	  return ArrayList
	  */
	public ArrayList<String> getCategories(){
		
		ArrayList<String> categories=new ArrayList<>();
		
		String sql = "select * from categories";
		  try {
			st=(Statement) con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()){
				categories.add(rs.getString(2));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return categories;
		
	}
	
	
	
	
	/* 
	  author: donia
	  function insert data of user in DB
	  return nothing
	  */


	public void insertInDB(String name, String date, String pass, String job, String e_mail, String credit_Limit,
			String address, String interest) {
		// TODO Auto-generated method stub
		try {
			st=(Statement) con.createStatement();
			String sql = "INSERT INTO users(name,birthday,Password,job,email,credit_limit,address,interests) VALUES ('"+name+"','"+date+"','"+pass+"','"+job+"','"+e_mail+"','"+credit_Limit+"','"+address+"','"+interest+"')";	
			st.executeUpdate(sql);
			
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}


	/* 
	  author: donia
	  function check e_mail and password from DB to login
	  return boolean
	  */
	public boolean chickLogin(String pass, String e_mail) {
		// TODO Auto-generated method stub
		boolean flag=false; 
		String sql = "select * from users where email = '"+e_mail+"'and Password='"+pass+"'";
		  try {
			st=(Statement) con.createStatement();
			rs = st.executeQuery(sql);
			 flag= rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
		
	}
		
	
	
	
}
