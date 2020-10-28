package com.blz.exception.userregistration;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ParameterizedEmailValidation
{
	private String emailTest;
	private String expectedResult;
	
	public ParameterizedEmailValidation(String emailid, String result)
	{
		this.emailTest = emailid;
		this.expectedResult = result;
	}
	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] { {"abc@yahoo.com", "VALID"},
				{"abc-100@yahoo.com", "VALID"},
				{"abc.100@yahoo.com", "VALID"},
				{"abc111@abc.com", "VALID"},
				{"abc-100@abc.net", "VALID"},
				{"abc.100@abc.com.au", "VALID"},
				{"abc@1.com", "VALID"},
				{"abc@gmail.com.com", "VALID"},
				{"abc+100@gmail.com", "VALID"},
				{"abc", "INVALID"},
				{"abc@.com.my", "INVALID"},
				{"abc123@gmail.a", "INVALID"},
				{"abc123@.com", "INVALID"},
				{"abc123@.com.com", "INVALID"},
				{".abc@abc.com", "INVALID"}, 
				{"abc()*@gmail.com", "INVALID"},
				{"abc@%*.com", "INVALID"},
				{"abc..2002@gmail.com", "INVALID"},
				{"abc.@gmail.com", "INVALID"},
				{"abc@abc@gmail.com", "INVALID"},
				{"abc@gmail.com.1a", "INVALID"},
				{"abc@gmail.com.aa.au", "INVALID"}
		});
	}
	@Test
	public void test()
	{
		UserRegistration u = new UserRegistration();
		String result = u.validateEmailSamples(this.emailTest);
		Assert.assertEquals(this.expectedResult, result);
	}

}
