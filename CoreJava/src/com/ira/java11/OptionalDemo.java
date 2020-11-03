/**
 * 
 */
package com.ira.java11;

import java.util.Optional;

/**
 * @author EVAAN
 *
 */
public class OptionalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = null;
		Optional<String> optional = Optional.ofNullable(str);
//		if (optional.isPresent())
		System.out.println(optional.orElse("Java9").toUpperCase());
	}

}
