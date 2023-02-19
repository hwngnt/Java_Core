package bai13;

import java.util.List;

public class Experience extends Employee{
	int expInYear;
	String proSkill;
	
	public Experience(String fullName, String birthDay, 
			String phone, String email, int expInYear, String proSkill,
			List<Certificate> certs) {
		super(fullName, birthDay, phone, email, certs);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
		this.type = Type.Experience;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	@Override
	public String toString() {
		return "Experience\n" + "id:\t" + id + "\nname:\t" + fullName +
				"\nbirthday:\t" + birthDay +  "\nphone:\t" + phone +
				"\nemail:\t" + email +  "\nexpInYear:\t" + expInYear
				+  "\nproSkill:\t" + proSkill;
	}
}
