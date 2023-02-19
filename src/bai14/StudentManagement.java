package bai14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
	List<Student> students;
	List<GoodStudent> goodStudents;
	List<NormalStudent> normalStudents;
	public StudentManagement() {
		this.students = new ArrayList<>();
		this.goodStudents = new ArrayList<>();
		this.normalStudents = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
		if (student.getType() == "Good") {
			goodStudents.add((GoodStudent) student);
		} else if (student.getType() == "Normal") {
			normalStudents.add((NormalStudent) student);
		}
		System.out.println(student.toString());
		
	}
	
	public void addGoodStudent(GoodStudent goodStudent) {
		this.goodStudents.add(goodStudent);
	}
	
	public void addNormalStudent(NormalStudent normalStudent) {
		this.normalStudents.add(normalStudent);
	}
	
	public void filterStudent(int amountOfCandidates) {
		if (amountOfCandidates < 4 || amountOfCandidates > 9) {
			System.out.println("Input files have unknow errors !!!");
			
		}
		if (this.students.size() == amountOfCandidates) {
			returnListStudent(); 
			showStudents();
		}
		else if (countStudentType("Good") > amountOfCandidates) {
			returnGoodStudent();
			showGoodStudents(amountOfCandidates);
		}
		else if (countStudentType("Good") <= amountOfCandidates) {
			returnNormalStudent();
			showNormalStudents(amountOfCandidates);
		}
	}
	
	
	public void showGoodStudents(int amountOfCandidates) {
		for (GoodStudent gs : this.goodStudents) {
			if (amountOfCandidates == 0) {
				break;
			}
			System.out.println(gs.toString());
			amountOfCandidates--;
		}
		
		System.out.println("================================good===========================");
	}
	
	public void showNormalStudents(int amountOfCandidates) {
		for (GoodStudent gs : this.goodStudents) {
			if (amountOfCandidates == 0) {
				break;
			}
			System.out.println(gs.toString());
			amountOfCandidates--;
		}
		
		for (NormalStudent ns : this.normalStudents) {
			if (amountOfCandidates == 0) {
				break;
			}
			System.out.println(ns.toString());
			amountOfCandidates--;
		}
	}
	
	public void showStudents() {
		this.students.stream().forEach(s -> System.out.println(s.toString()));
	}
	
	private List<Student> returnListStudent(){
		return this.students;
	}
	
	private List<GoodStudent> returnGoodStudent(){
//		filterGoodStudent();
		Collections.sort(this.goodStudents,  new GoodStudentComparator());
		return this.goodStudents;
	}
	
	private List<NormalStudent> returnNormalStudent(){
//		filterGoodStudent();
//		filterNormalStudent();
		Collections.sort(this.normalStudents,  new NormalStudentComparator());
		return this.normalStudents;
	}
	
	
	public long countStudentType(String type) {
		return this.students.stream().filter(s -> s.getType().equals(type)).count();
	}

	public void filterGoodStudent(){
		for(Student student : this.students) {
			if (student.getType() == "Good") {
				goodStudents.add((GoodStudent) student);
				continue;
			}
		}
	}
	
	public void filterNormalStudent() {
		for(Student student : this.students) {
			if (student.getType() == "Normal") {
				normalStudents.add((NormalStudent) student);
				continue;
			}
		}
	}
	
	public void showByName() {
		Collections.sort(this.students,  new NameComparator());
	}
	
	public void showByPhone() {
		Collections.sort(this.students,  new PhoneComparator());
	}
}
