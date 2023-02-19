package bai14;

import java.util.Comparator;

public class NormalStudentComparator implements Comparator<NormalStudent>{

	@Override
	public int compare(NormalStudent s1, NormalStudent s2) {
		// TODO Auto-generated method stub
		if (s1.entryTestScore == s2.entryTestScore) {
			if (s1.eScore == s2.eScore) {
				return 0;
			} else if (s1.eScore > s2.eScore) {
				return -1;
			} else return 1;
		} 
		else if (s1.eScore > s2.eScore) {
			return -1;
		}
		return 1;
	}
	
}
