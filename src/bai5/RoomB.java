package bai5;

public class RoomB extends Room{
	public RoomB() {
        super("B", 500);
    }

    @Override
    public String toString() {
    	return "Room\n" + "Category:\t" + category + "\nPrice:\t" + price;
    }
}
