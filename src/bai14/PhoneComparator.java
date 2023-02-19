package bai14;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if (s1.phone == s2.phone)
			return 0;
		else if (s1.phone.compareTo(s2.phone) > 0)
			return 1;
		else
			return -1;
	}

}
