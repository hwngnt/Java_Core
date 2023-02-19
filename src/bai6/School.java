package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
	List<Student> students;
	
	public School() {
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		System.out.print(student.toString());
		this.students.add(student);
	}
	
	public void showStudent() {
		this.students.forEach(stu -> System.out.println(stu.toString()));
	}
	
	public List<Student> showStudent20() {
		return this.students.stream().filter(student -> student.getAge() == 20).collect(Collectors.toList());
	}
	
	public long showStudent23InDN() {
		return this.students.stream().filter(student -> student.getAge() == 23 && student.getHometown().equals("DN")).count();
	}
}
