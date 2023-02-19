package bai7;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {
	List<Teacher> teachers;

    public TeacherManagement() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
        System.out.println(teacher.toString());
    }
    
    public void deleteTeacher(String id) {
    	Teacher t = this.teachers.stream().filter(teacher -> teacher.getId().equals(id)).findFirst().orElse(null);
    	if (t == null) {
    		System.out.println("No teacher found");
    	}
    	else {
    		this.teachers.remove(t);
    		System.out.println("Delete teacher successfully");
    	}
    }
    
    public void calculator(String id) {
    	Teacher t = this.teachers.stream().filter(teacher -> teacher.getId().equals(id)).findFirst().orElse(null);
    	if (t == null) {
    		System.out.println("No teacher found");
    	}
    	else {
    		double net = t.getSalary() + t.getBonus() + t.getFine();
    		System.out.println("Net salary of teacher " + id + " is: " + net);
    	}
    }
}
