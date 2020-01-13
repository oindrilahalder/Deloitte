package com.cms.deloitte.dbconn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	public static Connection makeConnection() {
		Connection connection=null;
		
		//1.load the driver connection
				try {
					FileReader reader= new FileReader("e:\\deloittte\\mydb.properties");
				    Properties properties= new Properties();
				    properties.load(reader); 
				    
				    String driver= properties.getProperty("driver");
				    String url= properties.getProperty("url");

				    String username= properties.getProperty("username");

				    String password= properties.getProperty("password");

				    
					Class.forName(driver);
					//System.out.println("Driver loaded");

					//2.Obtain Database connection
					connection=DriverManager.getConnection(url, username, password);
					//System.out.println("Connected");
		
				} 
				catch (ClassNotFoundException e) 
				{
					
					e.printStackTrace();
				}
				  catch (SQLException e) 
				{
					
					e.printStackTrace();
				} 
				catch (FileNotFoundException e) 
				{
					
					e.printStackTrace();
				} 
				catch (IOException e)
				{
	
					e.printStackTrace();
				}
				return connection;
			
	

}}
