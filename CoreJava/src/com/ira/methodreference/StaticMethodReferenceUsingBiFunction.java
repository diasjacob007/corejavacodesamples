/**
 * 
 */
package com.ira.methodreference;

import java.util.function.BiFunction;

/**
 * @author EVAAN
 *
 */
public class StaticMethodReferenceUsingBiFunction {

	/**
	 * @param args
	 */
	private static float multiply(int num1, float num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		BiFunction<Integer, Float, Float> biFunction = StaticMethodReferenceUsingBiFunction::multiply;
		Float apply = biFunction.apply(100, 20.0f);
		System.out.println("The result is : " + apply);
	}

}
