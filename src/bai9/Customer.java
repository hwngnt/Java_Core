package bai9;

public class Customer {
	protected String name;
	protected int houseNumber;
	protected int electricMeter;
	protected static int electricMeterId=0;
	
	public Customer(String name, int houseNumber) {
		this.name = name;
		this.houseNumber = houseNumber;
		electricMeterId++;
		this.electricMeter = electricMeterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getElectricMeter() {
		return String.valueOf(electricMeter);
	}
	
	@Override
    public String toString() {
		return "Person\n" + "electricMeter:\t" + electricMeter + "\nname:\t" + name +
				"\nhouseNumber:\t" + houseNumber ;
    }
}
