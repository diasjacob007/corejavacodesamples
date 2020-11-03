package com.ira.common;

public class AppendingDotClass {

	public static void main(String[] args) {
		Class<?> booleancls = Boolean.class;
		Class<?> threadcls = Thread.class;
		Class<?> customcls = AppendingDotClass.class;

		System.out.println("Name of Boolean class is: " + booleancls.getSimpleName());
		System.out.println("Name of Thread class is: " + threadcls.getSimpleName());
		System.out.println("Name of Custome class is: " + customcls.getSimpleName());
	}

}
