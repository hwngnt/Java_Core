package bai13;

import java.util.Scanner;

public class Main {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		Helper helper = new Helper();
		while (true) {
			System.out.println("Employee Management");
            System.out.println("Enter 1: Add an employee");
            System.out.println("Enter 2: Update an employee");
            System.out.println("Enter 3: Delete an employee");
            System.out.println("Enter 4: Find employee by type");
            System.out.println("Enter 5: Exit");
            String option = sc.nextLine();
            switch (option) {
	            case "1": {
	            	System.out.println("Enter type of employee");
	            	System.out.println("0: Experience");
	            	System.out.println("1: Fresher");
	            	System.out.println("2: Intern");
	            	int type = sc.nextInt();
	            	sc.nextLine();
	            	helper.addEmployee(type);
	            	break;
	            }
	            case "2": {
	            	helper.updateByID(sc);
	            	break;
	            }
	            case "3": {
	            	helper.deleteEmployee(sc);
	            	break;
	            }
	            case "4": {
	            	System.out.println("Enter type of employee");
	            	System.out.println("0:- Experience");
	            	System.out.println("1: Fresher");
	            	System.out.println("2: Intern");
	            	int type = sc.nextInt();
	            	sc.nextLine();
	            	helper.findByType(sc,type);
	            	break;
	            }
	            case "5": {
	            	return;
	            }
	            default:
	            	System.out.println("Invalid");
	            	break;
            }
		}
	}
}
