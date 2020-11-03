/**
 * 
 */
package com.nm.corejava;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author user
 *
 */
public class ComparableDemo {

	/**
	 * 
	 */
	public ComparableDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sortLaptopsBasedOnPrice();
	}

	private static void sortLaptopsBasedOnPrice() {

		ArrayList<ComparableLaptopPOJO> laptopLsts = new ArrayList<ComparableLaptopPOJO>();
		laptopLsts.add(new ComparableLaptopPOJO("Dell", 80, "Mdl101"));
		laptopLsts.add(new ComparableLaptopPOJO("HP", 75, "Mdl989"));
		laptopLsts.add(new ComparableLaptopPOJO("Apple", 100, "Mdl872"));

		System.out.println("Before Sorting....");
		for (ComparableLaptopPOJO lapTop : laptopLsts) {
			System.out.println(lapTop.getName() + " : " + lapTop.getModel() + " : " + lapTop.getPrice());
		}

		Collections.sort(laptopLsts);

		System.out.println("\nAfter Sorting....");
		for (ComparableLaptopPOJO lapTop : laptopLsts) {
			System.out.println(lapTop.getName() + " : " + lapTop.getModel() + " : " + lapTop.getPrice());
		}
	}

}
