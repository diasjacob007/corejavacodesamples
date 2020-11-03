/**
 * 
 */
package com.nm.java8;

import java.util.ArrayList;
import java.util.List;

import com.nm.java8.pojo.Student;

/**
 * @author EVAAN
 *
 */
public class Java8ForEachExample {

	/**
	 * 
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> studList = new ArrayList<>();
		studList.add(new Student("Marting", 6102));
		studList.add(new Student("Gilbert", 3434));
		studList.add(new Student("Jeevan", 3487));

		studList.forEach(s -> System.out.println(s));
	}

}
