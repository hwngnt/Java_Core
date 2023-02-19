package bai14;

import java.util.Comparator;

public class GoodStudent extends Student{
	double gpa;
	String reward;
	
	public GoodStudent (String fullName, String doB, String gender,
			String phone, String uni, String grade, double gpa, String reward) {
		super(fullName, doB, gender, phone, uni, grade);
		this.gpa = gpa;
		this.reward = reward;
		this.type = Type.Good;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}
	
	@Override
	public String toString() {
		return "Good Student\n" + "fullName:\t" + fullName + "\ndoB:\t" + doB +
				"\ngender:\t" + gender +  "\nphone:\t" + phone +
				"\nuni:\t" + uni +  "\ngrade:\t" + grade
				+  "\ngpa:\t" + gpa +  "\nreward:\t" + reward;
	}

}
