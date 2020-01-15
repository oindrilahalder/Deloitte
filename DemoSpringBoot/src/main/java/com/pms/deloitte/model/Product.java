package com.pms.deloitte.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="hr" , name="product101")
public class Product implements Serializable 
{
		@Id
		private int productId;
		
		@Column
		private String productName;
		
		@Column
		private int price;
		
		@Column
		private int qoh;
		
		public Product() {

		}

		/**
		 * @return the productId
		 */
		public int getProductId() {
			return productId;
		}

		/**
		 * @param productId the productId to set
		 */
		public void setProductId(int productId) {
			this.productId = productId;
		}

		/**
		 * @return the productName
		 */
		public String getProductName() {
			return productName;
		}

		/**
		 * @param productName the productName to set
		 */
		public void setProductName(String productName) {
			this.productName = productName;
		}

		/**
		 * @return the price
		 */
		public int getPrice() {
			return price;
		}

		/**
		 * @param price the price to set
		 */
		public void setPrice(int price) {
			this.price = price;
		}

		/**
		 * @return the qoh
		 */
		public int getQoh() {
			return qoh;
		}

		/**
		 * @param qoh the qoh to set
		 */
		public void setQoh(int qoh) {
			this.qoh = qoh;
		}

		public Product(int productId, String productName, int price, int qoh) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.qoh = qoh;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + price;
			result = prime * result + productId;
			result = prime * result + ((productName == null) ? 0 : productName.hashCode());
			result = prime * result + qoh;
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (price != other.price)
				return false;
			if (productId != other.productId)
				return false;
			if (productName == null) {
				if (other.productName != null)
					return false;
			} else if (!productName.equals(other.productName))
				return false;
			if (qoh != other.qoh)
				return false;
			return true;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", qoh="
					+ qoh + "]";
		}
		
}
