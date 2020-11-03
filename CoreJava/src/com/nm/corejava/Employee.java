/**
 * 
 */
package com.nm.corejava;

/**
 * @author user
 *
 */
public class Employee implements Cloneable{
	
	private int empId;
	private String empName;
	private long phoneNumber;
	
//	byte val=127;
	
	/**
	 * 
	 */
	public Employee() {
	}

	public Employee(int empId, String empName, long phoneNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", phoneNumber=" + phoneNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
