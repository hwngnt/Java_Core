package bai14;

public class NormalStudent extends Student{
	double eScore;
	double entryTestScore;
	
	public NormalStudent(String fullName, String doB, String gender,
			String phone, String uni, String grade, double eScore,
			double entryTestScore) {
		super(fullName, doB, gender, phone, uni, grade);
		this.eScore = eScore;
		this.entryTestScore = entryTestScore;
		this.type = Type.Normal;
	}

	public double geteScore() {
		return eScore;
	}

	public void seteScore(double eScore) {
		this.eScore = eScore;
	}

	public double getEntryTestScore() {
		return entryTestScore;
	}

	public void setEntryTestScore(double entryTestScore) {
		this.entryTestScore = entryTestScore;
	}
	
	@Override
	public String toString() {
		return "Normal Student\n" + "fullName:\t" + fullName + "\ndoB:\t" + doB +
				"\ngender:\t" + gender +  "\nphone:\t" + phone +
				"\nuni:\t" + uni +  "\ngrade:\t" + grade
				+  "\neScore:\t" + eScore +  "\nentryTestScore:\t" + entryTestScore;
	}
}
