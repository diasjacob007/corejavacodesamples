/**
 * 
 */
package com.ira.common;

/**
 * @author EVAAN
 *
 */
class TestClass {
}

public class GetClassMethodSample {

	/**
	 * @param args
	 */
	private void printClassName(Object obj) {
		String className = obj.getClass().getSimpleName();
		System.out.println("The name of the class is: " + className);
	}

	public static void main(String[] args) {
		new GetClassMethodSample().printClassName(new TestClass());
	}

}
