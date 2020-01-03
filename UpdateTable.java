package jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {

	public static void main(String[] args) throws SQLException {
		
		Customers customer = new Customers();
		customer.updateCustomer();
		
		Connection connection = DBConnection.makeConnection();
		PreparedStatement statement = 
				connection.prepareStatement
				("update hr.customer set customerName = ?, customerAddress = ?, billAmount = ? where customerId = ?");
		statement.setInt(4, customer.getCustomerId());
		statement.setString(1, customer.getCustomerName());
		statement.setString(2, customer.getCustomerAddress());
		statement.setInt(3, customer.getBillAmount());
		
		statement.executeUpdate();
		
		System.out.println(customer.getCustomerName()+" ,your record updated sucessfully");
	}

}
