package bai12;

public class Vehicle {
    int id;
    static int id_auto_increment=0;
    String brand;
    int year_of_production;
    Long cost;
    String color;

    public Vehicle(String brand, int year_of_production, Long cost, String color) {
    	id_auto_increment++;
    	this.brand = brand;
    	this.year_of_production = year_of_production;
    	this.cost = cost;
    	this.color = color;
    	this.id = id_auto_increment;
    }
    
    public String getId() {
        return String.valueOf(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
    	return "Vehicle\n" + "id:\t" + id + "\nbrand:\t" + brand +
				"\nyear_of_production:\t" + year_of_production + "\ncost:\t" + cost + 
				"\ncolor:\t" + color;
    }
}
