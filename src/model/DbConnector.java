package model;


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
            
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	// this is a trial method
	public void selectAll(){
		
		String query="SELECT * FROM `users`";
		try {
			resultSet =state.executeQuery(query);
			// to print output
			while(resultSet.next()){
				for(int i=0;i<resultSet.getMetaData().getColumnCount();i++){
						
					System.out.println(resultSet.getString(i+1));
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
// end of DB Class.	
}
