package bai4;

import java.util.UUID;

public class Person {
	protected String name;
	protected int age;
	protected String job;
	protected UUID id;
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
	
    @Override
    public String toString() {
		return "Person\n" + "id:\t" + id + "\nname:\t" + name +
				"\nage:\t" + age + "\njob:\t" + job;
    }
}
