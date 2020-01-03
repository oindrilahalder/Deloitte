package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.load appropriate driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		
		//2.obtain the database connection
		Connection connection = 
				DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","admin");
		System.out.println("Connected");
		
		//3.statements
		Statement stat = connection.createStatement();
		
		//4.result
		ResultSet res = stat.executeQuery("select * from hr.customer");
		
		while(res.next()) {
			System.out.print(res.getInt(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+" ");
			System.out.println(res.getInt(4)+" ");
		}
		
		//5.close
		stat.close();
		connection.close();
	}

}
