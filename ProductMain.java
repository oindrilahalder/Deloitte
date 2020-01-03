package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductMain {

	public static void main(String[] args) throws SQLException {
		
		ProductTable product = new ProductTable();
		product.accept();
		
		Connection connection = DBConnection.makeConnection();
		PreparedStatement statement = 
				connection.prepareStatement("insert into hr.product1 values(?,?,?,?)");
		statement.setInt(1, product.getProductId());
		statement.setString(2, product.getProductName());
		statement.setInt(3, product.getProductPrice());
		statement.setInt(4, product.getQoh());
		
		statement.executeUpdate();
		
		System.out.println("record saved sucessfully");
		
	}

}
