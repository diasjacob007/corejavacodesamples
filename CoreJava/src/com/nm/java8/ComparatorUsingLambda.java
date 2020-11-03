/**
 * 
 */
package com.nm.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.nm.java8.pojo.Student;

/**
 * @author EVAAN
 *
 */
public class ComparatorUsingLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> studList = new ArrayList<>();
		studList.add(new Student("Marting", 6102));
		studList.add(new Student("Gilbert", 3434));
		studList.add(new Student("Jeevan", 3487));

		Collections.sort(studList, (stud1, stud2) -> stud1.getStudName().compareTo(stud2.getStudName()));

		System.out.println("Sorting based on Student Name:");

		studList.forEach(System.out::println);

		System.out.println("Sorting based on Student Id:");

		Collections.sort(studList, (stud1, stud2) -> stud1.getStudId() - stud2.getStudId());

		studList.forEach(System.out::println);
	}

}
