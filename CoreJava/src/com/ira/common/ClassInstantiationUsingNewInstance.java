/**
 * 
 */
package com.ira.common;

/**
 * @author EVAAN
 *
 */
class NewInstanceTestClass {
	void displayHello() {
		System.out.println("Hello...Welcome to the usage of newInstance()");
	}
}

public class ClassInstantiationUsingNewInstance {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		NewInstanceTestClass newInstanceTestClass = (NewInstanceTestClass) Class
				.forName("com.ira.common.NewInstanceTestClass").newInstance();
		newInstanceTestClass.displayHello();
	}

}
