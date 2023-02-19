package bai3;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		StudentManagement stm = new StudentManagement();
		while(true) {
			System.out.println("Student Management");
			System.out.println("Enter 1: Add new student");
	        System.out.println("Enter 2: Show student info");
	        System.out.println("Enter 3: Search student by id");
	        System.out.println("Enter 4: Exit");
	        String option = sc.nextLine();
	        switch (option) {
	        	case "1":{
	        		System.out.println("Enter a: Add A student");
	                System.out.println("Enter b: Add B student");
	                System.out.println("Enter c: Add C student");
	                String type = sc.nextLine();
	                switch(type) {
		                case "a": {
		                	stm.addNewStudent(Student.insertInformation(sc, "a"));
		                	break;
		                }
		                case "b": {
		                	stm.addNewStudent(Student.insertInformation(sc, "b"));
		                	break;
		                }
		                case "c": {
		                	stm.addNewStudent(Student.insertInformation(sc, "c"));
		                	break;
		                }
		                default:
		                	System.out.println("Invalid");
		                	break;
	                }
	        		break;
	        	}
	        	case "2": {
	        		stm.showStudent();
	        		break;
	        	}
	        	case "3": {
	        		System.out.println("Enter id: ");
		        	String id = sc.nextLine();
		        	stm.searchById(id);
	        		break;
	        	}
	        	case "4": {
	        		return;
	        	}
	        	default: 
	        		System.out.println("Invalid");
	        		continue;
	        }
		}
	}
}
