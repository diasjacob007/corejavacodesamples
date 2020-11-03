/**
 * 
 */
package com.ira.methodreference;

/**
 * @author EVAAN
 *
 */
@FunctionalInterface
interface FindSum {
	double add(double a, double b);
}

public class InstanceMethodReferenceSample2 {

	/**
	 * @param args
	 */
	private double sum(double num1, double num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		FindSum findSum = new InstanceMethodReferenceSample2()::sum;
		double result = findSum.add(10.00, 20.00);
		System.out.println("The sum of two numbers using instance method reference is: " + result);
	}

}
