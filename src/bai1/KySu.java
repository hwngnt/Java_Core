package bai1;

public class KySu extends CanBo{
	protected String branch;
	
	public KySu(String name, int age, String gender, String address, String branch) {
		super(name, age, gender, address);
		this.branch = branch;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Ky Su\n" + "name:\t" + name + "\nage:\t" + age +
				"\ngender:\t" + gender + "\naddress:\t" + address + 
				"\nbranch:\t" + branch;
	}
}
