package jdbcdemos;

import java.util.Scanner;

public class ProductTable {
	private int productId;
	private String productName;
	private int productPrice;
	private int qoh;
	
	public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id : "); productId = scanner.nextInt();
        System.out.println("Enter product name : "); productName = scanner.next();
        System.out.println("Enter product price : "); productPrice = scanner.nextInt();
        System.out.println("Enter qoh : "); qoh = scanner.nextInt();
    }
	
	public ProductTable(){
		
	}
	
	
	public ProductTable(int productId, String productName, int productPrice, int qoh) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.qoh = qoh;
	}

	
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	@Override
	public String toString() {
		return "ProductTable [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", qoh=" + qoh + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
		result = prime * result + qoh;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductTable other = (ProductTable) obj;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice != other.productPrice)
			return false;
		if (qoh != other.qoh)
			return false;
		return true;
	}

	public void updateProduct() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter product id to update : "); productId = scanner.nextInt();
	        System.out.println("Enter new product name : "); productName = scanner.next();
	        System.out.println("Enter new product price : "); productPrice = scanner.nextInt();
	        System.out.println("Enter new qoh : "); qoh = scanner.nextInt();
    }
	
	public void deleteProduct() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter product id to delete : ");
	        productId = scanner.nextInt();
	       
   }
}
	
