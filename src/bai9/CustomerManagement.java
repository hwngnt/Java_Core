package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerManagement {
	List<Customer> customers;
	
	public CustomerManagement() {
		this.customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer c) {
		this.customers.add(c);
		System.out.println(c.toString());
	}
	
	public void deleteCustomer(String electricMeter) {
		Customer c = getCustomerById(electricMeter);
		if (c == null) {
			System.out.println("No customer found");
		}
		else {
    		this.customers.remove(c);
    		System.out.println("Remove customers successfully");
    	}
	}
	
	public void updateCustomer(Scanner sc, String electricMeter) {
		Customer c = getCustomerById(electricMeter);
		if (c == null) {
			System.out.println("No customer found");
		}
		else {
			System.out.print("Enter name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter houseNumber: ");
	        int houseNumber = sc.nextInt();
	        sc.nextLine();
	        int id = this.customers.indexOf(c);
	        this.customers.get(id).setName(name);
	        this.customers.get(id).setHouseNumber(houseNumber);
	        System.out.println("Updated");
	        System.out.println(this.customers.toString());
		}
	}
	
	public Customer getCustomerById(String electricMeter) {
		return this.customers.stream().filter(customer -> customer.getElectricMeter().equals(electricMeter)).findFirst().orElse(null);
	}
}
