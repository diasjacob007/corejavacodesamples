/**
 * 
 */
package com.nm.corejava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author user
 *
 */
public class ComparatorDemo {

	/**
	 * 
	 */
	public ComparatorDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		lapTopNamePricePurchaseDateComparators();
	}

	private static void lapTopNamePricePurchaseDateComparators() {
		List<Laptop> lapLst = new ArrayList<>();
		lapLst.add(new Laptop("HP", 87, "Mdl9998", LocalDate.of(2019, 06, 12)));
		lapLst.add(new Laptop("Apple", 90, "Mdl7267", LocalDate.of(2018, 02, 10)));
		lapLst.add(new Laptop("Dell", 56, "Mdl3434", LocalDate.of(2017, 04, 6)));

		Comparator<Laptop> priceComparator = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop firstLaptop, Laptop secondLaptop) {
				if (firstLaptop.getPrice() > secondLaptop.getPrice()) {
					return 1;
				} else if (firstLaptop.getPrice() < secondLaptop.getPrice()) {
					return -1;
				} else {
					return 0;
				}
			}
		};

		System.out.println("Sorting laptops based on Price....");
		Collections.sort(lapLst, priceComparator);
		for (Laptop ltop : lapLst) {
			System.out.println(ltop.getPrice() + ":" + ltop.getName() + ":" + ltop.getModel());
		}

		Comparator<Laptop> laptopNameComparator = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop firstLaptop, Laptop seconLaptop) {
				return firstLaptop.getName().compareTo(seconLaptop.getName());
			}
		};

		System.out.println("\nSorting laptops based on Names....");
		Collections.sort(lapLst, laptopNameComparator);
		for (Laptop ltop : lapLst) {
			System.out.println(ltop.getName() + ":" + ltop.getPrice() + ":" + ltop.getModel());
		}

		Comparator<Laptop> laptopPurchaseDateComparator = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop firstLap, Laptop seconLaptop) {
				return firstLap.getPurchaseDate().compareTo(seconLaptop.getPurchaseDate());
			}
		};

		System.out.println("\n Sorting Laptops based on the Purchase Date....");
		Collections.sort(lapLst, laptopPurchaseDateComparator.reversed());

		lapLst.stream().forEach(laptop -> System.out.println(
				laptop.getPurchaseDate() + ":" + laptop.getModel() + ":" + laptop.getName() + ":" + laptop.getPrice()));

	}

}
