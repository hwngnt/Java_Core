package bai2;


public class Newspaper extends Document {
	private int day;
	
	public Newspaper(String nxb, int number, int day) {
		super(nxb, number);
		this.day = day;
		this.category = category.Newspaper;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
    public String toString() {
		return "Newspaper\n" + "id:\t" + id + "\nnxb:\t" + nxb +
				"\nnumber:\t" + number + "\nday:\t" + day;
    }
}
