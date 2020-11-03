/**
 * 
 */
package com.nm.corejava;

import java.time.LocalDate;

/**
 * @author user
 *
 */
public class Laptop {

	private String name;
	private int price;
	private String model;
	private LocalDate purchaseDate;

	public Laptop() {
	}

	public Laptop(String name, int price, String model, LocalDate purchaseDate) {
		super();
		this.name = name;
		this.price = price;
		this.model = model;
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", model=" + model + "]";
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}
