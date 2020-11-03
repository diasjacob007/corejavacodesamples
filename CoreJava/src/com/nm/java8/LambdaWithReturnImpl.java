/**
 * 
 */
package com.nm.java8;

/**
 * @author EVAAN
 *
 */
public class LambdaWithReturnImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		lambdaReturingValue();
		lambdaWithReturnMoreSimplified();
	}

	/**
	 * 
	 */
	private static void lambdaWithReturnMoreSimplified() {
		IntrfFindGreater findGreater=(n1,n2)->n1>n2;
		System.out.println("Is 41 greater than 40? " + findGreater.findLarger(41, 40));
		System.out.println("Is 101 greater the 102? " + findGreater.findLarger(101, 102));
	}

	/**
	 * 
	 */
	private static void lambdaReturingValue() {
		IntrfFindGreater findGreater = (n1, n2) -> {
			return n1 > n2;
		};

		System.out.println("Is 41 greater than 40? " + findGreater.findLarger(41, 40));
		System.out.println("Is 101 greater the 102? " + findGreater.findLarger(101, 102));
	}

}
