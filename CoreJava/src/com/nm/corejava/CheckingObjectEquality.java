/**
 * 
 */
package com.nm.corejava;

/**
 * @author user
 *
 */
public class CheckingObjectEquality{

	/**
	 * @throws CloneNotSupportedException 
	 * 
	 */
	public CheckingObjectEquality() throws CloneNotSupportedException {
		Employee e1=new Employee(423303, "Dias", 974764776);
//		Employee e2=new Employee(423303, "Dias", 974764776);
		Employee e2=(Employee)e1.clone();
		if(e1.equals(e2)) {
			System.out.println("Same Employees...");
		}else {
			System.out.println("Different Employees...");
		}
		
		System.out.println("Employee e1 hashCode:" +e1.hashCode());
		System.out.println("Employee e2 hashCode:" +e2.hashCode());
	}

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		new CheckingObjectEquality();
	}

}
