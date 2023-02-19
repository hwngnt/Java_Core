package bai1;

public class CongNhan extends CanBo {
	protected int level;
	
	public CongNhan (String name, int age, String gender, String address, int level) {
		super(name, age, gender, address);
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "Cong Nhan\n" + "name:\t" + name + "\nage:\t" + age +
				"\ngender:\t" + gender + "\naddress:\t" + address + 
				"\nlevel:\t" + level;
	}
	
}
