/**
 * 
 */
package com.ira.methodreference;

import java.util.function.BiFunction;

/**
 * @author EVAAN
 *
 */
public class InstanceMethodReferenceUsingBiFunction {

	/**
	 * @param args
	 */
	private int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = new InstanceMethodReferenceUsingBiFunction()::multiply;
		Integer result = biFunction.apply(12, 20);
		System.out.println("The product using BiFunction is: " + result);
	}

}
