/**
 * 
 */
package com.nm.java8.pojo;

/**
 * @author EVAAN
 *
 */
public class Employee {

	/**
	 * 
	 */
	private int empId;
	private String empName;
	private String empEmail;
	private Double empSalary;

	public Employee() {
	}

	public Employee(int empId, String empName, String empEmail, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empSalary="
				+ empSalary + "]";
	}

}
