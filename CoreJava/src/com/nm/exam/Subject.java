/**
 * 
 */
package com.nm.exam;

/**
 * @author user
 *
 */
public class Subject {

	private Student studentId;
	private String subjectName;

	/**
	 * 
	 */
	public Subject() {
	}

	public Subject(Student studentId, String subjectName) {
		super();
		this.studentId = studentId;
		this.subjectName = subjectName;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [studentId=" + studentId + ", subjectName=" + subjectName + "]";
	}

}
