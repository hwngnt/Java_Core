package bai9;

import java.util.Scanner;



public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
        CustomerManagement cm = new CustomerManagement();
        BillManagement bm = new BillManagement();
        
        while(true) {
        	System.out.println("Welcome to the app");
            System.out.println("Enter 1: Add new customer");
            System.out.println("Enter 2: Update customer");
            System.out.println("Enter 3: Delete customer");
            System.out.println("Enter 4: Add bill by id");
            System.out.println("Enter 5: Exit");
            String line = sc.nextLine();
            switch(line) {
	            case "1": {
	                System.out.print("Enter name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter houseNumber: ");
	                int houseNumber = sc.nextInt();
	                sc.nextLine();
	                Customer c = new Customer(name, houseNumber);
	                cm.addCustomer(c);
	                break;
	            }
	            case "2": {
	            	System.out.print("Enter electricMeter: ");
                    String id = sc.nextLine();
                    cm.updateCustomer(sc, id);
                    break;
	            }
	            case "3": {
	            	System.out.print("Enter electricMeter: ");
                    String id = sc.nextLine();
                    cm.deleteCustomer(id);
                    break;
	            }
	            case "4": {
	            	System.out.print("Enter electricMeter: ");
                    String id = sc.nextLine();
                    Customer c = cm.getCustomerById(id);
                    System.out.print("Enter old electric: ");
                    double oldElectric = sc.nextDouble();
                    System.out.print("Enter new electric: ");
                    double newElectric = sc.nextDouble();
                    sc.nextLine();
                    Bill b = new Bill(c, oldElectric, newElectric);
                    bm.addBill(b);
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
