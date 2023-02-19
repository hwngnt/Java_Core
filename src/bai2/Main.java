package bai2;

import java.util.Scanner;



public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		BookManagement bm = new BookManagement();
		while (true) {
			System.out.println("Book Management");
			System.out.println("Enter 1: Add new document");
	        System.out.println("Enter 2: Delete document by id");
	        System.out.println("Enter 3: Show document info");
	        System.out.println("Enter 4: Search document by category");
	        System.out.println("Enter 5: Exit");
	        String option = sc.nextLine();
	        switch(option) {
		        case "1":{
		        	System.out.println("Enter a: Add book");
	                System.out.println("Enter b: Add magazine");
	                System.out.println("Enter c: Add newspaper");
	                String type = sc.nextLine();
	                switch(type) {
		                case "a": {
		                	System.out.println("Enter nxb: ");
		                	String nxb = sc.nextLine();
		                	System.out.println("Enter number: ");
		                	int number = sc.nextInt();
		                	sc.nextLine();
		                	System.out.println("Enter author: ");
		                	String author = sc.nextLine();
		                	System.out.println("Enter pages: ");
		                	int pages = sc.nextInt();
		                	Document book = new Book(nxb, number, author, pages);
		                	bm.addDocument(book);
		                	sc.nextLine();
		                	System.out.println("Add successfully!");
	                		System.out.println(book.toString());
	                		break;
		                }
		                case "b": {
		                	System.out.println("Enter nxb: ");
		                	String nxb = sc.nextLine();
		                	System.out.println("Enter number: ");
		                	int number = sc.nextInt();
		                	sc.nextLine();
		                	System.out.println("Enter issue: ");
		                	int issue = sc.nextInt();
		                	sc.nextLine();
		                	System.out.println("Enter month: ");
		                	int month = sc.nextInt();
		                	sc.nextLine();
		                	Document magazine = new Magazine(nxb, number, issue, month);
		                	bm.addDocument(magazine);
		                	System.out.println("Add successfully!");
	                		System.out.println(magazine.toString());
	                		break;
		                }
		                case "c": {
		                	System.out.println("Enter nxb: ");
		                	String nxb = sc.nextLine();
		                	System.out.println("Enter number: ");
		                	int number = sc.nextInt();
		                	sc.nextLine();
		                	System.out.println("Enter day: ");
		                	int day = sc.nextInt();
		                	sc.nextLine();
		                	Document newspaper = new Newspaper(nxb, number, day);
		                	bm.addDocument(newspaper);
		                	System.out.println("Add successfully!");
	                		System.out.println(newspaper.toString());
	                		break;
		                }
		                default:
		                	System.out.println("Invalid");
		                	break;
	                }
	                break;
		        }
		        case "2": {
		        	System.out.println("Enter id: ");
		        	String id = sc.nextLine();
		        	sc.nextLine();
		        	bm.deleteDocument(id);
		        	break;
		        }
		        case "3": {
		        	bm.showDocument();
		        	break;
		        }
		        case "4": {
		        	System.out.println("Enter category: ");
	            	String category = sc.nextLine();
	            	for (Document doc : bm.searchDocumentByCategory(category)) {
	            		System.out.println(doc.toString());
	            	}
	            	break;
		        }
		        case "5":{
		        	return;
		        }
		        default:
		        	System.out.println("Invalid");
		        	continue;
	        }
		}
	}
}
