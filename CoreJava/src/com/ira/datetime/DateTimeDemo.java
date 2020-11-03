/**
 * 
 */
package com.ira.datetime;

import java.time.LocalDateTime;

/**
 * @author EVAAN
 *
 */
public class DateTimeDemo {

	/**
	 * 
	 */
	public DateTimeDemo() {
		LocalDateTime ld = LocalDateTime.now();
		System.out.println("Local Date is:" + ld);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new DateTimeDemo();
	}

}
