package bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
	List<Employee> employees;
	
	public EmployeeManagement() {
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
		System.out.println(employee.toString());
	}
	
	public Employee findById(String id) {
        return this.employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }
	
	public void deleteById(String id) {
		Employee e = findById(id);
		if (e==null) {
        	System.out.println("No employee found");
        } else {
        	System.out.println(e.toString());
        	this.employees.remove(e);
        }
	}
	
	public List<Employee> findByType(String type){
		return this.employees.stream().filter(employee -> employee.getType().contains(type)).collect(Collectors.toList());
	}
	
	public void remove(Employee e) {
		this.employees.remove(e);
	}
}
