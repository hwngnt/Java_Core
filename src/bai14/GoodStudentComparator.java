package bai14;

import java.util.Comparator;

public class GoodStudentComparator implements Comparator<GoodStudent>{

	@Override
	public int compare(GoodStudent s1, GoodStudent s2) {
		// TODO Auto-generated method stub
		if (s1.gpa == s2.gpa) {
			if (s1.fullName.compareTo(s2.fullName) >= 0) {
				return 0;
			}
			return 1;
		} 
		else if (s1.gpa > s2.gpa) {
			return -1;
		}
		return 1;
	}
	
}
