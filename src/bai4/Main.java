package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Neighborhood nbh = new Neighborhood();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Neighborhood Management");
			System.out.println("Enter 1: Add new family");
	        System.out.println("Enter 2: Show family info");
	        System.out.println("Enter 3: Exit");
	        String option = sc.nextLine();
	        switch(option) {
		        case "1": {
		        	System.out.println("Enter n:");
		            int n = sc.nextInt();
		            sc.nextLine();
		            for (int i=0; i<n; i++) {
		            	System.out.println("Enter house number for " + i+1 + "family:" );
		            	int houseNumber = sc.nextInt();
		            	sc.nextLine();
		            	
		            	List<Person> persons = new ArrayList<>();
		            	System.out.println("Enter number of people");
		            	int numberOfPeople = sc.nextInt();
		            	sc.nextLine();
		            	
		            	for (int j=0; j<numberOfPeople; j++) {
		            		System.out.println("Enter name: ");
		            		String name = sc.nextLine();
		            		System.out.println("Enger age: ");
		            		int age = sc.nextInt();
		            		sc.nextLine();
		            		System.out.println("Enter job: ");
		            		String job = sc.nextLine();
		            		Person person = new Person(name, age, job);
		            		persons.add(person);
		            		System.out.println("Added successfully");;
		            		System.out.println(person.toString());
		            	}
		            	
		            	nbh.addFamily(new Family(persons, houseNumber));
		            }
		            break;
		        }
		        case "2": {
		        	nbh.showFamily();
		        	break;
		        }
		        case "3": {
		        	return;
		        }
		        default: 
		        	System.out.print("Invalid");
		        	continue;
	        }
		}
	}
}
