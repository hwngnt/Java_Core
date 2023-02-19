package bai14;

import java.util.Scanner;


public class Helper {
	StudentManagement sm = new StudentManagement();
	Scanner sc = new Scanner(System.in);
	
	public void addStudent(int type) {
		Student student = null;
		if (type == 0) {
			student = addGoodStudent(sc);
		} else if (type == 1) {
			student = addNormalStudent(sc);
		}
		this.sm.addStudent(student);
		System.out.println("Add Student sucessfully");
	}
	
	public String addName(String name) {
		int count=0;
		do {
			try {
				System.out.println("Enter name");
				name = sc.nextLine();
				CustomException.nameCheck(name);
			} catch (InvalidFullNameException e) {
				System.out.println(e);
				count++;
			}
			if (count==0) break;
			count=0;
		} while (true);
		return name;
	}
	
	public String addDOB(String dob) {
		int count=0;
		do {
			try {
				System.out.println("Enter dob");
				dob = sc.nextLine();
				CustomException.birthdayCheck(dob);
			} catch (InvalidDOBException e) {
				System.out.println(e);
				count++;
			}
			if (count==0) break;
			count=0;
		} while (true);
		return dob;
	}
	
	public String addPhone(String phone) {
		int count=0;
		do {
			try {
				System.out.println("Enter phone");
				phone = sc.nextLine();
				CustomException.phoneCheck(phone);
			} catch (InvalidPhoneNumberException e) {
				System.out.println(e);
				count++;
			}
			if (count==0) break;
			count=0;
		} while (true);
		return phone;
	}
	
	public GoodStudent addGoodStudent(Scanner sc) {
		String fullName = null;
		String dob = null;
		String gender = null;
		String grade = null;
		String phone = null;
		String uni = null;
		double gpa = 0;
		String reward = null;
		fullName = this.addName(fullName);
		dob = this.addDOB(dob);
		phone = this.addPhone(phone);
		System.out.println("Enter gender");
		gender = sc.nextLine();
		System.out.println("Enter grade");
		grade = sc.nextLine();
		System.out.println("Enter uni");
		uni = sc.nextLine();
		System.out.println("Enter gpa");
		gpa = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter reward");
		reward = sc.nextLine();
		GoodStudent goodStudent = new GoodStudent(fullName, dob, gender,
				phone, uni, grade, gpa, reward);
		return goodStudent;
	}
	
	public NormalStudent addNormalStudent(Scanner sc) {
		String fullName = null;
		String dob = null;
		String gender = null;
		String grade = null;
		String phone = null;
		String uni = null;
		double eScore = 0;
		double entryTestScore = 0;
		fullName = this.addName(fullName);
		dob = this.addDOB(dob);
		phone = this.addPhone(phone);
		System.out.println("Enter gender");
		gender = sc.nextLine();
		System.out.println("Enter grade");
		grade = sc.nextLine();
		System.out.println("Enter uni");
		uni = sc.nextLine();
		System.out.println("Enter eScore");
		eScore = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter entryTestScore");
		entryTestScore = sc.nextDouble();
		sc.nextLine();
		NormalStudent normalStudent = new NormalStudent(fullName, dob, gender,
				phone, uni, grade, eScore, entryTestScore);
		return normalStudent;
	}
	
	public void searchCandidate(int amountOfCandidates) {
		sm.filterStudent(amountOfCandidates);
	}
	
	public void showByName() {
		sm.showByName();
		sm.showStudents();
	}
	
	public void showByPhone() {
		sm.showByPhone();
		sm.showStudents();
	}
}
