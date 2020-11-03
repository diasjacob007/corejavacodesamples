/**
 * 
 */
package com.nm.java8;

/**
 * @author EVAAN
 *
 */
public class FunctionalInterfaceWithLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runThreadUsingTraditionalApproach();
		runThreadUsingLambda();
	}

	/**
	 * 
	 */
	private static void runThreadUsingLambda() {
		// Using Lambda Expression
		Runnable runnable = () -> System.out.println("Child Thread Started...");
		new Thread(runnable).start();
	}

	/**
	 * 
	 */
	private static void runThreadUsingTraditionalApproach() {
		// Traditional Approach
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Child Thread Started...");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
