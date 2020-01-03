package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) throws SQLException{
		
		Connection connection = DBConnection.makeConnection();
		Statement stat = connection.createStatement();
		
		String query = "create table hr.salary(salary integer,bonus integer)";
		//String query = "drop table hr.salary";
		
		stat.execute(query);
		
		System.out.println("done");
	}

}
