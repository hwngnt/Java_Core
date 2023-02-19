package bai3;

public class A extends Student{
	protected String math = "math";
	protected String physic = "physic";
	protected String chemistry = "chemistry";
	
	public A(String name, String address, String priority) {
		super(name, address, priority);
	}
	
	@Override
    public String toString() {
		return "A student\n" + "id:\t" + id + "\nname:\t" + name +
				"\naddress:\t" + address + "\npriority:\t" + priority + 
				"\nsubject:\t" + math + "; " + physic + "; " + chemistry;
    }
}
