package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProductTable {

	public static void main(String[] args) throws SQLException {
		
		ProductTable product = new ProductTable();
		product.updateProduct();
		
		Connection connection = DBConnection.makeConnection();
		PreparedStatement statement = 
				connection.prepareStatement
				("update hr.product1 set productName = ?, productPrice = ?, qoh = ? where ProductId = ?");
		statement.setInt(4, product.getProductId());
		statement.setString(1, product.getProductName());
		statement.setInt(2, product.getProductPrice());
		statement.setInt(3, product.getQoh());
		
		statement.executeUpdate();
		
		System.out.println("record updated sucessfully");
	}

}
