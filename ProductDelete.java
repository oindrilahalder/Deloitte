package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDelete {

	public static void main(String[] args) throws SQLException {
		ProductTable product = new ProductTable();
		product.deleteProduct();
		
		Connection connection = DBConnection.makeConnection();
		PreparedStatement statement = 
				connection.prepareStatement
				("delete hr.product1 where ProductId = ?");
		statement.setInt(1, product.getProductId());
		
		statement.executeUpdate();
		
		System.out.println("record deleted sucessfully");

	}

}
