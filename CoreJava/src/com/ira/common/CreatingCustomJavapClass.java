/**
 * 
 */
package com.ira.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author EVAAN
 *
 */
public class CreatingCustomJavapClass {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = Class.forName(args[0]);
		System.out.println("Getting all Constructors...");
		Constructor[] constArray = cls.getDeclaredConstructors();
		for (int i = 0; i < constArray.length; i++) {
			System.out.println(constArray[i]);
		}
		System.out.println("Getting all Methods...");
		Method[] methodArray = cls.getDeclaredMethods();
		for (Method mthd : methodArray) {
			System.out.println(mthd);
		}
		System.out.println("Getting all Fields...");
		Field[] fieldArray = cls.getDeclaredFields();
		for (Field flds : fieldArray) {
			System.out.println(flds);
		}
	}
}
