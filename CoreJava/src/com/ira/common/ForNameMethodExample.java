/**
 * 
 */
package com.ira.common;

/**
 * @author EVAAN
 *
 */
class Test {
}

public class ForNameMethodExample {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> className = Class.forName("com.ira.common.Test");
		System.out.println("The name of the class in different formats: " + className.getCanonicalName() + ":"
				+ className.getName() + ":" + className.getSimpleName() + ":" + className.getTypeName());
	}

}
