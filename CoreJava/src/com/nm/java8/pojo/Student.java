/**
 * 
 */
package com.nm.java8.pojo;

/**
 * @author EVAAN
 *
 */
public class Student {

	/**
	 * 
	 */
	private String studName;
	private int studId;

	public Student() {
	}

	public Student(String studName, int studId) {
		super();
		this.studName = studName;
		this.studId = studId;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", studId=" + studId + "]";
	}

	public String getStudName() {
		return studName;
	}

	public int getStudId() {
		return studId;
	}

}
