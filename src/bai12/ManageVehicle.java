package bai12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageVehicle {
    private List<Vehicle> vehicles;
    public ManageVehicle(){
    	this.vehicles = new ArrayList<>();
    }

    //add vehicle to list
    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void deleteVehicle(String id){
    	Vehicle v = this.vehicles.stream().filter(ve -> ve.getId().contains(id)).findFirst().orElse(null);
    	if (v == null) {
			System.out.println("No vehicle found");
		}
		else {
    		this.vehicles.remove(v);
    		System.out.println("Remove vehicle successfully");
    	}
    }

    public List<Vehicle> Search(String keyword){
    	return this.vehicles.stream().filter(ve -> ve.getBrand().contains(keyword) || ve.getColor().contains(keyword)).collect(Collectors.toList());
    }
}
