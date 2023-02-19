package bai4;

import java.util.List;

public class Family {
	List<Person>persons;
	protected int houseNumber;
	
	public Family(List<Person> persons, int houseNumber) {
		this.persons = persons;
		this.houseNumber = houseNumber;
	}
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	@Override
    public String toString() {
		return "Family\n" + "Number of people:\t" + persons.size() + "\nHouse number:\t" + houseNumber;
    }
}
