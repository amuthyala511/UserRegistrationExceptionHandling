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
}
