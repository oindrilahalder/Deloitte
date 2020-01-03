package jdbcdemos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDisplay {

	public static void main(String[] args) throws SQLException {
		
		ProductTable product = new ProductTable();
		
		Connection connection = DBConnection.makeConnection();
		
		Statement stat = connection.createStatement();
		ResultSet res = stat.executeQuery("select * from hr.product1");
		
		while(res.next()) {
			System.out.print(res.getInt(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getInt(3)+" ");
			System.out.println(res.getInt(4)+" ");
		}
		
		stat.close();
		connection.close();

	}

}
