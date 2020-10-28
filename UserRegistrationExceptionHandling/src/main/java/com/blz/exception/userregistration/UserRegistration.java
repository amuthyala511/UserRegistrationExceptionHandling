package com.blz.exception.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
	public String validFirstName(String fname)
	{
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fname);
		if(p.matcher(fname).matches())
			return "VALID";
		else
			return "INVALID";
	}
	
	public String validLastName(String lname)
	{
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		if(p.matcher(lname).matches())
			return "VALID";
		else
			return "INVALID";
	}
	
	public String validEmailAddress(String email)
	{
		String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		if(p.matcher(email).matches())
			return "VALID";
		else
			return "INVALID";
		
	}
}
