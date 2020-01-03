package jdbcdemos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableDemo {

	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnection.makeConnection();
		Statement stat = connection.createStatement();
		
		String insertQuery = "insert into hr.customer values(106,'bibhu','bhub',5000)";
		
		int rowsAffected = stat.executeUpdate(insertQuery);
		System.out.println("insert success with "+rowsAffected+" rows");

	}

}
