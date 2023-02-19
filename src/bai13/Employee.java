package bai13;

import java.util.List;
import java.util.Map;

public class Employee {
	int id;
	String fullName;
	String birthDay;
	String phone;
	String email;
	Type type;
	static int employee_count=0;
	
	List<Certificate> certs;
	
	public Employee(String fullName, String birthDay, String phone, String email, List<Certificate> certs) {
		this.id = ++employee_count;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.certs = certs;
	}

	public String getType() {
		return type.toString();
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<Certificate> getCerts() {
		return certs;
	}

	public void setCerts(List<Certificate> certs) {
		this.certs = certs;
	}

	public String getId() {
		return String.valueOf(id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getEmployee_count() {
		return employee_count;
	}
}
