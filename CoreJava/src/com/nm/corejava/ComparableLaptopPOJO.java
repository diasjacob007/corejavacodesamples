/**
 * 
 */
package com.nm.corejava;

/**
 * @author user
 *
 */
public class ComparableLaptopPOJO implements Comparable<ComparableLaptopPOJO> {

	/**
	 * 
	 */
	private String name;
	private int price;
	private String model;

	public ComparableLaptopPOJO() {
	}

	public ComparableLaptopPOJO(String name, int price, String model) {
		super();
		this.name = name;
		this.price = price;
		this.model = model;
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

	@Override
	public int compareTo(ComparableLaptopPOJO o) {
		//Sorting based on Laptop Prices
//		if (this.getPrice() > o.getPrice()) {
//			return 1;
//		} else if (this.getPrice() < o.getPrice()) {
//			return -1;
//		} else {
//			return 0;
//		}
		//Sorting based on Laptop Names
		return this.getName().compareTo(o.getName());
	}

}
