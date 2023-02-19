package bai7;

public class Teacher {
	protected double salary;
	protected double bonus;
	protected double fine;
	protected String name;
	protected int age;
	protected String hometown;
	protected int id;
    protected static int id_auto_increment=0;
    
    public Teacher(String name, int age, String hometown, double salary, double bonus, double fine) {
        this.salary = salary;
        this.bonus = bonus;
        this.fine = fine;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        id_auto_increment ++;
        this.id = id_auto_increment;
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
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

	public String getId() {
		return String.valueOf(id);
	}

	public void setId(int id) {
		this.id = id;
	}
    
    @Override
    public String toString() {
    	return "Teacher\n" + "id:\t" + id + "\nname:\t" + name +
				"\nage:\t" + age + "\nhometown:\t" + hometown + "\nsalary:\t" + salary
				+ "\nbonus:\t" + bonus + "\nfine:\t" + fine;
    }
}
