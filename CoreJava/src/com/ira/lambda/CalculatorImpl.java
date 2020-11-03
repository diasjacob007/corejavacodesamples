/**
 * 
 */
package com.ira.lambda;

/**
 * @author EVAAN
 *
 */
@FunctionalInterface
interface CalculatorIntrf {
//	void switchOn();
	int add(int num1, int num2);
}

public class CalculatorImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		CalculatorIntrf calculator = () -> System.out.println("Switch On the calculator");
//		calculator.switchOn();

		CalculatorIntrf calculator = (n1, n2) -> {
			return n1 + n2;
		};
		System.out.println("Sum is:" + calculator.add(120, 100));
	}

}
