/**
 * 
 */
package com.ira.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author EVAAN
 *
 */
public class RegexExample1 {
	private static void patternMatcherFirstWay() {
		// 1st way
		Pattern pattern = Pattern.compile(".s");
		Matcher matcher = pattern.matcher("as");
		boolean matches = matcher.matches();
		System.out.println("Matcher result is: " + matches);
	}

	private static void patternMatcherSecondtWay() {
		// 1st way
		// Trying to match whether the third character is s (i.e in kas)
		// Here the count is also important : i.e the Matcher string's length
		// need to be same as the complile input string i.e here ..s
		boolean result = Pattern.compile("..s").matcher("kas").matches();
		System.out.println("Matcher result is: " + result);
	}

	private static void patternMatcherThirdWay() {
		// 3rd way

		boolean result = Pattern.matches(".d", "ad");
		System.out.println("Result is : " + result);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		patternMatcherFirstWay();
//		patternMatcherSecondtWay();
		patternMatcherThirdWay();
	}

}
