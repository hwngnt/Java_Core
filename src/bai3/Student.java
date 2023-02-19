package bai3;

import java.util.Scanner;
import java.util.UUID;

public class Student {
	protected UUID id;
	protected String name;
	protected String address;
	protected String priority;
	
	public Student(String name, String address, String priority) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.address = address;
		this.priority = priority;
	}
	
	public String getId() {
		return id.toString();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public static Student insertInformation(Scanner sc, String type){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter priority: ");
        String priority = sc.nextLine();
        if (type.equals("a")) {
        	return new A(name, address, priority);
        }
        else if(type.equals("b")) {
        	return new B(name, address, priority);
        }
        else {
        	return new C(name, address, priority);
        }
    }
}
