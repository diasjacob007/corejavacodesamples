/**
 * 
 */
package com.ira.methodreference;

/**
 * @author EVAAN
 *
 */
@FunctionalInterface
interface Sayable {
	void say();
}

public class StaticMethodReferenceSample1 {

	/**
	 * @param args
	 */
	private static void saySomething() {
		System.out.println("Say Something...");
	}

	public static void main(String[] args) {
		Sayable sayable = StaticMethodReferenceSample1::saySomething;
		sayable.say();
	}

}
