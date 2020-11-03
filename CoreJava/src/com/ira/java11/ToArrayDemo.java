/**
 * 
 */
package com.ira.java11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author EVAAN
 *
 */
public class ToArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);

		System.out.println("Initially created ArrayList" + arrayList);

		// Using Lambda Expression -> how to invoke toArray method
		Integer[] array = arrayList.stream().toArray(size -> new Integer[size]);
		System.out.println("Newly created Array using lambda: " + Arrays.toString(array));

		// Using Constructor reference, how to invoke toArray method
		Integer[] array2 = arrayList.stream().toArray(Integer[]::new);
		System.out.println("Array using Constructor reference: " + Arrays.toString(array2));
	}
}
