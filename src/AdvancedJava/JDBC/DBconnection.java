package AdvancedJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
//import.java.sql.Statement;
/**
 *
 *
 * @author Alok Kumar
 */
public class DBconnection {
	static Connection con = null;
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","Al9ok@1435");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return con;
	}
	
	
}

