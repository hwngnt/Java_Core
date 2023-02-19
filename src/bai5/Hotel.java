package bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hotel {
	List<Person>persons;
	
	public Hotel() {
		this.persons = new ArrayList<>();
	}
	
	public void addCustomer(Person person) {
		this.persons.add(person);
	}
	
	public void deleteCustomer(String id) {
//		this.persons.stream().filter(person -> person.getId().contains(id)).findFirst();
//		Optional<Person> p = Optional.empty();
//		p.ifPresent(value -> {
//			this.persons.remove(value);
//			System.out.println("Remove customer successfully");
//		});
		Person p = this.persons.stream().filter(person -> person.getId().contains(id)).findFirst().orElse(null);
		if (p == null) {
			System.out.println("No customer found");
		} else {
			this.persons.remove(p);
			System.out.println("Remove customer successfully");
		}
	}
	
	public void calculator(String id) {
		Person p = this.persons.stream().filter(person -> person.getId().contains(id)).findFirst().orElse(null);
		if (p == null) {
			System.out.println("No customer found");
		} else {
			System.out.println("The price is:" + p.getRoom().getPrice() * p.getDay());
		}
//		Optional<Person> p = Optional.empty();
//		System.out.println(p.isEmpty());
//		p.ifPresent(value -> {
//			System.out.println("The price is:" + value.getRoom().getPrice() * value.getDay());
//		});
	}
	
	public void show() {
        this.persons.forEach(p -> System.out.println(p.toString()));
    }
}
