package bai12;

public class Truck extends Vehicle{
    int weight;
    
    public Truck(String brand, int year_of_production, Long cost, String color, int weight) {
    	super(brand, year_of_production,cost,color);
    	this.weight = weight;
    }

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
    
    
}
