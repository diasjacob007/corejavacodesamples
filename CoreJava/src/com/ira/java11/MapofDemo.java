/**
 * 
 */
package com.ira.java11;

import java.util.List;
import java.util.Map;

/**
 * @author EVAAN
 *
 */
public class MapofDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mapOfMethodSample();

	}

	private static void mapOfMethodSample() {
		Map<Integer, String> map = Map.of(1, "Amal", 2, "Bijo", 3, "Dinil", 4, "Cibin");
		map.forEach((k, v) -> System.out.println("Key is:" + k + " Value is: " + v));

		List<String> lst1 = List.of("P1", "Q1");
		List<String> lst2 = List.of("P2", "Q2");

		Map<Integer, List<String>> map2 = Map.of(4, lst1, 2, lst2);
		System.out.println("Map data is: \n" + map2);

		map2.forEach((k, v) -> System.out.println(k + "" + v));
	}

}
