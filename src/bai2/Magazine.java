package bai2;


public class Magazine extends Document {
	private int issue;
	private int month;
	
	public Magazine(String nxb, int number, int issue, int month) {
		super(nxb, number);
		this.issue = issue;
		this.month = month;
		this.category = category.Magazine;
	}
	
	public int getIssue() {
		return issue;
	}
	
	public void setIssue(int issue) {
		this.issue = issue;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	@Override
    public String toString() {
		return "Magazine\n" + "id:\t" + id + "\nnxb:\t" + nxb +
				"\nnumber:\t" + number + "\nissue:\t" + issue + 
				"\nmonth:\t" + month;
    }
}
