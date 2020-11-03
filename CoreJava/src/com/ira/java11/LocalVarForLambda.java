/**
 * 
 */
package com.ira.java11;

/**
 * @author EVAAN
 *
 */
public class LocalVarForLambda {

	/**
	 * @param args
	 */
	@FunctionalInterface
	interface MathOperation {
		int operate(int a, int b);
	}

	public static void main(String[] args) {
		var i = 120;
		var j = 130;
		MathOperation mathOperation = (var x, var y) -> i + j;
		System.out.println("The sume is:" + mathOperation.operate(i, j));
	}
}
