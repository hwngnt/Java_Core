package bai6;

public class Student {
	protected String name;
	protected int age;
	protected String hometown;
	protected String lop;
	
	public Student(String name, int age, String hometown, String lop) {
		this.name = name;
		this.age = age;
		this.hometown = hometown;
		this.lop = lop;
	}
	
	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getHometown() {
		return hometown;
	}


	public void setHometown(String hometown) {
		this.hometown = hometown;
	}


	@Override
    public String toString() {
		return "Person\n" + "hometown:\t" + hometown + "\nname:\t" + name +
				"\nage:\t" + age;
    }
}
