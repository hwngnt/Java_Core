package bai13;

import java.util.List;

public class Intern extends Employee {
	String major;
	String semester;
	String uni;
	
	public Intern(String fullName, String birthDay, 
			String phone, String email,  
			String major, String semester, String uni,
			List<Certificate> certs) {
		super(fullName, birthDay, phone, email, certs);
		this.major = major;
		this.semester = semester;
		this.uni = uni;
		this.type = Type.Intern;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}


	
	@Override
	public String toString() {
		return "Intern\n" + "id:\t" + id + "\nname:\t" + fullName +
				"\nbirthday:\t" + birthDay +  "\nphone:\t" + phone +
				"\nemail:\t" + email +  "\nmajor:\t" + major
				+  "\nsemester:\t" + semester +  "\nuni:\t" + uni;
	}
	
}
