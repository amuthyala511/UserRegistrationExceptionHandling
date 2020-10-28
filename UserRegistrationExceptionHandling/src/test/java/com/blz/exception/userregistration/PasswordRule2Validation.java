package com.blz.exception.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordRule2Validation
{
	static UserRegistration u;
	@BeforeClass
	public static void pswdrule2TestOjb()
	{
		u = new UserRegistration();
		System.out.println("In Before Class");
	}
	
	@AfterClass
	public static void nullOjb()
	{
		u = null;
		System.out.println("In After Class");
	}
	@Test
	public void givenPassword_whenMin8Chars_AtleastOneUppercase_ReturnValid()
	{
		String result = u.validPasswordRule2("as5Df@gh");
		Assert.assertEquals("VALID", result);
		System.out.println("Successfully Passed");
	}
	
	@Test
	public void givenPassword_whenMin8Chars_NoUppercase_ReturnInvalid()
	{
		String result = u.validPasswordRule2("as_df@gh");
		Assert.assertEquals("INVALID", result);
		System.out.println("Unsuccessful");
	}
	
	@Test
	public void givenPassword_whenLessThan8Chars_AtleastOneUppercase_ReturnInvalid()
	{
		String result = u.validPasswordRule2("as_Df@g");
		Assert.assertEquals("INVALID", result);
		System.out.println("Unsuccessful");
	}
	
}
