package com.nm.exam;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {

	public HashMapTest() {
		Set<String> empNames = new HashSet<String>();
		Map<Integer, String> testMap = new TreeMap<Integer, String>();
		testMap.put(1, "Amal");
		testMap.put(5, "Aman");
		testMap.put(9, "Cibin");
		testMap.put(4, "Bibin");
		testMap.put(90, "Aman");
		testMap.put(45, "Cibin");
		testMap.put(33, "Bibin");

		for (Map.Entry<Integer, String> me : testMap.entrySet()) {
			System.out.println(me.getKey() + ":" + me.getValue());
			empNames.add(me.getValue());
		}
		System.out.println("empNames List is: " + empNames);
	}

	public static void main(String[] args) {
		new HashMapTest();
	}

}
