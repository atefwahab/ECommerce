package model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import dao.Product;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnector {

	String url="jdbc:mysql://localhost:3306/";
    String Driver="com.mysql.jdbc.Driver";
    String dbname="ecommerce";
    String username="root";
    String password="";
    Connection connection;
    Statement statement;
    ResultSet rs;
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
			rs = statement.executeQuery(sql);
			
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
			statement=(Statement) connection.createStatement();
			String sql = "INSERT INTO users(name,birthday,Password,job,email,credit_limit,address,interests) VALUES ('"+name+"','"+date+"','"+pass+"','"+job+"','"+e_mail+"','"+credit_Limit+"','"+address+"','"+interest+"')";	
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
		String sql = "select * from users where email = '"+e_mail+"'and Password='"+pass+"'";
		  try {
			statement=(Statement) connection.createStatement();
			rs = statement.executeQuery(sql);
			 flag= rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
                 rs=statement.executeQuery(query);
                
                // add products to vector
                while(rs.next()){
                    Product product = new Product();
                    product.setId(rs.getInt("product_id"));
                    product.setName(rs.getString("product_name"));
                    product.setPrice(rs.getDouble("product_price"));
                    product.setQuantity(rs.getInt("quantity"));
                    product.setCategoryId(rs.getInt("category_id"));
                    product.setDescription(rs.getString("product_description"));
                    product.setImagePath(rs.getString("image_path"));
                    
                    products.addElement(product);
                   
               //end of while             
                }
                
                rs.close();
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            return products;
        }
		
	
	
	
}
