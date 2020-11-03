package com.ira.java11;

import java.util.List;
import java.util.stream.Collectors;

public class StringClassEnhancements {

	public static void main(String[] args) {
//		isBlank();
//		usingLinesMethod();
//		usingStripMethod();
//		

		String danishLetterUnicodes = "\u00C6\u00D8\u00C5";
		System.out.println("Danish Letters are: " + danishLetterUnicodes);
	}

	private static void usingRepeatMethod() {
		// 4. Using the repeat() - Used to iterate a word as per the count we have
		// provided
		String value = "Java11";
		System.out.println(value.repeat(10));
	}

	private static void usingStripMethod() {
		// 3. Using strip() - To remove the leading as well as the trailing whitespaces
		String str1 = " Java11 ";
		System.out.println("The stripped version of: " + str1 + " is: " + str1.strip());
	}

	private static void usingLinesMethod() {
		// 2. Using the lines()
		String str = "Hello \n" + " Welcome to \n" + " Java 11 \n" + " new features";
		List<String> lineObjects = str.lines().collect(Collectors.toList());
		System.out.println("Line Objects are : ");
		lineObjects.stream().forEach(System.out::println);
	}

	private static void isBlank() {
		// 1. Using isBlank()
		String val = " ";
		System.out.println(val.isBlank());
	}

}
