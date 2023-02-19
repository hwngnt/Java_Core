package bai2;
import java.util.UUID; 

public class Document {
	protected static int id_auto_increment;
	protected int id;
	protected String nxb;
	protected int number;
	protected category category;
	
	public Document(String nxb, int number) {
//		synchronized (this) {
//			this.id = id+1;
//		}
//		this.id = UUID.randomUUID();
		id_auto_increment++;
		this.id = id_auto_increment;
		this.nxb = nxb;
		this.number = number;
	}
	
	public String getCategory() {
		return this.category.toString();
	}
	
	public String getId() {
		return String.valueOf(id);
	}
	
	public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
