package by.epam.jonline.basics_of_oop.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Payment {
	private int code;
	private double balance;
		
		public Payment(int code, double balance) {
			
			this.code = code;
			this.balance = balance;
			
		}
		
			public class Product {
				private String name;
				private double price;
				private int quantity;
				
				
				public Product(String name, double price, int quantity) {
					super();
					this.name = name;
					this.price = price;
					this.quantity = quantity;
				}
				
				
				public int getQuantity() {
					return quantity;
				}


				public void setQuantity(int quantity) {
					this.quantity = quantity;
				}


				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public double getPrice() {
					return price;
				}

				public void setPrice(double price) {
					this.price = price;
				}
				
				
				
				

				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + getEnclosingInstance().hashCode();
					result = prime * result + ((name == null) ? 0 : name.hashCode());
					long temp;
					temp = Double.doubleToLongBits(price);
					result = prime * result + (int) (temp ^ (temp >>> 32));
					result = prime * result + quantity;
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
					Product other = (Product) obj;
					if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
						return false;
					if (name == null) {
						if (other.name != null)
							return false;
					} else if (!name.equals(other.name))
						return false;
					if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
						return false;
					if (quantity != other.quantity)
						return false;
					return true;
				}


				@Override
				public String toString() {
					return "Product name=" + name + ", price=" + price ;
				}


				private Payment getEnclosingInstance() {
					return Payment.this;
				}
				
				
			}
			
			
			
		
			public int getCode() {
				return code;
			}


			public void setCode(int code) {
				this.code = code;
			}


			public double getBalance() {
				return balance;
			}


			public void setBalance(double balance) {
				this.balance = balance;
			}
			
			


			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				long temp;
				temp = Double.doubleToLongBits(balance);
				result = prime * result + (int) (temp ^ (temp >>> 32));
				result = prime * result + code;
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
				Payment other = (Payment) obj;
				if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
					return false;
				if (code != other.code)
					return false;
				return true;
			}


			public double buySeveralGoods(Product ... prod) {
				List<Product> product = new ArrayList<Product>();
				Collections.addAll(product, prod);
				for (Product products : product) {
					balance -= products.getPrice() * products.getQuantity();
				}
				
				return balance;
			}


			@Override
			public String toString() {
				return "Payment " + code + ", balance=" + balance ;
			}
			
			
}
