package bai13;

import java.util.Date;
import java.util.regex.Pattern;

public class CustomException {
	
	private static String DATE_PATTERN = 
		      "^((19|2[0-1])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
	
	private static String PHONE_PATTERN = 
			"^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
	
	private static String EMAIL_PATTERN = 
			"^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
	
	private static String NAME_PATTERN =
			"^[a-zA-Z \\-\\.\\']*$";
	
	public static void birthdayCheck(String date) throws BirthdayException {
		if (!Pattern.matches(DATE_PATTERN, date)) {
			throw new BirthdayException("Birthday is not valid");
		}
	}
	
	public static void phoneCheck(String phone) throws PhoneException {
		if (!Pattern.matches(PHONE_PATTERN, phone)) {
			throw new PhoneException("Phone number is not valid");
		}
	}
	
	public static void emailCheck(String email) throws EmailException {
		if (!Pattern.matches(EMAIL_PATTERN, email)) {
			throw new EmailException("Email is not valid");
		}
	}
	
	public static void nameCheck(String name) throws NameException {
		if (!Pattern.matches(NAME_PATTERN, name)) {
			throw new NameException("Name is not valid");
		}
	}
}
