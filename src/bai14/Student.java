package bai14;

public class Student {
	String fullName;
	String doB;
	String gender;
	String phone;
	String uni;
	String grade;
	Type type;
	
	public Student(String fullName, String doB, String gender,
			String phone, String uni, String grade) {
		this.fullName = fullName;
		this.doB = doB;
		this.gender = gender;
		this.phone = phone;
		this.uni = uni;
		this.grade = grade;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDoB() {
		return doB;
	}

	public void setDoB(String doB) {
		this.doB = doB;
	}

	public String getType() {
		return String.valueOf(type);
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
