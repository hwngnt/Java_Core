package bai3;

public class C extends Student {
	protected String literature = "literature";
	protected String history = "history";
	protected String geography = "geography";
	
	public C(String name, String address, String priority) {
		super(name, address, priority);
	}
	
	@Override
    public String toString() {
		return "C student\n" + "id:\t" + id + "\nname:\t" + name +
				"\naddress:\t" + address + "\npriority:\t" + priority + 
				"\nsubject:\t" + literature + "; " + history + "; " + geography;
    }
}
