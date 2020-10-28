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
	
	public String validMobileNumber(String phno)
	{
		String regex = "^(91){1}[ ][6-9]{1}[0-9]{9,9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phno);
		if(p.matcher(phno).matches())
			return "VALID";
		else
			return "INVALID";
	}

	public String validPasswordRule1(String pswd)
	{
		String regex = "^[a-zA-Z0-9@#!_]{8,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pswd);
		if(p.matcher(pswd).matches())
			return "VALID";
		else
			return "INVALID";
	}
}
