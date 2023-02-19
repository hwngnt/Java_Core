package bai5;

public class RoomC extends Room{
	public RoomC() {
        super("C", 500);
    }

    @Override
    public String toString() {
    	return "Room\n" + "Category:\t" + category + "\nPrice:\t" + price;
    }
}
