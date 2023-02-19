package bai14;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Helper helper = new Helper();
		while (true) {
			System.out.println("Candidates Management");
            System.out.println("Enter 1: Add a candidate");
            System.out.println("Enter 2: Filter candidates");
            System.out.println("Enter 3: Show by name");
            System.out.println("Enter 4: Show by phone");
            System.out.println("Enter 5: Exit");
            String option = sc.nextLine();
            switch (option) {
	            case "1": {
	            	System.out.println("Enter type of employee");
	            	System.out.println("0: Experience");
	            	System.out.println("1: Fresher");
	            	int type = sc.nextInt();
	            	sc.nextLine();
	            	helper.addStudent(type);
	            	break;
	            }
	            case "2": {
	            	System.out.println("Enter number of candidate");
	            	int amountOfCandidates = sc.nextInt();
	            	sc.nextLine();
	            	helper.searchCandidate(amountOfCandidates);
	            	break;
	            }
	            case "3": {
	            	helper.showByName();
	            	break;
	            }
	            case "4": {
	            	helper.showByPhone();
	            	break;
	            }
	            case "5":{
	            	return;
	            }
	            default: 
	            	System.out.println("Invalid");
	            	break;
            }
		}
	}
}
