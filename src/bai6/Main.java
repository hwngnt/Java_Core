package bai6;

import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        School school = new School();
        while (true) {
            System.out.println("Welcome to school");
            System.out.println("Enter 1: Add new student");
            System.out.println("Enter 2: Get student 20 yrs old");
            System.out.println("Enter 3: Get student 23 yrs old and in DN");
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
                    System.out.print("Enter class: ");
                    String lop = sc.nextLine();
                    Student stu = new Student(name, age, hometown, lop);
                    school.addStudent(stu);
                    break;
                }
                case "2": {
                    for(Student stu:school.showStudent20()) {
                    	System.out.println(stu.toString());
                    }
                    break;
                }
                case "3": {
                	System.out.print("Number of student(s) 23 yrs old and in DN is: " + school.showStudent23InDN());
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
