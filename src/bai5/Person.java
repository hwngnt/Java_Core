package bai5;

public class Person {
	protected String name;
	protected int age;
	protected int id;
	private Room room;
    private int day;
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	protected static int id_auto_increment=0;
	public Person(String name, int age, Room room, int day) {
		id_auto_increment++;
		this.id = id_auto_increment;
		this.name = name;
		this.age = age;
		this.room = room;
		this.day = day;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return String.valueOf(id);
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
		return "Person\n" + "id:\t" + id + "\nname:\t" + name +
				"\nage:\t" + age;
    }
}
