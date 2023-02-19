package bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {
	EmployeeManagement em = new EmployeeManagement();
	Scanner sc = new Scanner(System.in);
	
	public void addEmployee(int type) {
		Employee employee = null;
		if (type == 0) {
			employee = addExperience(sc);
		} else if (type == 1) {
			employee = addFresher(sc);
		} else if (type == 2) {
			employee = addIntern(sc);
		}

		this.em.addEmployee(employee);
		System.out.println("Add employee sucessfully");
	}
	
	public List<Certificate> addCerts(List<Certificate> certs){
		System.out.println("Enter number of cert");
		int num = sc.nextInt();
		sc.nextLine();
		while (num>0) {
			System.out.println("Enter certID");
			String certID = sc.nextLine();
			System.out.println("Enter certName");
			String certName = sc.nextLine();
			System.out.println("Enter certRank");
			String certRank = sc.nextLine();
			System.out.println("Enter certDate");
			String certDate = sc.nextLine();
			Certificate c = new Certificate(certID, certName, certRank, certDate);
			certs.add(c);
			num--;
		}
		return certs;
	}
	
	public String addName(String name) {
		int count=0;
		do {
			try {
				System.out.println("Enter name");
				name = sc.nextLine();
				CustomException.nameCheck(name);
			} catch (NameException e) {
				System.out.println(e);
				count++;
			}
			if (count==0) break;
			count=0;
		} while (true);
		return name;
	}
	
	
	public String addBirthday(String birthday) {
		int count=0;
		do {
			try {
				System.out.println("Enter birthday");
				birthday = sc.nextLine();
				CustomException.birthdayCheck(birthday);
			} catch (BirthdayException e) {
				System.out.println(e);
				count++;
			}
			if (count==0) break;
			count=0;
		} while (true);
		return birthday;
	}
	
	public String addPhone(String phone) {
		int count=0;
		do {
			try {
				System.out.println("Enter phone");
				phone = sc.nextLine();
				CustomException.phoneCheck(phone);
			} catch (PhoneException e) {
				System.out.println(e);
				count++;
			}
			if (count==0) break;
			count=0;
		} while (true);
		return phone;
	}
	
	public String addEmail(String email) {
		int count=0;
		do {
			try {
				System.out.println("Enter email");
				email = sc.nextLine();
				CustomException.emailCheck(email);
			} catch (EmailException e) {
				System.out.println(e);
				count++;
			}
			if (count==0) break;
			count=0;
		} while (true);
		return email;
	}
	
	public Experience addExperience(Scanner sc) {
		String name = null;
		String birthday = null;
		String phone = null;
		String email = null;
		name = this.addName(name);
		birthday = this.addBirthday(birthday);
		phone = this.addPhone(phone);
		email = this.addEmail(email);
		
		System.out.println("Enter expInYear");
		int expInYear = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter proSkill");
		String proSkill = sc.nextLine();
		List<Certificate> certs = new ArrayList<>();
		certs = addCerts(certs);
		Experience e = new Experience(name, birthday, phone, email, expInYear, proSkill, certs);
		return e;
	}
	
	public Intern addIntern(Scanner sc) {
		String name = null;
		String birthday = null;
		String phone = null;
		String email = null;
		
		name = this.addName(name);
		birthday = this.addBirthday(birthday);
		phone = this.addPhone(phone);
		email = this.addEmail(email);
		
		System.out.println("Enter major");
		String major = sc.nextLine();
		System.out.println("Enter semester");
		String semester = sc.nextLine();
		System.out.println("Enter uni");
		String uni = sc.nextLine();
		List<Certificate> certs = new ArrayList<>();
		certs = addCerts(certs);
		Intern i = new Intern(name, birthday, phone, email, major, semester, uni, certs);
		return i;
	}
	
	public Fresher addFresher(Scanner sc) {
		String name = null;
		String birthday = null;
		String phone = null;
		String email = null;

		name = this.addName(name);
		birthday = this.addBirthday(birthday);
		phone = this.addPhone(phone);
		email = this.addEmail(email);
		
		System.out.println("Enter graduationDate");
		String graduationDate = sc.nextLine();
		System.out.println("Enter graduationRank");
		String graduationRank = sc.nextLine();
		System.out.println("Enter education");
		String education = sc.nextLine();
		List<Certificate> certs = new ArrayList<>();
		certs = addCerts(certs);
		Fresher f = new Fresher(name, birthday, phone, email, graduationDate, graduationRank, education, certs);
		return f;
	}
	
	public void updateByID(Scanner sc) {
		System.out.print("Input ID to update: ");
		String id = sc.nextLine();
		Employee employee = null;
		employee = this.em.findById(id);
		if (employee == null) {
			System.out.println("User not found");
		} else {
			if (employee.getType().equals("Experience")) {
				employee = updateExperience(sc, employee);
			} else if (employee.getType().equals("Fresher")) {
				employee = updateFresher(sc, employee);
			} else if (employee.getType().equals("Intern")) {
				employee = updateIntern(sc, employee);
			}
		}
	}
	
	public Experience updateExperience(Scanner sc, Employee employee) {
		String name = null;
		String birthday = null;
		String phone = null;
		String email = null;
		
		name = this.addName(name);
		birthday = this.addBirthday(birthday);
		phone = this.addPhone(phone);
		email = this.addEmail(email);
		
		System.out.println("Enter expInYear");
		int expInYear = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter proSkill");
		String proSkill = sc.nextLine();
		Experience experience = (Experience) employee;
		experience.setFullName(name);
		experience.setBirthDay(birthday);
		experience.setPhone(phone);
		experience.setEmail(email);
		experience.setExpInYear(expInYear);
		experience.setProSkill(proSkill);
		return experience;
	}
	
	public Fresher updateFresher(Scanner sc, Employee employee) {
		String name = null;
		String birthday = null;
		String phone = null;
		String email = null;
		
		name = this.addName(name);
		birthday = this.addBirthday(birthday);
		phone = this.addPhone(phone);
		email = this.addEmail(email);
		
		System.out.println("Enter graduationDate");
		String graduationDate = sc.nextLine();
		System.out.println("Enter graduationRank");
		String graduationRank = sc.nextLine();
		System.out.println("Enter education");
		String education = sc.nextLine();
		Fresher fresher = (Fresher) employee;
		fresher.setFullName(name);
		fresher.setBirthDay(birthday);
		fresher.setPhone(phone);
		fresher.setEmail(email);
		fresher.setGraduationDate(graduationDate);
		fresher.setGraduationRank(graduationRank);
		fresher.setEducation(education);
		return fresher;
	}
	
	public Intern updateIntern(Scanner sc, Employee employee) {
		String name = null;
		String birthday = null;
		String phone = null;
		String email = null;
		
		name = this.addName(name);
		birthday = this.addBirthday(birthday);
		phone = this.addPhone(phone);
		email = this.addEmail(email);
		
		System.out.println("Enter major");
		String major = sc.nextLine();
		System.out.println("Enter semester");
		String semester = sc.nextLine();
		System.out.println("Enter uni");
		String uni = sc.nextLine();
		Intern intern = (Intern) employee;
		intern.setFullName(name);
		intern.setBirthDay(birthday);
		intern.setPhone(phone);
		intern.setEmail(email);
		intern.setMajor(major);
		intern.setSemester(semester);
		intern.setUni(uni);
		return intern;
	}
	
	public void deleteEmployee(Scanner sc) {
		System.out.print("Input ID to delete: ");
		String id = sc.nextLine();
		Employee employee = null;
		employee = this.em.findById(id);
		if (employee == null) {

			System.out.println("User not found");
		} else {
			this.em.deleteById(id);
			System.out.println("Delete Sucessfully");
		}
	}
	
	public void findByType(Scanner sc, int type) {
		List<Employee> employees = null;
		if (type == 0) {
			employees = em.findByType("Experience");
		} else if (type == 1) {
			employees = em.findByType("Fresher");
		} else if (type == 2) {
			employees = em.findByType("Intern");
		}
		for(Employee e: employees) {
			System.out.println(e.toString());
		}
	}
}
