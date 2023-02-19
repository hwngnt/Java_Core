package bai1;

public class NhanVien extends CanBo {
	private String task;
	
	public NhanVien (String name, int age, String gender, String address, String task) {
		super(name, age, gender, address);
		this.task = task;
	}
	
	public String getTask() {
		return task;
	}
	
	public void setTask(String task) {
		this.task = task;
	}
	
	@Override
	public String toString() {
		return "Nhan Vien\n" + "name:\t" + name + "\nage:\t" + age +
				"\ngender:\t" + gender + "\naddress:\t" + address + 
				"\ntask:\t" + task;
	}
	
}
