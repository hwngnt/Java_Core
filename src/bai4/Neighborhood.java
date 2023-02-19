package bai4;

import java.util.ArrayList;
import java.util.List;

public class Neighborhood {
	List<Family> families;
	
	public Neighborhood() {
		this.families = new ArrayList<>();
	}
	
	public void addFamily(Family family) {
		this.families.add(family);
	}
	
	public void showFamily() {
		this.families.forEach(fam -> {
			System.out.println(fam.toString());
		});
	}
}
