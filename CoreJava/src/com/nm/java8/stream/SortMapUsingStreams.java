/**
 * 
 */
package com.nm.java8.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.nm.java8.pojo.Employee;

/**
 * @author EVAAN
 *
 */
public class SortMapUsingStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		sortingPrimitiveHashMap();
		sortingCustomHashMap();
	}

	/**
	 * 
	 */
	private static void sortingCustomHashMap() {
		Map<Employee, Integer> empMap = new HashMap<>();
		empMap.put(new Employee(1001, "Ajith", "HR", 30000.00), 10);
		empMap.put(new Employee(1003, "Amal", "HR", 35000.00), 13);
		empMap.put(new Employee(1006, "Cinoj", "NSS", 20000.00), 11);
		empMap.put(new Employee(1001, "Xavier", "IT", 50000.00), 12);
		empMap.put(new Employee(1001, "Don", "IT", 55000.00), 13);
		empMap.put(new Employee(1001, "Ajith", "HR", 30000.00), 10);

		// Sort Employees based on their salary
		empMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpSalary).reversed()))
				.forEach(emp -> System.out.println(emp.getKey().getEmpSalary() + " : " + emp.getKey().getEmpName()));
	}

	/**
	 * 
	 */
	private static void sortingPrimitiveHashMap() {
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("Bijoy", 40);
		myMap.put("Amal", 42);
		myMap.put("Sony", 50);
		myMap.put("Cibin", 35);
		myMap.put("Dany", 74);
		myMap.put("Nikhil", 87);
		myMap.put("Xavier", 60);
		myMap.put("Bijoy", 98);
		myMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------");
		myMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
