package bai14;

import java.util.regex.Pattern;



public class CustomException {
	private static String DATE_PATTERN = 
		      "^((0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(19|2[0-1])[0-9]{2})$";
	private static String PHONE_PATTERN = 
			"^(0?)(3[5|8|1]|9[0|8|1])[0-9]{7}$";
	private static String NAME_PATTERN =
			"^[a-zA-Z \\-\\.\\']{10,50}$";
	public static void birthdayCheck(String dob) throws InvalidDOBException {
		if (!Pattern.matches(DATE_PATTERN, dob)) {
			throw new InvalidDOBException("Dob is not valid");
		}
	}
	
	public static void phoneCheck(String phone) throws InvalidPhoneNumberException {
		if (!Pattern.matches(PHONE_PATTERN, phone)) {
			throw new InvalidPhoneNumberException("Phone number is not valid");
		}
	}
	
	public static void nameCheck(String name) throws InvalidFullNameException {
		if (!Pattern.matches(NAME_PATTERN, name)) {
			throw new InvalidFullNameException("Name is not valid");
		}
	}
}
