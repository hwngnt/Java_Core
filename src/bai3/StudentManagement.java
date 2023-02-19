package bai3;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
	List<Student> students;
	
	public StudentManagement() {
		this.students = new ArrayList<>();
	}
	
	public void addNewStudent(Student student) {
		this.students.add(student);
	}
	
	public void showStudent() {
		this.students.forEach(stu -> System.out.println(stu.toString()));
	}
	
	public void searchById(String id) {
		this.students.forEach(stu -> {
			if (stu.getId().contains(id)) {
				System.out.println(stu.toString());
			}
			else System.out.print("Document not found\n");
		});
	}
}
