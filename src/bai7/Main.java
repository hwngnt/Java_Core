package bai7;

import java.util.Scanner;


public class Main {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
        TeacherManagement mt = new TeacherManagement();
        while (true) {
        	System.out.println("Welcome to school");
            System.out.println("Enter 1: Add new teacher");
            System.out.println("Enter 2: Delete teacher by id");
            System.out.println("Enter 3: Get net salary");
            System.out.println("Enter 4: Exit");
            String line = sc.nextLine();
            switch(line) {
	            case "1": {
	                System.out.print("Enter name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter age: ");
	                int age = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Enter hometown: ");
	                String hometown = sc.nextLine();
	                System.out.print("Enter salary: ");
	                double salary = sc.nextDouble();
	                sc.nextLine();
	                System.out.print("Enter bonus: ");
	                double bonus = sc.nextDouble();
	                sc.nextLine();
	                System.out.print("Enter fine: ");
	                double fine = sc.nextDouble();
	                sc.nextLine();
	                Teacher t = new Teacher(name, age, hometown, salary, bonus, fine);
	                mt.addTeacher(t);
	                break;
	            }
	            case "2": {
	            	System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    mt.deleteTeacher(id);
	                break;
	            }
	            case "3": {
	            	System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    mt.calculator(id);
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
