package bai10;

public class Document {
	protected String str;
	final char SPACE = ' ';
	final char TAB = '\t';
	final char ENTER = '\n';
	public Document(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str;
	}
	
	public String normalize(String str) {
		str = str.trim();
		
		while(str.indexOf("  ")!=-1) {
			str = str.replaceAll("  ", " ");
		}
		
		return str;
	}
	
	public int count(String str) {
		int c = 0;
		
		if (str == null) {
			return -1;
		}
		
		boolean check = true;
		
		for (int i=0; i<str.length(); i++) {
			if((str.charAt(i) != SPACE) && (str.charAt(i) != TAB) && (str.charAt(i) != ENTER)) {
				if (check) {
					c++;
					check=false;
				}
			} else {
				check = true;
			}
		}
		return c;
	}
	
	public int countA(String str) {
		int c = 0; 
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
			c++;
		}
		return c;
	}
}
