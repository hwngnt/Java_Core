package bai12;

public class Motorbike extends Vehicle{
    int power;
    
    public Motorbike(String brand, int year_of_production, Long cost, String color, int power) {
    	super(brand, year_of_production,cost,color);
    	this.power = power;
    }

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
    
    
}
