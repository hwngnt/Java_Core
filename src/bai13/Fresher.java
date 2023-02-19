package bai13;

import java.util.List;

public class Fresher extends Employee{
	String graduationDate;
	String graduationRank;
	String education;
	
	public Fresher(String fullName, String birthDay, 
			String phone, String email, 
			String graduationDate, String graduationRank, String education,
			List<Certificate> certs) {
		super(fullName, birthDay, phone, email, certs);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
		this.type = Type.Fresher;
	}

	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	
	@Override
	public String toString() {
		return "Fresher\n" + "id:\t" + id + "\nname:\t" + fullName +
				"\nbirthday:\t" + birthDay +  "\nphone:\t" + phone +
				"\nemail:\t" + email +  "\ngraduationDate:\t" + graduationDate
				+  "\ngraduationRank:\t" + graduationRank +  "\neducation:\t" + education;
	}
	
}
