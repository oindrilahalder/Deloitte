package objectdemo;

public class Product {
	
	private int productId;
	private String productName;
	private int qoh;
	private int price;
	
	public Product() {
		
	}
	
	public Product(int productId, String productName, int qoh, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.qoh = qoh;
		this.price = price;
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
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", qoh=" + qoh + ", price=" + price
				+ "]";
	}
	
	
}
