/**
 * 
 */
package com.ira.java11;

import java.util.Optional;

/**
 * @author EVAAN
 *
 */
public class OptionalEmptyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("");
		optional = optional.empty();
		System.out.println(optional.isEmpty());
	}

}
