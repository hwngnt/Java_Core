package bai12;

public class Car extends Vehicle{
    int number_of_seats;
    String type_of_motor;
    public int getNumber_of_seats() {
		return number_of_seats;
	}
	public void setNumber_of_seats(int number_of_seats) {
		this.number_of_seats = number_of_seats;
	}
	public String getType_of_motor() {
		return type_of_motor;
	}
	public void setType_of_motor(String type_of_motor) {
		this.type_of_motor = type_of_motor;
	}
	public Car(String brand, int year_of_production, Long cost, String color, int number_of_seats, String type_of_motor) {
    	super(brand, year_of_production,cost,color);
    	this.number_of_seats = number_of_seats;
    	this.type_of_motor = type_of_motor;
    }
    
    
}
