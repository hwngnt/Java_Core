package bai14;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if (s1.fullName == s2.fullName)
			return 0;
		else if (s1.fullName.compareTo(s2.fullName) < 0)
			return 1;
		else
			return -1;
	}

}
