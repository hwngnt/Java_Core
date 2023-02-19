package bai8;

public class Card {
	protected Student student;
	protected int id;
	protected int borrowDay;
	protected int returnDay;
	protected int bookId;
	protected static int id_auto_increment=0;
	
	public Card(Student student, String id, int borrowDay, int returnDay) {
		id_auto_increment++;
        this.student = student;
        this.id = id_auto_increment;
        this.borrowDay = borrowDay;
        this.returnDay = returnDay;
        this.bookId = id_auto_increment;
    }

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getId() {
		return String.valueOf(id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBorrowDay() {
		return borrowDay;
	}

	public void setBorrowDay(int borrowDay) {
		this.borrowDay = borrowDay;
	}

	public int getReturnDay() {
		return returnDay;
	}

	public void setReturnDay(int returnDay) {
		this.returnDay = returnDay;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	@Override
    public String toString() {
		return "Person\n" + "id:\t" + id + "\nStudent:\t" + student.toString() +
				"\nborrowDay:\t" + borrowDay + "\nreturnDay:\t" + returnDay + "\nbookId:\t" + bookId;
    }
}
