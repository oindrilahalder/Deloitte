package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdvanceDemo {

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
		Statement stat = connection.createStatement
				(ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_UPDATABLE);
		
		//4.result
		System.out.println("before");
		ResultSet res = stat.executeQuery("select hr.customer.* from hr.customer");
		
		while(res.next()) {
			System.out.print(res.getInt(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+" ");
			System.out.println(res.getInt(4)+" ");
		}
		
		res.moveToInsertRow();
		res.updateInt("customerId", 107);
		res.updateString("customerName", "OD");
		res.updateString("customerAddress", "kota");
		res.updateInt("billAmount", 6500);
		res.insertRow();
	    
		res.absolute(3);
		res.updateInt(1,108);
		res.updateString(2,"sam");
		res.updateString(3,"patna");
		res.updateInt(4,1500);
		res.updateRow();
		
		res.beforeFirst();      
		System.out.println("After...");
		
		ResultSet res1 = stat.executeQuery("select hr.customer.* from hr.customer");
		
		while(res1.next()) {
			System.out.print(res1.getInt(1)+" ");
			System.out.print(res1.getString(2)+" ");
			System.out.print(res1.getString(3)+" ");
			System.out.println(res1.getInt(4)+" ");
		}
		
		//5.close
		stat.close();
		connection.close();
	}

}
