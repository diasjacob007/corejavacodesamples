/**
 * 
 */
package com.ira.methodreference;

/**
 * @author EVAAN
 *
 */
interface SayableInstanceMethod {
	void say();
}

public class InstanceMethodReferenceSample1 {

	/**
	 * @param args
	 */
	private void saySomething() {
		System.out.println("Hi...welcome to Instance Method Reference");
	}

	public static void main(String[] args) {
		SayableInstanceMethod sayable = new InstanceMethodReferenceSample1()::saySomething;
		sayable.say();
	}

}
