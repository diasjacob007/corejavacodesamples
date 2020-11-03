/**
 * 
 */
package com.nm.exam;

/**
 * @author user
 *
 */
public class Marks {

	private Student studentId;
	private int englishMarks;
	private int malayalamMarks;
	private int scienceMarks;
	private int socialMarks;
	private int mathsMarks;

	/**
	 * 
	 */
	public Marks() {
	}

	public Marks(Student studentId, int englishMarks, int malayalamMarks, int scienceMarks, int socialMarks,
			int mathsMarks) {
		super();
		this.studentId = studentId;
		this.englishMarks = englishMarks;
		this.malayalamMarks = malayalamMarks;
		this.scienceMarks = scienceMarks;
		this.socialMarks = socialMarks;
		this.mathsMarks = mathsMarks;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getMalayalamMarks() {
		return malayalamMarks;
	}

	public void setMalayalamMarks(int malayalamMarks) {
		this.malayalamMarks = malayalamMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getSocialMarks() {
		return socialMarks;
	}

	public void setSocialMarks(int socialMarks) {
		this.socialMarks = socialMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	@Override
	public String toString() {
		return "Marks [studentId=" + studentId + ", englishMarks=" + englishMarks + ", malayalamMarks=" + malayalamMarks
				+ ", scienceMarks=" + scienceMarks + ", socialMarks=" + socialMarks + ", mathsMarks=" + mathsMarks
				+ "]";
	}

}
