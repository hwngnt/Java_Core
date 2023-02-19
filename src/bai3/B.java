package bai3;

public class B extends Student{
	protected String math = "math";
	protected String biology = "biology";
	protected String chemistry = "chemistry";
	
	public B(String name, String address, String priority) {
		super(name, address, priority);
	}
	
	@Override
    public String toString() {
		return "B student\n" + "id:\t" + id + "\nname:\t" + name +
				"\naddress:\t" + address + "\npriority:\t" + priority + 
				"\nsubject:\t" + math + "; " + biology + "; " + chemistry;
    }
}
