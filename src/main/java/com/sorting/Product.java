package com.sorting;

import java.util.Comparator;



public class Product{

	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	/*
	 * Comparator - used as anonymous inner classes 
	 * compares prices
	 */
	public static Comparator<Product> priceComparator = new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
			return (int) (o1.getPrice() - o2.getPrice());
		}
		
	};
	
	/*
	 * Compares id's
	 */
	
	public static Comparator<Product> idComparator = new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
						return (o2.getId() - o1.getId());
		}
	};
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[id= "+ this.id +
			  	 ", name =" + this.name +
			  	 ", price= "+this.price +
			  	 " ]";
	}
	
	
	
}
