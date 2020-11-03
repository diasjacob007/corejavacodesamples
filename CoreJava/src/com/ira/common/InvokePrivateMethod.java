/**
 * 
 */
package com.ira.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author EVAAN
 *
 */
class ClassWithPrivateMethod {

	private String name = "Private Field";

	private ClassWithPrivateMethod() {
		System.out.println("Inside the Private Constructor...");
	}

	private void displayHelloMessage() {
		System.out.println("Hello...Welcome to Java!!!");
	}
}

public class InvokePrivateMethod {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws NoSuchFieldException
	 */
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> cls = Class.forName("com.ira.common.ClassWithPrivateMethod");
		System.out.println("Accessing the Private constructor of the Class : " + cls.getCanonicalName());
		Constructor<?> constructor = cls.getDeclaredConstructor();
		constructor.setAccessible(true);
//		constructor.newInstance(null);
		Object obj = constructor.newInstance();
		System.out.println("Accessing Private Method of the Class :" + cls.getSimpleName());
		Method method = cls.getDeclaredMethod("displayHelloMessage", null);
		method.setAccessible(true);
		method.invoke(obj, null);
		System.out.println("Accessing Private Field of the Class :" + cls.getName());
		Field field = cls.getDeclaredField("name");
		field.setAccessible(true);
		String fieldName = (String) field.get(obj);
		System.out.println("Name of the private field is: " + fieldName);
	}
}
