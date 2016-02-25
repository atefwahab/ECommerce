package model;

<<<<<<< HEAD
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import dao.Product;
import java.util.Vector;
import util.DesEncrypter;

public class DbConnector {

    String url="jdbc:mysql://localhost:3306/";
    String Driver="com.mysql.jdbc.Driver";
    String dbname="ecommerce";
    String username="root";
    String password="Ab1234567";
    Connection connection;
    Statement statement;
    ResultSet resultSet;
	public DbConnector() {
		 try{
	            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	            connection = (Connection) DriverManager.getConnection(url+dbname,username,password);
	        }catch(Exception e){e.printStackTrace();}    
	}
	
	/* 
	  @author: donia
	  function get name of categories from DB
	  return ArrayList
	  */
	public ArrayList<String> getCategories(){
		
		ArrayList<String> categories=new ArrayList<>();
		
		String sql = "select * from categories";
		  try {
			statement=(Statement) connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				categories.add(resultSet.getString(2));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return categories;
		
	}
        
        
        /* 
	  @author: donia
	  function get id of categories from DB
	  return ArrayList
	  */
	public ArrayList<String> getIdOfCategories(){
		
		ArrayList<String> ids=new ArrayList<>();
		
		String sql = "select * from categories";
		  try {
			statement=(Statement) connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				ids.add(resultSet.getString(1));
                                
				
			}
			
=======

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


/**
 * 
 * @author Atef
 * this class used to connect to database.
 *
 */
public class DbConnector {

	 /*
    	Database Connection variables
	  */
	Connection con;
	String driver="com.mysql.jdbc.Driver";
	String dbUrl="jdbc:mysql://localhost:3306/ecommerce";
	String dbUserName="root";
	String pass="";
	Statement state;
	String query;
	ResultSet resultSet;
	
	
	/**
	 * @author atef
	 * this is the constructor.
	 */
	public DbConnector(){
		try {
			DriverManager.registerDriver(new Driver());
			con=DriverManager.getConnection(dbUrl,dbUserName,pass);
            
            //create Statement
            state=con.createStatement();
            
>>>>>>> origin/master
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
<<<<<<< HEAD

		return ids;
		
	}
        
	
	
	
	
	/* 
	  author: donia
	  function insert data of user in DB
	  return nothing
	  */


	public void insertInDB(String name, String date, String pass, String job, String e_mail, String credit_Limit,
			String address, String interest) {
		// TODO Auto-generated method stub
                 DesEncrypter encrypter = new DesEncrypter();
                 String passEncrypt=encrypter.encrypt(pass);
                 
                 
		try {
			statement=(Statement) connection.createStatement();
			String sql = "INSERT INTO users(name,birthday,Password,job,email,credit_limit,address,interests) VALUES ('"+name+"','"+date+"','"+passEncrypt+"','"+job+"','"+e_mail+"','"+credit_Limit+"','"+address+"','"+interest+"')";	
			
                        statement.executeUpdate(sql);
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
                
                DesEncrypter encrypter = new DesEncrypter();
                String password=encrypter.encrypt(pass);
		String sql = "select * from users where email = '"+e_mail+"'and Password='"+password+"'";
		  try {
			statement=(Statement) connection.createStatement();
			resultSet = statement.executeQuery(sql);
			 flag= resultSet.next();
			
=======
	}
	
	
	
	// this is a trial method
	public void selectAll(){
		
		String query="SELECT * FROM `users`";
		try {
			resultSet =state.executeQuery(query);
			// to print output
			while(resultSet.next()){
				for(int i=0;i<resultSet.getMetaData().getColumnCount();i++){
						
					System.out.println(resultSet.getString(i));
				}
				
			}
>>>>>>> origin/master
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
<<<<<<< HEAD

		return flag;
		
	}
        
        
        /**
         * this method used for get Vector of products
         * @param categoryId an int represent the id of the category_id in db
         * @author Atef.
         * @return vector of products from that category
         */
        public Vector<Product> getProducts(int categoryId){
            
            Vector<Product> products = new Vector<>();
            String query="SELECT * FROM `product` WHERE `category_id`="+categoryId;
            System.out.println(query);
            try {
                statement=(Statement)connection.createStatement();
                 resultSet=statement.executeQuery(query);
                
                // add products to vector
                while(resultSet.next()){
                    Product product = new Product();
                    product.setId(resultSet.getInt("product_id"));
                    product.setName(resultSet.getString("product_name"));
                    product.setPrice(resultSet.getDouble("product_price"));
                    product.setQuantity(resultSet.getInt("quantity"));
                    product.setCategoryId(resultSet.getInt("category_id"));
                    product.setDescription(resultSet.getString("product_description"));
                    product.setImagePath(resultSet.getString("image_path"));
                    
                    products.addElement(product);
                   
               //end of while             
                }
                
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            return products;
        }
	/*
        author:donia
        check if exist user the same email register or not
        */
	
	public boolean checkDublicateUserInSignUp(String e_mail){
            boolean flag=true;
            {
                try {
                String query="SELECT * FROM `users` WHERE `email`='"+e_mail+"'";
                 System.out.println(query);
            
                statement=(Statement)connection.createStatement();
                 resultSet=statement.executeQuery(query);
                
                    
                        // add products to vector
                        flag= resultSet.next();
                        System.out.println("inside chick dublicate "+flag);
                        
                } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    }
            return flag;
        }
	
=======
		
	}
	
// end of DB Class.	
>>>>>>> origin/master
}
