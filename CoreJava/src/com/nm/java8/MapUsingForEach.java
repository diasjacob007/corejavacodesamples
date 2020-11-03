/**
 * 
 */
package com.nm.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.nm.java8.pojo.Employee;

/**
 * @author EVAAN
 *
 */
public class MapUsingForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		empMap.put(new Random().nextInt(10000),
				new Employee(new Random().nextInt(10000), "Martin", "martin@gmmail.com", 80000.00));
		empMap.put(new Random().nextInt(10000),
				new Employee(new Random().nextInt(10000), "Sean", "sean@hotmail.com", 90200.00));

		empMap.forEach((Key, Value) -> {
			System.out.println("Employee Id is: " + Key);
			System.out.println("Employee name is : " + Value.getEmpName());
		});

	}

}
