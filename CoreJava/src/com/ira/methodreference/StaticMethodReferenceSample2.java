/**
 * 
 */
package com.ira.methodreference;

/**
 * @author EVAAN
 *
 */
interface Arithmetic {
	int add(int a, int b);
}

public class StaticMethodReferenceSample2 {

	private static int sum(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arithmetic arithmetic = StaticMethodReferenceSample2::sum;
		System.out.println("The sum is: " + arithmetic.add(120, 130));
	}

}
