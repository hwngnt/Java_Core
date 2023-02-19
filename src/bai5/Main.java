package bai5;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("Welcome to hotel xxx");
            System.out.println("Enter 1: Add new customer");
            System.out.println("Enter 2: Delete customer by id");
            System.out.println("Enter 3: Calculate price");
            System.out.println("Enter 4: Show info");
            System.out.println("Enter 5: Exit");
            String line = sc.nextLine();
            switch(line) {
                case "1": {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Choose a to rent room type A");
                    System.out.println("Choose b to rent room type B");
                    System.out.println("Choose c to rent room type C");
                    String choose = sc.nextLine();
                    Room room;
                    if (choose.equals("a")) {
                        room = new RoomA();
                    } else if (choose.equals("b")) {
                        room = new RoomB();
                    } else if (choose.equals("c")) {
                        room = new RoomC();
                    } else {
                        continue;
                    }
                    System.out.print("Enter number day for rent: ");
                    int numberRent = sc.nextInt();
                    sc.nextLine();
                    Person person = new Person(name, age, room, numberRent);
                    hotel.addCustomer(person);
                    break;
                }
                case "2": {
                    System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    hotel.deleteCustomer(id);
                    break;
                }
                case "3": {
                    System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    hotel.calculator(id);
                    break;
                }
                case "4": {
                    hotel.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }
}
